<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="../js/verifycode.js" charset="gbk"></script>
</head>

<body>
	<form action="login.action" method="post">
		邮箱：<input name="user.emial" type="text" /><br /> 
		密码: <input name="user.pwd" type="password" /><br />
			 <img id='imgVcode' src="imageCode.action" /> <input
			name="number" type="text" id="txtVerifyCode"/>
		<div >
			<p >
				<span id="vcodeValidMsg">请输入图片中的四个字母。</span> <img src="" alt=""
					id="numberImage" /> <span id="number.info" style="color:red"></span>
				<a href="javascript:;"
					onclick="document.getElementById('imgVcode').src = 'imageCode.action?'+(new Date()).getTime()">看不清楚？换个图片</a>
			</p>
		</div>

		<input value="登陆" type="submit" />
	</form>
</body>
</html>
