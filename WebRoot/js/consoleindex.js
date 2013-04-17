$(function () {
	var values=1;
	$('#usermsg').click(function () {
		
		if(values==1){
			$('#usermsgdet').show();
			values=0;
		}else{
			$('#usermsgdet').hide();
			values=1;
		}
		
	});
});