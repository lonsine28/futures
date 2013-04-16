package com.hundsun.futures.service;

import com.hundsun.futures.entity.User;

public interface UserService {
  public User login(User user);
  public User findUserByEmail(String email);
public boolean register(User user);
  
  
}
