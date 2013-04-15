package com.hundsun.futures.action;

import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;

public class UserLoginAction extends BaseAction {
	private User user;//这个也已经注入了
	private UserService userService;


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
//		System.out.println("界面接受：" + user.getEmial() + "  " + user.getPwd());
//		user = userService.login(user);
//		System.out.println("后台处理：" + user.getEmial() + "  " + user.getPwd());
//		if (user.getUno() != 0) {
//			return "success";
//		}
		return "fail";
	}


}
