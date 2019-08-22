package com.sims.service;

import java.util.List;

import com.sims.pojo.AuditList;

public interface AuditListService {
	int add(AuditList auditList);
	void delete(String no);
	int update(AuditList auditList);
	AuditList get(String no);
	List<AuditList> list();
	int count();
}
