package com.hundsun.futures.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.UserMsgDao;
import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;

public class UserMsgDaoImpl extends HibernateDaoSupport implements UserMsgDao {

	public List<User> findAllUser() {
		String hql="from  Admin ";
		this.getHibernateTemplate().find(hql,new Object[]{});
		return null;
	}

	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
