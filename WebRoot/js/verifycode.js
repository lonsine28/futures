$(function () {
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
});