package com.sims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.mapper.AuditListMapper;
import com.sims.pojo.AuditList;
import com.sims.service.AuditListService;

@Service
public class AuditListServiceImpl implements AuditListService {

	@Autowired
	AuditListMapper auditListMapper;
	
	public int add(AuditList auditList) {
		return auditListMapper.add(auditList);
	}

	public void delete(String no) {
		auditListMapper.delete(no);
	}

	public int update(AuditList auditList) {
		return auditListMapper.update(auditList);
	}

	public AuditList get(String no) {
		return auditListMapper.get(no);
	}

	public List<AuditList> list() {
		return auditListMapper.list();
	}

	public int count() {
		return auditListMapper.count();
	}

}
