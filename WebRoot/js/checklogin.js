var checkFlag={"username":false,"pwd":false,"code":false};
$(function (){
	$('#txtUsername').blur(function check_username(){
		var email=$('#txtUsername').val();
		checkFlag.username=false;
		if(email==''){
			$('#username\\.info').html('���������䣡');
			checkFlag.username=false;
			return ;
		}
		var reg= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		if(!reg.test(email)){
			$('#username\\.info').html('�����ʽ���ԣ�');
			checkFlag.username=false;
			return ;
		}else{
			$('#username\\.info').html('');
		}
		//alert("123");
		checkFlag.username=true;
	});
	$('#txtPassword').blur(function check_pwd(){
		var pwd=$('#txtPassword').val();
		if(pwd==''){
			$('#password\\.info').html('���������룡');
			 checkFlag.pwd=false;
		}else{
			var reg=/^[A-Za-z0-9]{6,20}$/;
			if(reg.test(pwd)){
				$('#password\\.info').html('');
				 checkFlag.pwd=true;
			}else{
				$('#password\\.info').html('����Ϊ6~20���ַ�(�ɴ�Сд��ĸ���������)');
				 checkFlag.pwd=false;
			}
		}
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
	$('#ctl00').submit(function(){
		if(checkFlag.username&&checkFlag.pwd&&checkFlag.code){
			return true;
		}else{
		  alert('��������д�������飡');
		  return false;
		}
	});
});
