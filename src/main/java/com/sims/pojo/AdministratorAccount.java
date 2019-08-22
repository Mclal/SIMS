package com.sims.pojo;

public class AdministratorAccount {
	private String account;
	private String password;
	public AdministratorAccount(String account, String password) {
		this.account = account;
		this.password = password;
	}
	public AdministratorAccount(){}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return ("[AdministratorAccount] account:"+ this.account + "\tpassword:" + this.password); 
	}
}
