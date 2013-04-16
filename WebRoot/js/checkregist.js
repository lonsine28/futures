var checkFlag={"email":false,"emailajax":false,"nickname":false,"pwd":false,"repeatPwd":false,"code":false,"ufo":false};
$(function(){
	$('#txtPassword').blur(function check_pwd(){
		var pwd=$('#txtPassword').val();
		if(pwd==''){
			$('#password\\.info').html('���������룡');
			 checkFlag.pwd=false;
			 $('#pwdInfoimage').attr("src","/futures/image/unchecked.gif");
		}else{
			var reg=/^[A-Za-z0-9]{6,20}$/;
			if(reg.test(pwd)){
				$('#password\\.info').html('����������ȷ��');
				 checkFlag.pwd=true;
				 $('#pwdInfoimage').attr("src","/futures/image/checked.gif");
			}else{
				$('#password\\.info').html('����Ϊ6~20���ַ�(�ɴ�Сд��ĸ���������)');
				 checkFlag.pwd=false;
				 $('#pwdInfoimage').attr("src","/futures/image/unchecked.gif");
			}
		}
	});
	$('#txtRepeatPass').blur(function check_Repeatpwd(){
		var repeatpwd=$('#txtRepeatPass').val();
		var pwd=$('#txtPassword').val();
		if(repeatpwd==''){
			$('#password1\\.info').html('���������룡');
			checkFlag.repeatPwd=false;
			$('#password1Image').attr("src","/futures/image/unchecked.gif");
		}else{
			var reg=/^[A-Za-z0-9]{6,20}$/;
			if(reg.test(repeatpwd)){
				if(pwd==repeatpwd){
					$('#password1\\.info').html('����һ�£�');
					 checkFlag.repeatPwd=true;
					 $('#password1Image').attr("src","/futures/image/checked.gif");
				}else{
					$('#password1\\.info').html('������������벻һ�£�');
					 checkFlag.repeatPwd=false;
					 $('#password1Image').attr("src","/futures/image/unchecked.gif");
				}
				
			}else{
				$('#password1\\.info').html('����Ϊ6~20���ַ�(�ɴ�Сд��ĸ���������)');
				 checkFlag.repeatPwd=false;
				 $('#password1Image').attr("src","/futures/image/unchecked.gif");
			}
		}
	});
	
	//alert("123");
	$('#txtNickName').blur(function check_nickname(){
		var nickname=$('#txtNickName').val();
		if(nickname==''){
			$('#name\\.info').html('�������ǳƣ�');
			checkFlag.nickname=false;
			 $('#nicknameImage').attr("src","/futures/image/unchecked.gif");
		}else{
			var reg=/^[\u4E00-\u9FA5\w\d]{4,20}$/;
			if(reg.test(nickname)){
				$('#name\\.info').html('�ǳƿ��ã�');
				checkFlag.nickname=true;
				 $('#nicknameImage').attr("src","/futures/image/checked.gif");
			}else{
				$('#name\\.info').html('�ǳƸ�ʽ���ԣ�');
				checkFlag.nickname=false;
				 $('#nicknameImage').attr("src","/futures/image/unchecked.gif");
			}
		}
	});
	
	
	$('#txtEmail').blur(function(){
		var email=$('#txtEmail').val();
		checkFlag.email=false;
		checkFlag.emailajax=false;
		if(email==''){
			$('#email\\.info').html('���������䣡');
			checkFlag.email=false;
			$('#emailImage').attr("src","/futures/image/unchecked.gif");
			return ;
		}
		var reg= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		if(!reg.test(email)){
			$('#email\\.info').html('�����ʽ���ԣ�');
			checkFlag.email=false;
			$('#emailImage').attr("src","/futures/image/unchecked.gif");
			return ;
		}
		checkFlag.email=true;//ͨ���ǿպ͸�ʽ��֤
		$.post("validEmail.action",{"email":email},function(ok){
			if(ok){
				$('#email\\.info').html('�������');
				checkFlag.emailajax=true;
				$('#emailImage').attr("src","/futures/image/checked.gif");
			}else{
				$('#email\\.info').html('�������Ѿ�ע���˻���');
				checkFlag.emailajax=false;
				$('#emailImage').attr("src","/futures/image/unchecked.gif");
			}
		});
	});
	
	$('#txtVerifyCode').blur(function (){
		if($('#txtVerifyCode').val()==""){
		 $('#number\\.info').html('��֤�벻��Ϊ�գ�');
		 checkFlag.code=false;
		 $('#numberImage').attr("src","/futures/image/unchecked.gif");
		 return ;
		}
		//alert('1');
		$.post("validate.action",{"code":$("#txtVerifyCode").val()},function(data){
		if(data.ok){
		//alert('2');
		$('#number\\.info').html('��֤����ȷ');
		checkFlag.code=true;
		 $('#numberImage').attr("src","/futures/image/checked.gif");
		}else{
		//alert('3');
		$('#number\\.info').html('��֤�����');
		checkFlag.code=false;
		 $('#numberImage').attr("src","/futures/image/unchecked.gif");
		}
		//alert('4');
		});
		});
		$('#imgVcode').click(function(){
		$(this).attr("src","imageCode.action?dt="+new Date().getTime());
		});
		
		$('#btnReset').click(function(){
			$('#txtEmail').val('');
			$('#txtNickName').val('');
			$('#txtRepeatPass').val('');
			$('#txtPassword').val('');
			$('#txtVerifyCode').val('');
			$('#password\\.info').html('');
			$('#pwdInfoimage').attr("src","");
			$('#password1\\.info').html('');
			 $('#password1Image').attr("src","");
			 $('#name\\.info').html('');
			 $('#nicknameImage').attr("src","");
			 $('#email\\.info').html('');
			 $('#emailImage').attr("src","");
			 $('#number\\.info').html('');
			 $('#numberImage').attr("src","");
		});
	//ҳ���ύ
	$('#f').submit(function(){
		if($("#ufo").attr("checked")==true){
			checkFlag.ufo=true;
		}
		if(checkFlag.email&&checkFlag.emailajax&&checkFlag.nickname&&checkFlag.pwd&&checkFlag.repeatPwd&&checkFlag.code&&checkFlag.ufo){
			return true;
		}else{
		  alert('��������д�������飡');
		  return false;
		}
	});
});

