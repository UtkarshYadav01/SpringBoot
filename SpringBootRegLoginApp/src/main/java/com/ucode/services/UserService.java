package com.ucode.services;

import com.ucode.entities.User;

public interface UserService {

	public boolean registerUser(User user);
	User loginUser(String email, String password);

}
