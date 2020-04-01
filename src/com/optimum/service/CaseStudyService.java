package com.optimum.service;

import com.optimum.pojo.User;

public interface CaseStudyService {
	
	void userRegister(User ref);
	void userLogin(User ref);
	void userForgetPassword(User ref);
	void useBankApplication(User ref);
	
	
} // end of CaseStudyService
