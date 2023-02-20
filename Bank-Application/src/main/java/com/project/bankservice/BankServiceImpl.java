package com.project.bankservice;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;


import com.project.bankdao.BankDao;
import com.project.bankdto.BankDto;
import com.project.bankentity.Bank;


public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bankDao;
	public BankServiceImpl() {
		System.out.println("Object is created:"+this.getClass().getName());
	}

	@Override
	public boolean validateBankDto(BankDto dto) {
		System.out.println("Involked validateDto()");
		boolean flag=false;
		
		if (dto.getBankName()!=null &&! dto.getBankName().isEmpty()) {
			flag=true;
			
		} 
		else {
      flag=false;
      System.out.println("Bank Name is Invalid");
      return flag;
		}
		
		if (dto.getLocation()!=null &&! dto.getLocation().isEmpty()) {
			flag=true;
			
		} else {
			flag=false;
			System.out.println("BANK location is invalid");
           return flag;
		}
		
		if (dto.getContactNumber()!=null &&! dto.getContactNumber().isEmpty()) {
			flag=true;
			
		} else {
			flag=false;
			System.out.println("Bank contact number is invalid");
			return flag;
		}
		
		if (dto.getBranch()!=null &&! dto.getBranch().isEmpty()) {
			flag=true;
			
		} else {
           flag=false;
           System.out.println("Bank branch is invalid");
           return flag;
		}
		
		if (dto.getIfscCode()!=null &&! dto.getIfscCode().isEmpty()) {
			flag=true;
			
		} else {
			flag=false;
			System.out.println("Bank Ifsc code is invalid");
			return flag;
		}
	
		
		return flag;
	}

	@Override
	public boolean saveBankDetails(BankDto dto) {
		System.out.println("BankServiceImpl.saveBankDetailsDto()");
		Bank bank=new Bank();
		BeanUtils.copyProperties(dto,bank);
		boolean result=this.bankDao.saveBankDetails(bank);
		System.out.println("Add bank details result:"+result);
		return result;
	
	}

}
