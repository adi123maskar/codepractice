package com.project.bankentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bank")
public class Bank {
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name="abc",strategy = "increment")
	private int slNo;
	@Column(name="BANK_NAME")
	private String bankName;
	@Column(name="LOCATION")
	private String location;
	@Column(name="CONTACT_NUMBER")
	 private String contactNumber;
	@Column(name="BRANCH")
	 private String branch;
	@Column(name="IFSC_CODE")
	 private String ifscCode;
	 
	 
	 public Bank() {
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

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", location=" + location + ", contactNumber=" + contactNumber
				+ ", branch=" + branch + ", ifscCode=" + ifscCode + ", slNo=" + slNo + "]";
	}

	public Bank(String bankName, String location, String contactNumber, String branch, String ifscCode, int slNo) {
		super();
		this.bankName = bankName;
		this.location = location;
		this.contactNumber = contactNumber;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.slNo = slNo;
	}
	 
}
