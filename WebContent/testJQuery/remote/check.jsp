<%@ page language="java" pageEncoding="utf-8"%>
<%@page import="java.io.PrintWriter"%>
<%
System.out.println("------------");
String name = request.getParameter("name");
System.out.println(name);
response.setContentType("text/json;charset=utf-8");
PrintWriter pw = response.getWriter();
if("tom".equals(name)){
  pw.print("false");
  System.out.println("用户名不可用!");
}else{
  pw.print("true");
  System.out.println("用户名可用!");
}
pw.close();
 %>

