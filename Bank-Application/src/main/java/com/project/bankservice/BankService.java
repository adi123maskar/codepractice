package com.project.bankservice;

import com.project.bankdto.BankDto;

public interface BankService {
	boolean validateBankDto(BankDto dto);
	boolean saveBankDetails(BankDto dto);

}
