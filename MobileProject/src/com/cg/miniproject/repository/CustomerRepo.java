package com.cg.miniproject.repository;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.miniproject.bean.Customer;

public class CustomerRepo {
	private double generateMobileId()
	{
		double a=Math.random();
		return a;
	}
	void CustomerShow() 
	{
		
    Scanner scanner=new Scanner(System.in);
	Customer c=new Customer();
	
	System.out.println("Enter Customer Details");
	System.out.println("-----------------------------------------------------------");
	
	c.setCustomerName(scanner.next());
	c.setMailId(scanner.next());
	c.setPhoneNumber(scanner.nextInt());
	c.setPurchaseId(scanner.nextInt());
	c.setPurchaseDate(LocalDate.now());
	c.setMobileId();
	c.setPurchaseId(generateMobileId());
	
	
	
	
	
	}
	
	
	
	
}
