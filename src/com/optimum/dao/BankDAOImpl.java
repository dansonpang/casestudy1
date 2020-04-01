package com.optimum.dao;

import com.optimum.pojo.User;

public class BankDAOImpl implements BankDAOInterface {

	static int balanceamount = 0; // declare variable for balance amount
	
	@Override
	public void checkBalance() {
	System.out.println("Current Balance : " + balanceamount);	

	} // end of checkBalance

	@Override
	public void deposit(User refUser) { // get the user input 
		
		balanceamount += refUser.getAmount(); // add deposit amount to balance
		System.out.println(refUser.getAmount() + " dollar deposited successfully!!"); 
		
	} // end of deposit

	@Override
	public void withdraw(User refUser) {
		
		if(refUser.getAmount() < balanceamount) // withdraw amount cannot be greater than current available balance
		{
		balanceamount -= refUser.getAmount() ; // update balance after deduction through withdrawal
		System.out.println("Transaction Successful!!");
		} 
		else
		{
			System.out.println("Sorry!! Insufficient balance. ");
		}
		
	} // end of withdraw

	@Override
	public void register(User refUser) {
		// TODO Auto-generated method stub
		System.out.println(refUser.getSecurityKey() + " is your security key in case if you forget your password ");
		System.out.println();
		System.out.println("Registration Successful!!");
	} // end of register

	

	@Override
	public void userLogin(User refUser) {
		// TODO Auto-generated method stub
		System.out.println("Login Successful!!");
		
	} // end of userLogin
	
	@Override
	public void forgetPassword(User refUser) {
		// TODO Auto-generated method stub
		System.out.println(refUser.getSecurityKey() + " is your security key in case if you forget your password ");
	
	} // end of forgetPassword


} // end of BankDAOImpl
