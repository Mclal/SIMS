package com.sims.service;

import java.util.List;

import com.sims.pojo.StudentAccount;

public interface StudentAccountService {
	int add(StudentAccount studentAccount);
	void delete(String account);
	int update(StudentAccount studentAccount);
	StudentAccount get(String account);
	List<StudentAccount> list();
	int count();
}
