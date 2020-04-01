package com.optimum.application;

import java.util.Scanner;

import com.optimum.controller.BankApplicationController;

public class CaseStudyApplication {

	public static void main(String[] args) { 
		
		BankApplicationController refBankApplicationController  = new BankApplicationController(); // ref of BankApplicationController
		String choice; // declare variable for user input
		
		do { 
			
			System.out.println("User Home Page :"); 
			System.out.println("1.Register");  
			System.out.println("2.Login"); 
			System.out.println("3.Forgot Password");
			System.out.println("4.Logout (exit)");
			System.out.println();
			
			// prompts for user input
			Scanner sc = new Scanner(System.in);
			refBankApplicationController.userInput(); 
			System.out.println("Wish to continue? (y/n) : ");
			choice = sc.next();
		

		} // end of do
		while(choice.equals( "y"));
		
		System.out.println("Thanks for Banking with Us !!!");
		

	} // end of main

} // end of CaseStudyApplication
