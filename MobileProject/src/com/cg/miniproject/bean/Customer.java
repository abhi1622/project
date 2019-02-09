package com.cg.miniproject.bean;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
	private String customerName;
	private String mailId;
	private int phoneNumber;
	private int mobileId;
	private double purchaseId;
	private LocalDate purchaseDate;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public double getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(double purchaseId) {
		this.purchaseId = purchaseId;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate localDate) {
		this.purchaseDate = localDate;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mailId=" + mailId + ", phoneNumber=" + phoneNumber
				+ ", mobileId=" + mobileId + ", purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + "]";
	}
	public Customer(String customerName, String mailId, int phoneNumber, int mobileId, int purchaseId,
			LocalDate purchaseDate) {
		super();
		this.customerName = customerName;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
		this.mobileId = mobileId;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
