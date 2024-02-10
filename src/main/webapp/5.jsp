<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP '2.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<% 
    int res=0;
    String ansop = request.getParameter("r");
    String ans="",result="";
     Integer score=(Integer)session.getAttribute("res");;
    Long cid = (Long)request.getAttribute("cid");
   ResultSet rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=4 and c_id="+cid+""); 
    if(rs.next()){
    ans = rs.getString("ans");
    }
   if(ansop.equals(ans)){
     score++;
     session.setAttribute("res",score);
   } else
   {
   	    session.setAttribute("res",score);		
   }
      rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=5 and c_id="+cid+""); 
   %>
	<div id="div1">
		<h1>
			Question 5:
			<%if(rs.next()){ %><%=rs.getString("QUESTION")%>
			<form action="exam8" method="get">
				<input type="hidden" name="c_id" value="<%=cid%>"> <input
					type="hidden" name="res" value="<%=score%>"> <input
					type="radio" name="r" value="op1"><%=rs.getString("op1") %><br>
				<input type="radio" name="r" value="op2"><%=rs.getString("op2") %><br>
				<input type="radio" name="r" value="op3"><%=rs.getString("op3") %><br>
				<input type="radio" name="r" value="op4"><%=rs.getString("op4") %><br>
				<input type="submit" value="Next">
			</form>
		</h1>
		<%} %>
	</div>

</body>
</html>
