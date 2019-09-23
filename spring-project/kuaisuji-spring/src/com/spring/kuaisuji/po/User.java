package com.spring.kuaisuji.po;

import java.util.List;

public class User {
	private int user_id;
	private String user_email;
	private String user_name;
	private String user_password;
	private String user_ip;
	private List<Account> accountList;
	

	public User() {
		super();
	}


	public List<Account> getAccountList() {
		return accountList;
	}


	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public String getUser_ip() {
		return user_ip;
	}


	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}

	
}
