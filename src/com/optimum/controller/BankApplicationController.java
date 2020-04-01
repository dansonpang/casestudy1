package com.optimum.controller;

import java.util.Scanner;

import com.optimum.pojo.User;
import com.optimum.service.CaseStudyService;
import com.optimum.service.CaseStudyServiceImpl;

public class BankApplicationController {

	CaseStudyService refCaseStudyService = null; // reference of interface
	private User refUser = null; 				// reference of POJO class 
	
	
	public void userInput() {
	
		refUser = new User(); // call User
		refCaseStudyService = new CaseStudyServiceImpl(); // call CaseStudyServiceImpl
		// prompt user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		String choice = sc.next();
		if (choice.equals("1")) { // call register method
			refCaseStudyService.userRegister(refUser); 
			
		}
		else if (choice.equals("2")) { // call login method
			refCaseStudyService.userLogin(refUser);
		}
		else if (choice.equals("3")) { // call forget password
			refCaseStudyService.userForgetPassword(refUser);
		}
		else if (choice.equals("4")) { 
			System.out.println(" Logout Successfully");
			return; 
		} 
		
		
	} // end of userInput
	
	void BankApplicationControllerLogic() {
		
		// Ask user to input 
		// Assumption  => user already registered and logged in 
		
		refCaseStudyService = new CaseStudyServiceImpl(); // down casting , creating a object through implementation class , takes less memory
		refCaseStudyService.useBankApplication(refUser);  // pass the reference of User (POJO class)
	
		
	} // end of BankApplicationControllerLogic
} // end of BankApplicationController
