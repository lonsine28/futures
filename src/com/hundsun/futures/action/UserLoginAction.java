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
		System.out.println("������ܣ�" + user.getEmail() + "  " + user.getPwd());
		String password=user.getPwd();
		user=userService.findUserByEmail(user.getEmail());
		String checkCode = userService.login(user,password);
		if(checkCode.equals("verifyEmailError")){
			return "verifyEmailError";
		}else if(checkCode.equals("pwderror")){
			failCode="�û������������!";
			return "pwderror";
		}else if(checkCode.equals("success")){
		//4.��userд��session
		   session.put("user", user);
			//5.��ת��/main/main.jsp
			return "success";
		}else{
			return "error";
		}
	}

	public String getFailCode() {
		return failCode;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}


}
