<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="p.DbConnect,p.LoginAction"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%
Long myHallTickNo = (Long) session.getAttribute("myHallTickNum");
System.out.println("myHallTickNum: " + myHallTickNo);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Stacquisition - Result Information</title>
<meta name="keywords"
	content="free templates, website templates, CSS, XHTML" />
<meta name="description"
	content="Simple Gray - Professional free XHTML/CSS template provided by templatemo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
	function clearText(field) {
		if (field.defaultValue == field.value)
			field.value = '';
		else if (field.value == '')
			field.value = field.defaultValue;
	}
</script>
</head>
<body>
	<div id="templatemo_header_wrapper">
		<!--  Free Web Templates by TemplateMo.com  -->
		<div id="templatemo_header">
			<br /> <br />
			<div>
				<font size="6" color="red">Stacquisition - Set Your Future
					Job & Face Here</font>
			</div>


			<div id="templatemo_menu">
				<div id="templatemo_menu_left"></div>

				<ul>
					<li><a href="view.jsp"> <br /></a></li>


					<li><a href="combo2">View Company Details<br /></a></li>
					<li><a href="profile.jsp">Profile<br /></a></li>
					<li><a href="viewjobdetails1.jsp">View Job Details<br /></a></li>
					<li><a href="examinf.jsp">Check Exam Information<br /></a></li>
					<li><a href="enterbankdet.jsp">Enter Bank detail<br /></a></li>
					<li><a href="fillinf.jsp"> Attend Exam<br /></a></li>
					<li><a href="resultinf.jsp">Exam Result<br /></a></li>
					<li><a href="applyjob">Apply Job<br /></a></li>
					<li><a href="changepassword.jsp">Change Password<br /></a></li>
					<li><a href="Logout.jsp">Logout<br /></a></li>
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
						style="top: 2px; left: 60px; height: 240px; width: 690px;" />
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
			<s:form>
				<input type="hidden" name="hdnHallTicket">
				<s:property value="hdnHallTicket" />
				<%
				String cid1 = request.getParameter("c_id");
				System.out.println(cid1 + ".......cid");
				System.out.println("select * from QUESTION where SLNO=5 and C_ID=" + cid1 + "");

				ResultSet rss = DbConnect.getStatement()
						.executeQuery("select * from HALLTICKET where C_ID = " + cid1 + " AND HALLTICKET_NO=" + myHallTickNo + " ");
				Long sid = null;
				if (rss.next()) {
					sid = rss.getLong("REGD_NO");
				}

				ResultSet rs1 = DbConnect.getStatement()
						.executeQuery("select * from RESULT where C_ID = " + cid1 + " AND REGD_NO=" + sid + " ");
				%>
   System.out.println(rs.getLong(3));
   
   
   
    </s:form>

			<div id="column_w530">



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
			<br /> <a
				href='http://all-free-download.com/free-website-templates/'></a>
		</div>
</body>

</html>
