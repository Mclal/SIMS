package com.sims.mapper;

import java.util.List;

import com.sims.pojo.AuditList;

public interface AuditListMapper {
	public int add(AuditList auditList);
	public void delete(String no);
	public int update(AuditList auditList);
	public AuditList get(String no);
	public List<AuditList> list();
	public int count();
}
