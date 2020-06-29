/**
 * 
 */
package com.black.cat.client.user;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.black.cat.client.user.model.User;
import com.black.cat.client.user.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * Jun 29, 2020
 *
 */
@Component
@RequiredArgsConstructor
public class ApplicationRunner implements ApplicationListener<ApplicationEvent> {
	
	private final UserService userService;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		User user = User.builder().emailId("k@g.com")
				.username("username").password("password")
				.mobileNo(1234567890l).role("U").build();
		userService.saveUser(user);
		User user1 = User.builder().emailId("k1@g.com")
				.username("username1").password("password1")
				.mobileNo(1234567891l).role("A").build();
		userService.saveUser(user1);
	}

}