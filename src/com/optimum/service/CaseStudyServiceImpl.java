package com.optimum.service;

import java.util.Scanner;

import com.optimum.dao.BankDAOImpl;
import com.optimum.dao.BankDAOInterface;
import com.optimum.pojo.User;

public class CaseStudyServiceImpl implements CaseStudyService{
	
	BankDAOInterface refBankDaoInterface = null;
	
	int withdrawAmount;
	String newEmail;
	String password;
	String password2;
	String colour;
	int depositAmount;
	String choice2;
	
	public CaseStudyServiceImpl() {
		
		refBankDaoInterface = new BankDAOImpl(); // ref of BankDAOImpl

	} // end of CaseStudyServiceImpl
	

	@Override
	public void userRegister(User refUser) {
		
		// we need to call BankDAOImpl
		System.out.println("Enter email address:");
		Scanner sc = new Scanner(System.in);
		newEmail = sc.nextLine();
		
		// assign user email to refUser if address is not the following:
		if (!(newEmail.equals("xyz@gmail.com"))) {
			refUser.setUserID(newEmail);
			
		} 
		else
		{
			System.out.println("Email already exists");
			System.out.println("Enter email address:");
			newEmail = sc.nextLine();
			
		}
		
		// Registering Password
		System.out.println("Enter Password : ");
		password =sc.nextLine();
		System.out.println("Re-type Password : ");
		password2 =sc.nextLine();
		// check if both passwords are matching
	if ((password.equals(password2))) {
		refUser.setPassword(password);
	
	}
	else {
		System.out.println("Password doesn't match !");
		System.out.println("Re-type Password : ");
		password2 =sc.nextLine();
		refUser.setPassword(password);
	}
		System.out.println("What is your favorite colour?");
		colour = sc.next();
		refUser.setSecurityKey(colour);
		refBankDaoInterface.register(refUser);
	}
		
		
	

	@Override
	public void userLogin(User refUser) {
		
		// we need to call BankDAOImpl
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email address:");
		newEmail = sc.nextLine();
		System.out.println("Enter Password : ");
		password =sc.nextLine();
		
		refBankDaoInterface.userLogin(refUser);
		useBankApplication(refUser);
	} // end of userLogin

	@Override
	public void userForgetPassword(User refUser) {
		
		// we need to call BankDAOImpl
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID: ");
		sc.nextLine();
		System.out.println("Enter security key :"); 
		String colour = sc.nextLine();
		
		System.out.println("Enter new Password : ");
		password =sc.nextLine();
		System.out.println("Re-type new Password : ");
		password2 =sc.nextLine();
	
		if ((password.equals(password2))) {
			refUser.setPassword(password);
		}
		else {
			System.out.println("Password doesn't match !");
			System.out.println("Re-type Password : ");
			password2 =sc.nextLine();
			refUser.setPassword(password);
		}
		System.out.println("What is your favorite colour?");
		colour = sc.next();
		refUser.setSecurityKey(colour);
		
	} // end of userForgetPassword

	@Override
	public void useBankApplication(User refUser) {
		
		do {
			System.out.println();
			System.out.println("Type 1 : Check account balance");
			System.out.println("Type 2 : Deposit");
			System.out.println("Type 3 : Withdraw");
			System.out.println();
			System.out.println("enter your choice");
			
			Scanner sc = new Scanner(System.in);
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1 : // check bank balance
				refBankDaoInterface.checkBalance();
				break;
				
			case 2: // deposit 
				System.out.println("Enter amount");
				depositAmount = sc.nextInt();
				
				if (depositAmount < 0) {
					System.out.println("Amount can't be negative");
					System.out.println("Enter amount");
					depositAmount =sc.nextInt();
				}
				
				System.out.println();
				
				refUser.setAmount(depositAmount);
		
				refBankDaoInterface.deposit(refUser);
				break;
				
			case 3: // withdraw
				System.out.println("Enter amount");
				withdrawAmount =sc.nextInt();
		
				refUser.setAmount(withdrawAmount); // 
				refBankDaoInterface.withdraw(refUser);
				break;
				
			default: 
				System.out.println("Choice not available!!");
				break;
			} // end of switch

			System.out.println("Wish to continue (y/n) :");
			choice2 = sc.next();
		} while (choice2.equals("y"));
		
	}
	
	
}
