function check_post_msg_valid(){
		if(false==UE.getEditor('editor').hasContents()){
			alert('请输入内容！');
			return false;
		}		
	document.getElementById("msg").value=UE.getEditor('editor').getContent();
		
	document.forms[0].submit();	
}