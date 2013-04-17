package com.hundsun.futures.action;

import java.util.List;

import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserMsgService;

public class UserManagermentAction extends BaseAction{
	private UserMsgService userMsgService;
	private List<Admin> listAdmin;
	private List<User> listUser;
	private int page=0;
	private int pageSize=10;
	private User user;
	private int id;
   public String findAllAdmin(){
	   listAdmin=userMsgService.findAdmin(page, pageSize);
	   if(listAdmin==null){
		   return "error";
	   }
	   System.out.println("   12  "+listAdmin);
	   return "SUCCESSADMIN";
   }
   public String findAllUser(){
	   listUser=userMsgService.findUser(page, pageSize);
	   System.out.println("   13  "+listUser);
	   if(listUser==null){
		   System.out.println("查找为空了....");
		   return "error";
	   }
	   System.out.println("   13  "+listUser);
	   return "SUCCESSUSER";
   }
   public String delUser(){
	   System.out.println("传进来id了.."+id);
	   boolean isok=userMsgService.updateUserById(id);
	   if(isok){
		   return "SUCCESSDELUSER";
	   }else{
		   return "error";
	   }
	   
   }
   public String updateUser(){
	   System.out.println("传进来user了.."+user);
	   boolean isok=userMsgService.updateUserByUser(user);
	   if(isok){
		   return "SUCCESSUPDATEUSER";
	   }else{
		   return "error";
	   }
	 
   }
   public String updateJSPUser(){
	   System.out.println("JSP页面的User："+user);
	   return "updateUser";
   }
public void setUserMsgService(UserMsgService userMsgService) {
	this.userMsgService = userMsgService;
}
public List<Admin> getListAdmin() {
	return listAdmin;
}
public void setListAdmin(List<Admin> listAdmin) {
	this.listAdmin = listAdmin;
}
public List<User> getListUser() {
	return listUser;
}
public void setListUser(List<User> listUser) {
	this.listUser = listUser;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



}
