/**
 * 
 */
package com.black.cat.client.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.black.cat.client.user.entity.UserDocument;
import com.black.cat.client.user.model.User;
import com.black.cat.client.user.repo.UserRepository;

import lombok.RequiredArgsConstructor;

/**
 * Jun 29, 2020
 *
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepo;

	@Override
	public Collection<User> getAllUser() {
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(e->{
			User user=User.builder().emailId(e.getEmailId())
					.id(e.getId().toHexString())
					.mobileNo(e.getMobileNo())
					.password(e.getPassword())
					.role(e.getRole()).build();		
			users.add(user);
		});
		return users;
	}
	
	@Override
	public void saveUser(User user) {
		UserDocument entity = UserDocument.builder()
				.active(true).emailId(user.getEmailId())
				.id(ObjectId.get()).mobileNo(user.getMobileNo())
				.password(user.getPassword()).role(user.getRole()).build();
		userRepo.save(entity);
	}

}
