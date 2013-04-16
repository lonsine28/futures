<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
 <script type="text/javascript" src="../js/checkregist.js" charset="gbk"></script> 
</head>

<body>
	<div class="fill_message">
			<form name="ctl00" method="post"
					 action="register.action" id="f">
				<h2>
					用户注册
				</h2>
				<table class="tab_login" >
					<tr>
						<td valign="top" class="w1">
							请填写您的Email地址：
						</td>
						<td>
							<input name="user.email" type="text" id="txtEmail" class="text_input"/>
							<div class="text_left" id="emailValidMsg">
							
								    <img src="" alt="" id="emailImage"/>
									<span id="email.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置您的昵称：
						</td>
						<td>
							<input name="user.name" type="text" id="txtNickName" class="text_input"/>
							<div class="text_left" id="nickNameValidMsg">
							 <img src="" alt="" id="nicknameImage"/>
								<span id="name.info" style="color:red"></span>
								<p>
									您的昵称可以由小写英文字母、中文、数字组成，
								</p>
								<p>
									长度4－20个字符，一个汉字为两个字符。
								</p>
								
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置密码：
						</td>
						<td>
							<input name="user.pwd" type="password" id="txtPassword"
								/>
							<div class="text_left" id="passwordValidMsg">
							<img src="" alt="" id="pwdInfoimage"/>
								<span id="password.info" style="color:red"></span>
								<p>
									您的密码可以由大小写英文字母、数字组成，长度6位。
								</p>
								
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" >
							再次输入您设置的密码：
						</td>
						<td>
							<input name="password1" type="password" id="txtRepeatPass"
								 />
							<div class="text_left" id="repeatPassValidMsg">
							<img src="" alt="" id="password1Image"/>
							<span id="password1.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							验证码：
						</td>
						<td>
							<img id='imgVcode' src="imageCode.action" />
							<input name="number" type="text" id="txtVerifyCode"
								class="yzm_input" />
							<div >
								<p class="t1">
									<span id="vcodeValidMsg">请输入图片中的四个字母。</span>
									<img src="" alt="" id="numberImage"/>
									<span id="number.info" style="color:red"></span>
									<a href="javascript:;" onclick="document.getElementById('imgVcode').src = 'imageCode.action?'+(new Date()).getTime()">看不清楚？换个图片</a>
								</p>
							</div>
						</td>
					</tr>
					<tr>
					  <td>
					  <div>  
					     <input type="checkbox" id="ufo" /><a href="">UFO7.0用户协议</a>
					  </div>
					  </td>
					</tr>
				</table>

				<div >

					<input id="btnClientRegister" name="submit"  type="submit" value="注 册"/>
					&nbsp;&nbsp;
					<input id="btnReset" name="" type="button" value="重置">
				</div>
			</form>
		</div>
</body>
</html>
