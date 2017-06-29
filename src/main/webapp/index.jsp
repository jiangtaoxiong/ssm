<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ssm</title>
<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
<script type="text/javascript">
var test=$(function(){

	var xhr;
	
	function getPostData(){
		var _data = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://server.webservice.ssm.lincoln.com/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">'
			_data+=	'<soapenv:Body><q0:sayHello><arg0>';
			_data+= $("input[name='username']")[0].value;
			_data+='</arg0></q0:sayHello></soapenv:Body></soapenv:Envelope>';
			return _data;
	}

  	  
  	  
	 request = {
			JqueryRequestWebSer : function() {
			$.ajax({
				type : "POST",
				url : "ws/LincolnWeb",
				dataType : "xml",
				contentType:'text/xml;charset=utf-8',
				data : getPostData(),
				success : function(data,status,xhr) {
					var v = $(data).find('return').text();
					alert(v);
				}
			});
		},
		AjaxRequestWebSer : function() {
		    var _data = '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:sayHello xmlns:ns2="http://server.webservice.ssm.lincoln.com/"><arg0>'
				+$("input[name='username']")[0].value+'</arg0></ns2:sayHello></soap:Body></soap:Envelope>';
			if(window.XMLHttpRequest){
				xhr = new XMLHttpRequest();
			}
			else{
				alert("ie browser");
				xhr = new XMLHttpRequest();
				/*IE9已经没有这种问题了*/
				//xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
			var wsUrl = "ws/LincolnWeb";
			//打开链接
			xhr.open("POST", wsUrl, true);
			xhr.setRequestHeader("Content-Type", 'text/xml;charset=utf-8');
			xhr.onreadystatechange = _callback;
			//$(_data).find('arg0').attr('value',$("input[name='username']")[0].value);
			xhr.send(_data);
		}
	};
	
	function _callback(){
		if(xhr.readyState==4){
			if(xhr.status==200){
				var str = xhr.responseXML.getElementsByTagName('return')[0];
				alert(str.childNodes[0].nodeValue);
			}
		}
			
	}
	
	return request;
});	
</script>
</head>
<body>
	<form action="<%=basePath%>login/login.do" method="post">
		用户名:<input type="text" name="username" /><br>
		 密码:<input type="password" name="password" /><br>
		 <input type="submit" value="login" />
	</form>

	<input type="button" onclick="request.JqueryRequestWebSer()"
		value="Jquery请求webService">
	<input type="button" onclick="request.AjaxRequestWebSer()"
		value="Ajax请求webService">
</body>

</html>
