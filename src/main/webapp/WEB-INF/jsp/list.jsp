<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function pishan(){
		var x=$("[name='sid']:checked")
		if(x.length>0){
			var str="";
			for(var i=0;i<x.length;i++){
				str+=","+x[i].value
			}
			sid=str.substring(1)
		}
		$.ajax({
			type:"post",
			url:"<%=request.getContextPath()%>/dels.do",
			dataType:"json",
			data:{"sid":sid},
			success:function(obj){
				if(obj>0){
					location.href="<%=request.getContextPath()%>/list.do";
				}
			}
		});
	}
	
	function up(sid){
		location="<%=request.getContextPath()%>/toupdate.do?sid="+sid;
	}
</script>
</head>
<body>
	<input type="button" value="批量删除" onclick="pishan()">
	<form action="<%=request.getContextPath() %>/list.do" method="post">
		<input type="text" name="sname" value="${map.sname}">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td></td>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>班级</td>
			<td>
				<a href="<%=request.getContextPath()%>/toadd.do">添加</a>
			</td>
		</tr>
		<c:forEach items="${list}" var="ss">
			<tr>
				<td><input type="checkbox" name="sid" value="${ss.sid}"></td>
				<td>${ss.sid}</td>
				<td>${ss.sname}</td>
				<td>${ss.age}</td>
				<td>${ss.sex}</td>
				<td>${ss.cname}</td>
				<td>
					<input type="button" value="修改" onclick="up(${ss.sid})">
				</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>