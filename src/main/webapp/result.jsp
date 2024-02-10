<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect,p.LoginAction"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    Long myHallTickNo=(Long)session.getAttribute("myHallTickNum");    
    System.out.println("myHallTickNum: "+myHallTickNo);
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>
<body>
	<s:form>
		<input type="hidden" name="hdnHallTicket">
		<s:property value="hdnHallTicket" />
		<% 
    
    int res=0;
    String ansop = request.getParameter("r");
    String ans="",result="";
     String score1=request.getParameter("res");
     //System.out.println(score1);
     Integer score = Integer.parseInt(score1);
     System.out.println("score l 17  result"+score);
     String cid1 = request.getParameter("c_id");
     System.out.println(cid1+".......cid");
   	  System.out.println("select * from QUESTION where SLNO=5 and C_ID="+cid1+"");
   	  
  	ResultSet rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=5 and C_ID="+cid1+""); 
     if(rs.next()){
    ans = rs.getString("ans");
    }
   if(ansop.equals(ans)){
     score++;
       score = score*10;
     out.println("<h2>"+"Final Score is: " + score+"</h2>");
     out.println("<h1> Thank U....");   
     out.print("<h3><a href='jobseekerhome.jsp'>BACK</a>");  
   }
   else
   {
     score = score*10;
   	 out.println("<h2>"+"Final Score is: " + score+"</h2>");     
   	 out.print("<h3><a href='jobseekerhome.jsp'>BACK</a>");  
   	
   }
   ResultSet rss = DbConnect.getStatement().executeQuery("select * from HALLTICKET where C_ID = "+cid1+" AND HALLTICKET_NO="+myHallTickNo+" ");
  Long sid=null;
   if(rss.next()){
   sid = rss.getLong("REGD_NO");
   }
    DbConnect.getStatement().executeUpdate("insert into RESULT(REGD_NO,C_ID,RESULT1,STATUS) values("+sid+","+cid1+","+score+",'notapprove') ");
   
   %>

	</s:form>
</body>
</html>
