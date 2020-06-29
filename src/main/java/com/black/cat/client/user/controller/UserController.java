/**
 * 
 */
package com.black.cat.client.user.controller;

import java.util.Collection;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.black.cat.client.user.model.User;
import com.black.cat.client.user.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * Jun 29, 2020
 *
 */
@RestController
@RefreshScope
@RequestMapping
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping
	ResponseEntity<Collection<User>> getAllUsers(){
		return ResponseEntity.ok().body(userService.getAllUser());
	}
	
	

}
