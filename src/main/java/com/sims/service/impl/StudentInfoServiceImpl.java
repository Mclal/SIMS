package com.sims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.mapper.StudentInfoMapper;
import com.sims.pojo.StudentInfo;
import com.sims.service.StudentInfoService;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	StudentInfoMapper studentInfoMapper;
	
	public int add(StudentInfo studentInfo) {
		return studentInfoMapper.add(studentInfo);
	}

	public void delete(String no) {
		studentInfoMapper.delete(no);
	}

	public int update(StudentInfo studentInfo) {
		return studentInfoMapper.update(studentInfo);
	}

	public StudentInfo get(String no) {
		return studentInfoMapper.get(no);
	}

	public List<StudentInfo> list() {
		return studentInfoMapper.list();
	}

	public int count() {
		return studentInfoMapper.count();
	}

}
