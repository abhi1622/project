package com.cg.bean;

public class Product {
	int prod_Id;
	String prod_Name;
	String prod_Category;
	int prod_price;
	public int getProd_Id() {
		return prod_Id;
	}
	public void setProd_Id(int prod_Id) {
		this.prod_Id = prod_Id;
	}
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public String getProd_Category() {
		return prod_Category;
	}
	public void setProd_Category(String prod_Category) {
		this.prod_Category = prod_Category;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	@Override
	public String toString() {
		return "Product [prod_Id=" + prod_Id + ", prod_Name=" + prod_Name + ", prod_Category=" + prod_Category
				+ ", prod_price=" + prod_price + "]";
	}
	public Product(int prod_Id, String prod_Name, String prod_Category, int prod_price) {
		super();
		this.prod_Id = prod_Id;
		this.prod_Name = prod_Name;
		this.prod_Category = prod_Category;
		this.prod_price = prod_price;
	}

}
