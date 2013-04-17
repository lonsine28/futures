package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.UserMsgDao;
import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserMsgService;

public class UserMsgServiceImpl implements UserMsgService {
    private UserMsgDao userMsgDao;
	public List<Admin> findAdmin(int page, int pageSize) {
		
		return userMsgDao.findAllAdmin(page, pageSize);
	}

	public List<User> findUser(int page, int pageSize) {
		return userMsgDao.findAllUser(page, pageSize);
	}

	public void setUserMsgDao(UserMsgDao userMsgDao) {
		this.userMsgDao = userMsgDao;
	}

	public boolean updateUserById(int id) {
		
		return userMsgDao.updateUserById(id);
	}

	public boolean updateUserByUser(User user) {
		// TODO Auto-generated method stub
		return userMsgDao.updateUserByUser(user);
	}

}
