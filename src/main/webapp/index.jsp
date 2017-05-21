<html>
<head>
<script type="text/javascript" src="jsc/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function jj() {
		var user_json = {
			"id" : "00",
			"username" : "00",
			"password" : "00",
			"nickname" : "00",
			"level" : 1,
			"score" : 1,
			"email" : "00",
			"qqnum" : "00",
			"phonenum" : "00",
			"status" : false
		}
		//js对象转换成JSON字符串  
		var jason_str = JSON.stringify(user_json);
		//Ajax发送数据给后台  
		$.ajax({
			url : "/application/checkUserLogin",
			cache : true,
			type : "post",
			datatype : "json",
			contentType : "application/json",
			data : jason_str,
			success : function(data) {
				alert(data.username);
			}

		});
	}
</script>

</head>
<body>
	<script type="text/javascript">
		jj();
	</script>
	<h2>Hello World!</h2>
	count=${user}
</body>
</html>
