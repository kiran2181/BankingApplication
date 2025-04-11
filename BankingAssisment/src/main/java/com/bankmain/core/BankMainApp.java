package com.bankmain.core;

import java.util.Scanner;

import com.bankfun.core.BankFun;
import com.banksetget.core.Banksetget;

public class BankMainApp {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		BankFun bfunobj = new BankFun();

		Banksetget bobj = new Banksetget("MHBank@123", 12345);

		System.out.println("Welecome to Maharashtra Bank.....!!!");

		boolean flag = false;

		do {

			System.out.println("\n Please Enter username or Password....!!");

			System.out.println("Enter a Username :");
			String bnkusername = sobj.next();

			System.out.println("Enter a Password...!!!!");
			long bnkpass = sobj.nextLong();

			if (bobj.getBankcusteruser().equals(bnkusername) && bobj.getBankcustpass() == bnkpass) {
				System.out.println("Login Successfully.....!!!!");
				flag = false;

			} else {
				System.out.println("InCorrect Username & Password.....!!");
				flag = true;
			}

		} while (flag);

		do {

			System.out.println("\n Please Choice Functionality...!!!");

			System.out.println("1) Add Customer :");
			System.out.println("2) Customer Details :");
			System.out.println("3) Deposit Amount :");
			System.out.println("4) Check Balance :");
			System.out.println("5) Withdraw Amount :");
			System.out.println("6) Transfer Amount :");
			System.out.println("7) Add Customer :");
			System.out.println("8) Logout :");

			System.out.println("Choice :");
			int ch = sobj.nextInt();

			switch (ch) {

			case 1:

				bfunobj.AddCustomer();

				break;

			case 2:

				bfunobj.AccountDetail();

				break;

			case 3:

				bfunobj.deposit();

				break;

			case 4:
				bfunobj.checkBalance();
				break;

			case 5:
				bfunobj.withdraw();
				break;

			case 6:
				bfunobj.transferamt();
				break;

			case 7:
				bfunobj.AddCustomer();
				break;
			case 8:
				bfunobj.logout();
				break;

			default:
				System.out.println("Invalid Choice :");
				break;
			}

		} while (true);

	}

}
