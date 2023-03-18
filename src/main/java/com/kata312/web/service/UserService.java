package com.kata312.web.service;


import com.kata312.web.models.User;

import java.util.List;

public interface UserService {
public List<User> getAllUsers();
public User getUser(int id);
public void saveUser(User user);
public void updateUser(User user);
public void deleteUser(int id);
}
