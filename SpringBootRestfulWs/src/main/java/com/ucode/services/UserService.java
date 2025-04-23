package com.ucode.services;

import com.ucode.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

	User createUser(User user);
	List<User> getAllUser();
	Optional<User> getUserDetails(int id);
	User updateUserDetails(int id, User user);
	void deleteUser(int id);
}
