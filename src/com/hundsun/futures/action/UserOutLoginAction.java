package com.hundsun.futures.action;

import javax.servlet.http.HttpSession;

public class UserOutLoginAction extends BaseAction{
	public String execute(){
	  	HttpSession session=httpRequest.getSession();
			session.invalidate();
			return "success";
	  }
}
