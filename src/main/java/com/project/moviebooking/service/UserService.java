package com.project.moviebooking.service;


import com.project.moviebooking.entity.User;

public interface UserService {
	User saveUser(User user);
    User getUserByEmailAndPassword(String username, String password);
}
