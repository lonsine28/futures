package com.hundsun.futures.service.impl;
import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;
import com.hundsun.futures.util.EmailUtil;
import com.hundsun.futures.util.MD5Util;
import com.hundsun.futures.util.VerifyUtil;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String login(User user,String password) {
		if(user==null){
			return  "pwderror";
		}
		try {
			password=MD5Util.encode(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "pwderror";
		}
		
			if(user.getState()==0){
				return "cancel";
			}else{
				if(user.getActive().equals("0")){
					return "verifyEmailError";
				}else{
					if (user.getPwd().equals(password)) {
						return "success";
					} else {
						return "pwderror";
					}
				}
			}
		
		
		
	}

	public User findUserByEmail(String email) {
		User dbuser = userDao.findUserByEmail(email);
		return dbuser;
	}

	public boolean register(User user) {
		User curuser=null;
		String password=user.getPwd().trim();
		try {
			System.out.println("���ܺ�����룺"+MD5Util.encode(password));
			user.setPwd(MD5Util.encode(password));
			user.setType(1);//��ʾ��վע����û�
			user.setLevel(1);//��ʾ��վע��
			user.setState(1);//��ʾ����״̬
			String verifyCode=VerifyUtil.randomUUID();
			user.setUuid(verifyCode);
			user.setActive("0");
			curuser=userDao.addUser(user);
			if(curuser!=null){
				String emailCode=verifyCode+"|"+curuser.getId();
				System.out.println("emailCode:"+emailCode);
				EmailUtil.sendEmail(user.getEmail(), "�����ڻ�����ע��������֤", emailCode);
			}else{
				return false;
			}
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public User findUserByUUidId(int id, String uuId) {
		return userDao.findUserByUUidId(id,uuId);
	}

	public void updateUser(String emailVerify, int id) {
		userDao.updateUser(emailVerify,id);
	}

}
