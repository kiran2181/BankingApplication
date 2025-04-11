package com.bankfun.core;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class BankFun {
	
	Scanner sobj = new Scanner(System.in);
	
	double currentBalance = 10000;
	int amount;
	long accno = 47811544;
	String accHoldername = "Kiran";
	String acctype = "Saving";
	String bankname = "MHBank";
	
	String accountname[] = new String[100];
	double accountBalance[] = new double[100];
	int size = 0;
	long accountnum;
	
	public void AddCustomer()
	{
		
//		System.out.println("\n Add Cutomer :");
//		
//		System.out.println("Account Number :");
//		
//        System.out.print("\nEnter Customer Name: ");
//        String name = sobj.nextLine();
//        accountname[size] = name;
//        System.out.print("Enter Opening Balance Amount: ");
//        double amt = sobj.nextDouble();
//        accountBalance[size] = amt;
//
//        System.out.println("Account created successfully. \n");
//        System.out.println("Account Details:- \n ");
//        System.out.println("Account Number: " + (size));
//        System.out.println("Account Name:" + accountname[size]);
//        System.out.println("Account Balance: " + accountBalance[size] + " Rs \n");
//        size = size+1;
        
       
			System.out.println("Chooes Account type :");
			System.out.println("1) Salary Account :");
			System.out.println("2) Saving Account :");
			System.out.println("3) Current Account :");

			System.out.println("Enter Choice :");
			int chh = sobj.nextInt();
			sobj.nextLine();

			System.out.println("Enter Account Number :");
			accountnum = sobj.nextLong();

			System.out.println("Enter a Name :");
			String name = sobj.next();
			accountname[size] = name; 

			System.out.println("Enter Account Balance :");
			double addbalance = sobj.nextDouble();
			accountBalance[size] = addbalance;

			System.out.println("Account create Successfully...!!!");
			System.out.println("Account Number :"+(size));
			System.out.println("Holder Name :"+accountname[size]);
			System.out.println("Account Balance :"+accountBalance[size]);

			size++;
	}
	
	public void Showdetail()
	{
		System.out.println("Account create Successfully...!!!");
		System.out.println("Account Number :"+(size));
		System.out.println("Holder Name :"+accountname[size]);
		System.out.println("Account Balance :"+accountBalance[size]);
	}
	
	public void AccountDetail()
	{
		Scanner ssobj = new Scanner(System.in);
//		System.out.println("Customer Account Details :");
//		System.out.println("Account No :"+accno);
//		System.out.println("Holder Name :"+accHoldername);
//		System.out.println("Account Type :"+acctype);
//		System.out.println("Bank Name :"+bankname);
		System.out.println("Enter Account Number :");
		long accnum = sobj.nextLong();
		
		if(accnum == accountnum)
		{
			System.out.println("Account create Successfully...!!!");
			System.out.println("Account Number :"+(size));
			System.out.println("Holder Name :"+accountname[size]);
			System.out.println("Account Balance :"+accountBalance[size]);
		}
		else {
			System.out.println("Not Exist Account Number....!!!");
		}
		
		System.out.println();
		
	}
	
	public void deposit()
	{
		System.out.println("Enter deposit Amount :");
		
		amount = sobj.nextInt();
		currentBalance += amount;
		System.out.println(currentBalance);
		System.out.println("Deposit amount successfully...!!!");
		
	}
	
	public void checkBalance()
	{
		System.out.println("Current Balance :"+currentBalance);
	}
	
	public void withdraw()
	{
		System.out.println("Enter widthdraw amount :");
		
		amount = sobj.nextInt();
		
		if(currentBalance >= amount)
		{
			currentBalance -= amount;
			System.out.println(currentBalance);
			System.out.println("Withdraw Amount Successfully...!!");
		}
		else {
			System.out.println("Insuficient Balance....!!!");
		}
	
	}
	
	public void transferamt() 
	{
		
		int genrateotp,otp;
		
		System.out.println("Enter Amount :");
		amount = sobj.nextInt();
		
		if(currentBalance >= amount)
		{
			genrateotp = genratedotp();
			System.out.println("Enter a OTP :"+genrateotp);
			otp = sobj.nextInt();
			if(otp == genrateotp)
			{
				System.out.println("Current Balance :"+currentBalance);
				System.out.println("Amount Transfer Successfully...!!!");
			}
			else {
				System.out.println("Incorrect OTP,Please try again...!!!");
			}
		}
		else {
			System.out.println("Insuficient Funds...!!!");
		}
	}
	
	public void logout()
	{
		System.out.println("Logout Successfully....!!!");
		System.exit(0);
	}
	
	
	
	int genratedotp()
	{
		return (int) (Math.random()*9000+1000);
	}
}
