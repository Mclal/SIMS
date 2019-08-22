package com.sims.service;

import java.util.List;

import com.sims.pojo.StudentInfo;

public interface StudentInfoService {
	int add(StudentInfo studentInfo);
	void delete(String no);
	int update(StudentInfo studentInfo);
	StudentInfo get(String no);
	List<StudentInfo> list();
	int count();
}
