package com.hundsun.futures.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.UserMsgDao;
import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;

public class UserMsgDaoImpl extends HibernateDaoSupport implements UserMsgDao {

	public List<User> findAllUser(final int page ,final int pageSize) {
		return (List<User>) this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql="from  User";
				Query query=session.createQuery(hql);
				int begin=(page-1)*pageSize;
				query.setFirstResult(begin);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}

	public List<Admin> findAllAdmin(final int page,final int pageSize) {
return (List<Admin>) this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql="from  Admin";
				Query query=session.createQuery(hql);
				int begin=(page-1)*pageSize;
				query.setFirstResult(begin);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}

	public boolean updateUserById(int id) {
		String hql="from User where id=?";
		List<User> users=this.getHibernateTemplate().find(hql, new Object[]{id});
		if(!users.isEmpty()){
			users.get(0).setState(0);
			this.getHibernateTemplate().update(users.get(0));
			this.getHibernateTemplate().flush();
			return true;
		}else{
			return false;
		}
	}

	public boolean updateUserByUser(User user) {
		String hql="from User where id=?";
		List<User> users=this.getHibernateTemplate().find(hql, new Object[]{user.getId()});
		if(!users.isEmpty()){
			users.get(0).setName(user.getName());
			users.get(0).setEmail(user.getEmail());
			users.get(0).setActive(user.getActive());
			users.get(0).setLevel(user.getLevel());
			users.get(0).setType(user.getType());
			users.get(0).setState(user.getState());
			this.getHibernateTemplate().update(users.get(0));
			this.getHibernateTemplate().flush();
			return true;
		}else{
		   return false;
		}
		
		
	}

}
