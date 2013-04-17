package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;

public interface UserMsgDao {
  public List<User> findAllUser();
  public List<Admin> findAllAdmin();
}
