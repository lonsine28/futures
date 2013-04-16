package com.hundsun.futures.action;

import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;

public class UserLoginAction extends BaseAction {
	private User user;
	private UserService userService;
    private String failCode;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login() {
		System.out.println(user.getName());
		System.out.println("界面接受：" + user.getEmail() + "  " + user.getPwd());
		user = userService.login(user);
		if(user==null){
			failCode="用户名或密码错误！";
			return "fail";
		}else{
			session.put(user.getId()+"", user);
			return "success";
		}
	}

	public String getFailCode() {
		return failCode;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}


}
