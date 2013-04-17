package com.hundsun.futures.action;

import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;

public class VerifyEmailAction {
	private String email;
	private String code;
	private String codeInfo;
	private User user;
  private UserService  userService;
	public String execute(){
		//�����յ���������֤�����
		//code=de1ee801-9e64-4095-844a-d4ae38c93359|12
		String[] dataCode=code.trim().split("\\|");
		String uuId=dataCode[0];
		int id=Integer.parseInt(dataCode[1]);
		System.out.println(uuId+"  "+id);
		//��ȡ�û�ID��UUID
		//����ID��UUIDȥ���ݿ����
		user=null;
		try {
			System.out.println("----------------------");
			user=userService.findUserByUUidId(id,uuId);
				if(user!=null&&user.getUuid().equals(uuId)&&user.getEmail().equals(email)){
					String emailVerify="1";
					userService.updateUser(emailVerify, id);
					codeInfo="";
					return "success";
				}else{
					user=new User();//3e49bd12-de89-42fa-9958-baeafb888576|9
					user.setEmail(email);
					codeInfo="��֤���������123��";
					return "verifyCodeEmail";//����ԭҳ��
				}
		} catch (Exception e) {
			e.printStackTrace();
			user=new User();
			user.setEmail(email);
			codeInfo="��֤���������";
			return "verifyCodeEmail";
		}
		//�ж��Ƿ���ȷ
		//�����ȷ,����d_user��is_email_verify
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCodeInfo() {
		return codeInfo;
	}

	public void setCodeInfo(String codeInfo) {
		this.codeInfo = codeInfo;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
