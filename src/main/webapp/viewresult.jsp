<%@page import="java.sql.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Stacquisition - View Result</title>
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
					<li><a href="admin.jsp">Home</a></li>
					<li><a href="combo1">Jobseeker Details</a></li>
					<li><a href="combo2">Company Details</a></li>
					<li><a href="combo3">Add/Delete Jobseeker</a></li>
					<li><a href="ApproveRejectCompany.jsp">Approve/Reject
							company</a></li>

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
					Approval of jobseeker<br />
				</div>


				<br />
				<center>

					<s:form action="approvestatus1">

						<table border="1">

							<tr>
								<td>Registration no.</td>
								<td>c_id</td>
								<td>Result</td>
								<td>status</td>
								<td>Approve</td>
							</tr>


							<%
							try {

								Class.forName("oracle.jdbc.driver.OracleDriver");
								Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "online1", "online1");
								String sql = "select * from result";
								PreparedStatement stmt = con.prepareStatement(sql);
								ResultSet rs = stmt.executeQuery();

								while (rs.next()) {
									Long regdno = rs.getLong(1);
									Long c_id = rs.getLong(2);
							%>
							<%

							%>

							<tr>
								<td><%=rs.getLong(1)%></td>
								<td><%=rs.getLong(2)%></td>
								<td><%=rs.getLong(3)%></td>
								<td><%=rs.getString(4)%></td>
								<td><s:form action="approvestatus">
										<input type="hidden" value="<%=regdno%>" name="regdno" />
										<input type="hidden" value="<%=c_id%>" name="c_id" />
										<s:submit value="approve" action="approvestatus"></s:submit>
									</s:form></td>
							</tr>

							<%
							}
							rs.close();
							stmt.close();
							con.close();
							} catch (Exception e) {
							e.printStackTrace();
							}
							%>
							<tr>
								<td><font color="blue" size="5"><s:property
											value="msg" /></font></td>
							</tr>

						</table>
					</s:form>
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
		<br /> <a href='http://all-free-download.com/free-website-templates/'></a>
	</div>
</body>
</html>