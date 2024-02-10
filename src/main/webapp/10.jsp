<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
	<%
	int res = 0;
	String ansop = (String) session.getAttribute("r");
	String ans = "", result = "";
	Integer score = 0;
	String cid = (String) session.getAttribute("cid");
	System.out.println(cid);
	ResultSet rs = DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=9 and c_id=" + cid + "");

	if (rs.next()) {
		ans = rs.getString("ans");
	}
	if (ansop.equals(ans)) {
		score++;
		session.setAttribute("res", score);
	} else {
		session.setAttribute("res", score);
	}
	rs = DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=10 and c_id=" + cid + "");
	%>
	<div id="div1">
		<h1>
			Question 10:
			<%
		if (rs.next()) {
		%><%=rs.getString("QUESTION")%>
			<form action="exam8" method="get">
				<input type="hidden" name="cid" value="<%=cid%>"> <input
					type="radio" name="r" value="op1"><%=rs.getString("op1")%><br>
				<input type="radio" name="r" value="op2"><%=rs.getString("op2")%><br>
				<input type="radio" name="r" value="op3"><%=rs.getString("op3")%><br>
				<input type="radio" name="r" value="op4"><%=rs.getString("op4")%><br>
				<input type="submit" value="submit">
			</form>
		</h1>
		<%
		}
		%>
	</div>

</body>
</html>
