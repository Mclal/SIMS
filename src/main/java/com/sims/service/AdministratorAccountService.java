package com.sims.service;

import java.util.List;

import com.sims.pojo.AdministratorAccount;

public interface AdministratorAccountService {
	int add(AdministratorAccount administratorAccount);
	void delete(String account);
	int update(AdministratorAccount administratorAccount);
	AdministratorAccount get(String account);
	List<AdministratorAccount> list();
	int count();
}
