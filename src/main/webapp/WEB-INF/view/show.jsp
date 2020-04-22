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
	<form action="show" method="post">
		比赛日期：<input type="date" name="t1" value="${vo.t1 }">-<input type="date" name="t2" value="${vo.t2 }"><br>
		积分范围：<input type="text" name="j1" value="${vo.j1 }">-<input type="text" name="j2" value="${vo.j2 }"><br>
		类型：<select name="type" id="s1"></select><br>
		赛事：<input type="text" name="mat" value="${vo.mat }">
		主场球队：<input type="text" value="${vo.zhu }" name="zhu">
		客场球队：<input type="text" value="${vo.ke }" name="ke">
		<input type="hidden" value="${vo.type }" id="ty">
		<input type="submit" value="搜索"><input type="button" value="添加" onclick="add()">
		<table>
			<tr>
				<th>比赛日期</th>
				<th>比赛分类</th>
				<th>赛事</th>
				<th>主场球队</th>
				<th>客场球队</th>
				<th>所需积分</th>
			</tr>
			<c:forEach items="${list }" var="m">
				<tr>
					<td>${m.time }</td>
					<td>${m.tname }</td>
					<td>${m.mat }</td>
					<td>${m.zhu }</td>
					<td>${m.ke }</td>
					<td>${m.ji }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="100">
					共${page.total }项 每页${size }项 当前第${page.pageNum }页 共${page.pages }页
					当前第${pageNum }页&emsp;&emsp;共${page.pages }页
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${page.prePage==0?1:page.prePage }">上一页</button>
					<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button>
					<button name="pageNum" value="${page.pages }">尾页</button>
					第<input type="text" name="pageNum">页 <input type="submit" value="跳转">
				</td>
			</tr>
			
		</table>
		
		
		
		
	</form>
	
	<script type="text/javascript">
		
		$(function(){
			$.post("getTypes",function(obj){
				console.log(obj)
				var html = "<option value=''''></option>";
				$.each(obj,function(i){
					html += "<option value='"+obj[i].type+"'>"+obj[i].type+"</option>"
				})
				$("#s1").append(html);
				$("[value='"+$("#ty").val()+"']").attr("selected",true);
				
				
				
			});
		})
		function add(){
			location = "toAdd";
		}
		
	</script>
	
	
	
	
	
</body>
</html>