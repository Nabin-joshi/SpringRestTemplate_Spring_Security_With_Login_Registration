package com.RestService.service;

import java.util.List;
import java.util.Optional;


import com.RestService.model.Role;
import com.RestService.model.User;

/**
 * 
 * @author Umesh Bhujel
 *
 */
public interface UserService {
	Optional<User> getUserByUsername(String username);
	User getUserById(int userId);
	int addUser(User user, int roleId);

	List<Role> getAllRole();




}