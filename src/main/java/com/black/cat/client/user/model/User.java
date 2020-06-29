package com.black.cat.client.user.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String username;
	
	private String emailId;
	
	private String password;
	
	private Long mobileNo;
	
	private String role; 
	
	

}
