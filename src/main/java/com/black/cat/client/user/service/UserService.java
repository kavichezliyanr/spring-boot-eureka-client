/**
 * 
 */
package com.black.cat.client.user.service;

import java.util.Collection;
import java.util.List;

import com.black.cat.client.user.model.User;

/**
 * Jun 29, 2020
 *
 */
public interface UserService {
	
	/**
	 * Gets the all user.
	 *
	 * @return the all user
	 */
	Collection<User> getAllUser();

	void saveUser(User user);

}
