package com.sims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.mapper.StudentAccountMapper;
import com.sims.pojo.StudentAccount;
import com.sims.service.StudentAccountService;

@Service
public class StudentAccountServiceImpl implements StudentAccountService {

	@Autowired
	StudentAccountMapper studentAccountMapper;
	
	public int add(StudentAccount studentAccount) {
		return studentAccountMapper.add(studentAccount);
	}

	public void delete(String account) {
		studentAccountMapper.delete(account);
	}

	public int update(StudentAccount studentAccount) {
		return studentAccountMapper.update(studentAccount);
	}

	public StudentAccount get(String account) {
		return studentAccountMapper.get(account);
	}

	public List<StudentAccount> list() {
		return studentAccountMapper.list();
	}

	public int count() {
		return studentAccountMapper.count();
	}

}
