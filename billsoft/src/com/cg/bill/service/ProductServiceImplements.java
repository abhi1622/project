package com.cg.bill.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.bean.Product;
import com.cg.bill.Exception.InvalidCodeException;
import com.cg.bill.Exception.ProductCodeIsNotValid;
import com.cg.billsoft.dao.IProductDao;
import com.cg.billsoft.dao.ProductDao;

public class ProductServiceImplements implements IProductService {
    IProductDao dao=new ProductDao();
	@Override
	public Product getProductDetails(int prod_Id)throws ProductCodeIsNotValid, InvalidCodeException {
		if( product_CodeValidation( prod_Id) )
		{
			return dao.getProductDetails(prod_Id);
		}
		else
			throw new ProductCodeIsNotValid("product code should be 4 digit");
	}
	 public boolean product_CodeValidation(int prod_Code) 
	{  
		 Pattern pattern=Pattern.compile("[0-9]{4}");
	    String string=String.valueOf(prod_Code);
	    Matcher m=pattern.matcher(string);
	    
		return m.matches();
	}
	boolean quantityValidation(int qty)
	{
		
		if(qty>=0&&qty<5)
			return true;
		else
			 return false;
	}

}
