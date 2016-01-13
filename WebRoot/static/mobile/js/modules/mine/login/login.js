$(function() {
	$("form").submit(function() {
		$(this).ajaxSubmit(function(data) {
			if(data.code=="200"){
				console.log(data);
				window.opener=null;
				window.open('','_self');
				window.close();
			}
		});
		return false;
	});
})