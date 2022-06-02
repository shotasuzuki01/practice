package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String mail;
	private String message;
	public User(String name, String mail, String message) {
		super();
		this.name = name;
		this.mail = mail;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public String getMessage() {
		return message;
	}

}
