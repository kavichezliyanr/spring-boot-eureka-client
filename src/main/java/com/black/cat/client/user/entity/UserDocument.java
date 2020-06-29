/**
 * 
 */
package com.black.cat.client.user.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

/**
 * Jun 29, 2020
 *
 */
@Document
@Data
@Builder
public class UserDocument implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ObjectId id;
	
	private String username;
	
	private String password;
	
	private String emailId;
	
	private Long mobileNo;
	
	private String role;
	
	private boolean active;

}
