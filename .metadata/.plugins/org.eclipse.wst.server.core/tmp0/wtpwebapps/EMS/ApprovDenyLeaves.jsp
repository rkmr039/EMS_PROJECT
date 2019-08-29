<%@page import="com.hcl.ems.Employ"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#firstDiv{
float:left;
width:50%;
background-color: #DDD;
height: 100.1&#37;
}
#secondDiv{

float:left;
width:50%;
background-color: #CCC;
height: 100.1&#37;
}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply leave | EMS</title>
</head>
<body>
	<%
		String checked = request.getParameter("leaveId");
		int leaveId = 0;
		try {
			leaveId = Integer.parseInt(checked);
		} catch (NumberFormatException e)
		{
			%>
				<jsp:forward page="dashboard.jsp"></jsp:forward>
			<%
		}
		Leaves l = EmsBal.getLeaveByIdBal(leaveId);
	 	Employ e = EmsBal.getAccountInfoBal(l.getEmpId());
	 	
	 	%>
	<form method="post" action="ApprovDeny.jsp">
	<div id="firstDiv">
	<input style="display:none" value="<%=l.getLeaId() %>" name="leaveId"/>
	<table>
		<tr>	<th>Employ Id:</th>	<td><%=l.getEmpId() %></td></tr>
		<tr>	<th>Employ Name:</th> <td><%=e.getEmpName() %></td></tr>
		<tr>	<th>Leave Balance:</th> <td><%=e.getEmpLeaveBalance() %></td></tr>
		<tr>	<th>Comments:</th> <td><input type="text" name="comments"/></td></tr>
		
	</table>
	</div>
	<div id="secondDiv">
	<table>	
		<tr>
			<th >Start Date</th><td><%=l.getStartDate() %> </td>
		</tr>
		<tr>
			<th>End Date</th><td><%=l.getEndDate() %></td>
		</tr>
		<tr>
			<th>Number of Days</th><td><%=l.getNoDays() %></td>
		</tr>
		<tr>
			<th>Leave Type</th>	<td><%=l.getType() %></td>
		</tr>
		<tr>
			<th>Leave Reason</th><td><%=l.getReason() %></td>
		</tr>
		
	</table>
	<br/><br/><br/>
	</div>
    <center>
	<input class="btn btn-primary" type="submit" value="Approve" name="approv"/>
	<input class="btn btn-primary" type="submit" value="Deny" name="approv"/>
	</center>
	<input class="btn btn-primary" type="reset" onClick="javascript:window.location.href='dashboard.jsp'" value="Cancel" name="cancel"/>	
	</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>

</body>
</html>