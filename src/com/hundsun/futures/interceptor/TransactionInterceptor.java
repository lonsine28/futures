package com.hundsun.futures.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TransactionInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 8224624556642546385L;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		try {
			//DbPoolUtil.getConnection().setAutoCommit(false);
			System.out.println("���￪ʼ");
			invocation.invoke();
			//DbPoolUtil.getConnection().commit();
			//HibernateUtil.closeSession();
			System.out.println("�����ύ");
		} catch (Exception e) {
			e.printStackTrace();
			//DbPoolUtil.getConnection().rollback();
			System.out.println("����ع�");
		}finally{
			//DbPoolUtil.closeConnection();
		}
		return null;
	}

}
