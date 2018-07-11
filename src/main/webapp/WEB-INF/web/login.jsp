<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="data"  method="post" action="${pageContext.servletContext.contextPath }/login" >
	<table>
		<tr>
			<td>用户名:</td>   
			<td><form:input path="username"/></td> 
		</tr>
		<tr>
			<td>密码:</td>
			<td><form:input path="password"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<form:button >登录</form:button>
			</td>
		</tr>
		
	</table>
</form:form>
</body>
</html>