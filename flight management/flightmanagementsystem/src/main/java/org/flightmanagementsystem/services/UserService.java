package org.flightmanagementsystem.services;

import java.util.List;

import org.flightmanagementsystem.model.User;

public interface UserService {
    
	//For creating:
    User createUser(User newUser);
    //Update:
    User updateUser(User newUser, long UserId);
    //Delete:
    void deleteUser(long UserId);
    //Get all:
    List<User>displayAllUser();
    //Get by id:
    User findUserById(long UserId);
}
