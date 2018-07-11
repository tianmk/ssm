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
<form:form modelAttribute="data"  method="post" action="${pageContext.servletContext.contextPath }/user/edit" >
	<form:hidden path="id" />
	<table>
		<tr>
			<td>用户名:</td>   
			<td><form:input path="username"/></td> 
		</tr>
		<tr>
			<td>姓名:</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>状态:</td>
			<td>
				<form:radiobutton path="state" label="启用" value="1" /> &nbsp;
				<form:radiobutton path="state" label="禁用" value="0" />
			</td>
		</tr>
		<form:button >提交</form:button>
	</table>
</form:form>
</body>
</html>