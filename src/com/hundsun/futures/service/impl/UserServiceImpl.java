package com.hundsun.futures.service.impl;

import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;
import com.hundsun.futures.util.MD5Util;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		try {
			user.setPwd(MD5Util.encode(user.getPwd()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
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

	public User findUserByEmail(String email) {
		User dbuser = userDao.findUserByEmail(email);
		return dbuser;
	}

	public boolean register(User user) {
		boolean isok=false;
		String password=user.getPwd().trim();
		try {
			System.out.println("加密后的密码："+MD5Util.encode(password));
			user.setPwd(MD5Util.encode(password));
			user.setType(1);//表示网站注册的用户
			user.setLevel(1);//表示网站注册
			user.setState(1);//表示正常状态
			isok=userDao.addUser(user);
			return isok;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return isok;
		}
	}

}
