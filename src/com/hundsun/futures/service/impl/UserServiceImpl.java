package com.hundsun.futures.service.impl;

import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		User dbuser = userDao.findUserByEmail(user.getEmail());
		if (dbuser == null) {
			return null;
		}
		if (dbuser.getPwd().equals(user.getPwd())) {
			return dbuser;
		} else {
			return null;
		}
	}

}
