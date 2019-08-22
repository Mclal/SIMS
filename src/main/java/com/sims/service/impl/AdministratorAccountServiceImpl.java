package com.sims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.mapper.AdministratorAccountMapper;
import com.sims.pojo.AdministratorAccount;
import com.sims.service.AdministratorAccountService;

@Service
public class AdministratorAccountServiceImpl implements AdministratorAccountService {

	@Autowired
	AdministratorAccountMapper administratorAccountMapper;
	
	public int add(AdministratorAccount administratorAccount) {
		return administratorAccountMapper.add(administratorAccount);
	}

	public void delete(String account) {
		administratorAccountMapper.delete(account);
	}

	public int update(AdministratorAccount administratorAccount) {
		return administratorAccountMapper.update(administratorAccount);
	}

	public AdministratorAccount get(String account) {
		return administratorAccountMapper.get(account);
	}

	public List<AdministratorAccount> list() {
		return administratorAccountMapper.list();
	}

	public int count() {
		return administratorAccountMapper.count();
	}

}
