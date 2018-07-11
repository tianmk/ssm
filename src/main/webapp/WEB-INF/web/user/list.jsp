<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
当前用户：${loginuser.name } &nbsp;&nbsp; <a href="${pageContext.servletContext.contextPath }/logout">注销</a><br/>
<table border="1px">
	<thead>
		<tr>
			<th>用户名</th>
			<th>姓名</th>
			<th>注册时间</th>
			<th>操作</th>
		</tr>
	</thead>	
	<tbody>
		<c:forEach items="${data}" var="bean" varStatus="status">
			<tr>
				<td>${bean.username }</td>
				<td>${bean.name }</td>
				<td>${bean.regdateAsString }</td>
				<td>
					<a href="${pageContext.servletContext.contextPath }/user/edit?id=${bean.id}">修改</a> &nbsp;
					<a href="${pageContext.servletContext.contextPath }/user/delete?id=${bean.id}">删除</a> 
				</td>
			</tr>
		</c:forEach>
		
	</tbody>

</table>


</body>
</html>