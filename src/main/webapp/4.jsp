<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<% 
    int res=0;
    String ansop = request.getParameter("r");
    String ans="",result="";
     Integer score=(Integer)session.getAttribute("res");;
     Long cid = (Long)request.getAttribute("cid");
   	ResultSet rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=3 and c_id="+cid+""); 
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
      rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=4 and c_id="+cid+""); 
   %>
	<div id="div1">
		<h1>
			Question 4:
			<%if(rs.next()){ %><%=rs.getString("QUESTION")%>
			<form action="exam2" method="get">
				<input type="hidden" name="c_id" value="<%=cid%>"> <input
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
