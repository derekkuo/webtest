<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name= "merry";

	pageContext.setAttribute("name", "merry");
	request.setAttribute("name","terry");
	session.setAttribute("name","tom");
	application.setAttribute("name","app");
%>
<c:out value="${applicationScope.name}"/>
</body>
</html>