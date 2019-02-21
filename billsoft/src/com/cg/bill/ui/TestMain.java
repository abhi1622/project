package com.cg.bill.ui;

import java.util.Scanner;

import com.cg.bean.Product;
import com.cg.bill.service.IProductService;
import com.cg.bill.service.ProductServiceImplements;

public class TestMain {

	public static void main(String[] args){
		
		 private static Scanner scanner=new Scanner(System.in);
		IProductService ser=new ProductServiceImplements();
		
			showMenu();
	}
	
		private static void showMenu() {
			int choice;
			while(true)
			{
		      System.out.println("enter \n 1.Generate Bill \n2.Exit");
		      choice=scanner.nextInt();
		      
		      switch(choice)
		      {
		       
		
		case 1:
			     int Generatebill();
		             break;
		case 2:
			     System.exit(0);
			        break;
		}

	}

}
		
		int Generatebill()
		{  
			System.out.println("enter product code");
			int prod_Code=scanner.nextInt();
			if(ser.prod_CodeValidation()&&ser.quantityValidation())
				int price=quantity*pr
			{
				
			}
		}
			return 
		}
