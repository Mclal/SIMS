package com.sims.mapper;

import java.util.List;

import com.sims.pojo.StudentInfo;

public interface StudentInfoMapper {
	public int add(StudentInfo studentInfo);
	public void delete(String no);
	public int update(StudentInfo studentInfo);
	public StudentInfo get(String no);
	public List<StudentInfo> list();
	public int count();
}
