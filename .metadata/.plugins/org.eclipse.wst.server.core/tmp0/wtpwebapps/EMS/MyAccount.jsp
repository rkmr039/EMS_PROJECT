<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="com.hcl.ems.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	out.println("MyAccount Details");
	String user=(String)session.getAttribute("EMP_ID");
	int EMP_ID = Integer.parseInt(user);
		out.println(EMP_ID);
		Employ emp = EmsBal.getAccountInfoBal(EMP_ID);
	//	out.println(emp.);
		out.println("<table><tr><th>Employ Department </th><td>"+emp.getEMP_DPT_NAME()+"</td></tr></table>"); 
	%>
	
</body>
</html>