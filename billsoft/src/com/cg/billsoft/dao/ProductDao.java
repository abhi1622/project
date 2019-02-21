package com.cg.billsoft.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Product;
import com.cg.bill.Exception.InvalidCodeException;
import com.cg.bill.util.CollectionUtil;

public class ProductDao implements IProductDao {
	Map<Integer,Product> products=new HashMap<Integer,Product>();
	CollectionUtil collection=new CollectionUtil();
	products=collection.getList();

	@Override
	public Product getProductDetails(int prod_Id) throws InvalidCodeException{
		 products=collection.getList();
		for(Map.Entry<Integer, Product>product:products.entrySet())
			
		{  if(product.getKey()==prod_Id)
		{
			return products.get(product.getKey());
		}
			
			
			
		}
		
		
		throw new InvalidCodeException("not valid product code");
	}

}
