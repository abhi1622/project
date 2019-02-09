package com.cg.miniproject.bean;

public class Mobile {
	private int MobileId;
	private String mobielName;
	private Double mobilePrice;
	private int mobileQuantity;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileId, String mobielName, Double mobilePrice, int mobileQuantity) {
		super();
		MobileId = mobileId;
		this.mobielName = mobielName;
		this.mobilePrice = mobilePrice;
		this.mobileQuantity = mobileQuantity;
	}
	@Override
	public String toString() {
		return "Mobile [MobileId=" + MobileId + ", mobielName=" + mobielName + ", mobilePrice=" + mobilePrice
				+ ", mobileQuantity=" + mobileQuantity + "]";
	}
	public int getMobileId() {
		return MobileId;
	}
	public void setMobileId(int mobileId) {
		MobileId = mobileId;
	}
	public String getMobielName() {
		return mobielName;
	}
	public void setMobielName(String mobielName) {
		this.mobielName = mobielName;
	}
	public Double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(Double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileQuantity() {
		return mobileQuantity;
	}
	public void setMobileQuantity(int mobileQuantity) {
		this.mobileQuantity = mobileQuantity;
	}
    
}
