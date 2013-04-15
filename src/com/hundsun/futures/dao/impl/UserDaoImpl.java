package com.hundsun.futures.dao.impl;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			this.getHibernateTemplate().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	public boolean deleteUserByNo(int uno) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findUserByUno(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByEmail(String email) {
		String hql="from User u where u.emial=?";
		User user=(User)this.getHibernateTemplate().find(hql,new Object[]{email}).get(0);
		
		return user;
	}

}
