package com.project.bankcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.bankdto.BankDto;
import com.project.bankservice.BankService;

@Component
@RequestMapping("/")
public class BankController {
	
	@Autowired
	private BankService service;

	public BankController() {
		System.out.println("object is created:"+this.getClass().getName());
	}
	@RequestMapping("/save.do")
	public String save(@ModelAttribute BankDto bankDto,Model model) {
		System.out.println("Involked save()");
		if (this.service.validateBankDto(bankDto)) {
			boolean isSaved=this.service.saveBankDetails(bankDto);
			if (isSaved) {
				model.addAttribute("Name",bankDto.getBankName());
				model.addAttribute("Location",bankDto.getLocation());
				model.addAttribute("ContactNumber",bankDto.getContactNumber());
				model.addAttribute("Branch",bankDto.getBranch());
				model.addAttribute("IfscCode",bankDto.getIfscCode());
				model.addAttribute("validateMessage","Data is saved succesfully");
			}
			
		} else {
            model.addAttribute("Invalidate message", "Invalid Data.....please check it once..");
		}
		
	
		return "/WEB-INF/pages/BankDetails.jsp";
	}
	@RequestMapping("/update.do")
	public void update() {
		System.out.println("Involked update()");
	}
	@RequestMapping("/delete.do")
	public void delete() {
		System.out.println("Involked delete()");
	}
}
