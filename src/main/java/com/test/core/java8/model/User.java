package com.test.core.java8.model;

public class User {

	public User(String name, String nickName) {
		super();
		this.name = name;
		this.nickName = nickName;
	}

	private String name;
	private String nickName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", nickName=" + nickName + "]";
	}

}
