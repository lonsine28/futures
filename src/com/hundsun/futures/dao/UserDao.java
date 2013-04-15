package com.hundsun.futures.dao;

import com.hundsun.futures.entity.User;

public interface UserDao {
  public boolean addUser(User user);
  public boolean deleteUserByNo(int uno);
  public User findUserByUno(int no);
  public User findUserByEmail(String email);
}
