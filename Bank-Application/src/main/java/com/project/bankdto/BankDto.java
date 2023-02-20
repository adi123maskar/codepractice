package com.project.bankdto;

public class BankDto {
	private String bankName;
	private String location;
	 private String contactNumber;
	 private String branch;
	 private String ifscCode;
	 
	 public BankDto() {
		// TODO Auto-generated constructor stub
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "BankDto [bankName=" + bankName + ", location=" + location + ", contactNumber=" + contactNumber
				+ ", branch=" + branch + ", ifscCode=" + ifscCode + "]";
	}

	public BankDto(String bankName, String location, String contactNumber, String branch, String ifscCode) {
		super();
		this.bankName = bankName;
		this.location = location;
		this.contactNumber = contactNumber;
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	 

}
