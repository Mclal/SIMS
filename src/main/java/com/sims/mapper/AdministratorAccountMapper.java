package com.sims.mapper;

import java.util.List;

import com.sims.pojo.AdministratorAccount;

public interface AdministratorAccountMapper {
	public int add(AdministratorAccount administratorAccount);
	public void delete(String account);
	public int update(AdministratorAccount administratorAccount);
	public AdministratorAccount get(String account);
	public List<AdministratorAccount> list();
	public int count();
}
