package com.enoxs.domain;

import java.io.Serializable;

public class UserInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;			// id
	private String account;	// 登錄名
	private String password;	// 密碼
	private String user_name;	// 用戶名
	private String phone;		// 電話
	private String address;		// 地址
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", account=" + account + ", password="
				+ password + ", user_name=" + user_name + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
