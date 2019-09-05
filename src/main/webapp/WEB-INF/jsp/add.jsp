<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function () {
		$.ajax({
			type:"post",
			url:"<%=request.getContextPath()%>/listclazz.do",
			dataType:"json",
			data:{},
			success:function(obj){
				for(var i in obj){
					$("#cid").append("<option value='"+obj[i].cid+"'>"+obj[i].cname+"</option>")
				}
			}
		});
	});
</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/add.do" method="post">
	<table>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="sname"></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><input type="text" name="age"></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><input type="text" name="sex"></td>
		</tr>
		<tr>
			<td>班级</td>
			<td>
				<select name="clazz.cid" id="cid">
					<option>请选择</option>
				</select>
			</td>
		</tr>	
		<tr>
			<td>
				<input type="submit" value="添加">
			</td>
		</tr>					
	</table>
	</form>
</body>
</html>