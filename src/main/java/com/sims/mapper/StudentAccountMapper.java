package com.sims.mapper;

import java.util.List;

import com.sims.pojo.StudentAccount;

public interface StudentAccountMapper {
	public int add(StudentAccount studentAccount);
	public void delete(String account);
	public int update(StudentAccount studentAccount);
	public StudentAccount get(String account);
	public List<StudentAccount> list();
	public int count();
}
