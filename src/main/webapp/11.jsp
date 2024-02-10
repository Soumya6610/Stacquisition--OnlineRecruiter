<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="com.opensymphony.xwork2.Result"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Simple Gray, Professional free website template</title>
<meta name="keywords"
	content="free templates, website templates, CSS, XHTML" />
<meta name="description"
	content="Simple Gray - Professional free XHTML/CSS template provided by templatemo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
</head>
<body>
	<div id="templatemo_header_wrapper">
		<!--  Free Web Templates by TemplateMo.com  -->
		<div id="templatemo_header">
			<br />
			<br />
			<div>
				<font size="6" color="red">Stacquisition - Set Your Future
					Job & Face Here</font>
			</div>


			<div id="templatemo_menu">
				<div id="templatemo_menu_left"></div>

				<ul>




				</ul>
			</div>
			<!-- end of menu -->

		</div>
		<!-- end of header -->
	</div>
	<!-- end of header wrapper -->

	<div id="templatemo_banner_wrapper">
		<div id="templatemo_banner">

			<div id="templatemo_banner_image">
				<div id="templatemo_banner_image_wrapper">
					&nbsp; <img src="images/Recruitment-Social-Media.jpg" alt="image 2"
						style="top: 2px; left: 60px; height: 226px; width: 690px;" />
				</div>
			</div>

			<div id="templatemo_banner_image">
				<div>
					<br />
				</div>
			</div>

			<div class="cleaner"></div>

		</div>
		<!-- end of banner -->
	</div>
	<!-- end of banner wrapper -->

	<div id="templatemo_content_wrapper">
		<div id="templatemo_content">

			<div id="column_w530">

				<div class="header_02">
					Multiple Choice Question<br />
				</div>


				<br />
				<center>
					<%     
    int res=0;
    String ansop =  (String)request.getAttribute("r");
    String ans="",result="";
    Integer score=0;
   	  Long cid = (Long)request.getAttribute("cid");
   	  System.out.println(cid+" :compid");
  	ResultSet rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=1 and c_id="+cid+""); 
   
    if(rs.next()){
    ans = rs.getString("ans");
    }
    
    if(ansop.equals(ans)){
   			score++;
           session.setAttribute("res",score);
   }
   else
   {
   	    session.setAttribute("res",score);		
   }
      rs =DbConnect.getStatement().executeQuery("select * from QUESTION where SLNO=2 and c_id="+cid+""); 
    
   %>
					<div id="div1">
						<h1>
							Question 2:
							<%if(rs.next()){ %><%=rs.getString("QUESTION")%>
							<form action="exam12" method="get">
								<input type="hidden" name="hdnHallTicket"> <input
									type="hidden" name="c_id" value="<%=cid%>"> <input
									type="radio" name="r" value="op1"><%=rs.getString("op1") %><br>
								<input type="radio" name="r" value="op2"><%=rs.getString("op2") %><br>
								<input type="radio" name="r" value="op3"><%=rs.getString("op3") %><br>
								<input type="radio" name="r" value="op4"><%=rs.getString("op4") %><br>
								<input type="submit" value="Next">
							</form>
						</h1>
						<%} %>
					</div>
				</center>
				<div class="margin_bottom_20"></div>
				<br />
				<div class="cleaner"></div>
			</div>



			<div class="cleaner"></div>
		</div>
		<!-- end of content wrapper -->
	</div>
	<!-- end of content wrapper -->

	<div id="templatemo_footer_wrapper">
		<br />
		<!-- end of footer -->
		<!--  Free CSS Templates by TemplateMo.com  -->
	</div>
	<!-- end of footer -->
	<div align=center>
		<br />
		<a href='http://all-free-download.com/free-website-templates/'></a>
	</div>
</body>
</html>