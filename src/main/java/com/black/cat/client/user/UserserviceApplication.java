package com.black.cat.client.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.black.cat.client.user.model.User;
import com.black.cat.client.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@Slf4j
public class UserserviceApplication implements CommandLineRunner { 
	
	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		User user = User.builder().emailId("k@g.com")
				.username("username").password("password")
				.mobileNo(1234567890l).role("U").build();
		userService.saveUser(user);
		log.info("created user successfully- {}",user.getUsername());
		User user1 = User.builder().emailId("k1@g.com")
				.username("username1").password("password1")
				.mobileNo(1234567891l).role("A").build();
		userService.saveUser(user1);
		log.info("created user successfully- {}",user1.getUsername());
	}

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
