/**
 * 
 */
package com.hundsun.futures.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.ColumnDao;
import com.hundsun.futures.entity.Column;

/**
 * @author jinyb09017
 *
 */
public class ColumnDaoImpl extends HibernateDaoSupport implements ColumnDao {

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#save(com.hundsun.futures.entity.Column)
	 */
	public void save(Column column) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(column);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#delete(java.lang.Integer)
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		if(queryById(id)!=null)
		this.getHibernateTemplate().delete(queryById(id));

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#queryById(java.lang.Integer)
	 */
	public Column queryById(Integer id) {
		// TODO Auto-generated method stub
		return (Column) this.getHibernateTemplate().get(Column.class, id);//�Ҳ������򷵻ؿգ���load����׳�һ���쳣
		//,����load����session��������ң����û�У�����sessionfactory������ң������ִ��sql���ң���getֻ��һ�����Һ󣬲������������ң��Ҳ�������ִ��sql��䡣
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#update(com.hundsun.futures.entity.Column)
	 */
	public void update(Column column) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(column);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#queryList()
	 */
	@SuppressWarnings("unchecked")
	public List<Column> queryList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Column");
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ColumnDao#queryByCondition(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Column> queryByCondition(String condition) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(condition);
	}

}
