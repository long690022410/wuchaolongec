<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resources/css/css.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="add" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>比赛日期</td>
				<td><input tyoe="date" name="time"></td>
			</tr>
			<tr>
				<td>比赛分类</td>
				<td id="tid"></td>
			</tr>
			<tr>
				<td colspan="100">
					赛事
					<input type="text" name="mat">
					主场球队
					<input type="text" name="zhu">
					客场球队
					<input type="text" name="ke">
				</td>
				
			</tr>
			<tr>
				<td>所需积分</td>
				<td><input type="text" name="ji" id="ji" onchange="test()"></td>
			</tr>
			<tr>
				<td>比赛视频</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td colspan="100"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
	function test(){
		var p = /^\d+$/;
		if(!(p.test($("#ji").val()))){
			alert("请输入整数");
			$("#ji").val("");
		}
		
		
	}
	$(function(){
		$.post("getTypes",function(obj){
			console.log(obj)
			
			$.each(obj,function(i){
				$("#tid").append("<input type='radio' name='id' value='"+obj[i].id+"'>"+obj[i].type)
			})
			
		});
		
		
		
		
	})
	
		
	</script>
	
	
	
	
</body>
</html>