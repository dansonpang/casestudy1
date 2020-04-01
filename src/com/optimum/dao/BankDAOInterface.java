package com.optimum.dao;

import com.optimum.pojo.User;

public interface BankDAOInterface {
	void checkBalance();
	void deposit(User refUser);
	void withdraw(User refUser);
	
	void register(User refUser);
	void forgetPassword(User refUser);
	void userLogin(User refUser);
	
	
} // end of BankDAOInterface
