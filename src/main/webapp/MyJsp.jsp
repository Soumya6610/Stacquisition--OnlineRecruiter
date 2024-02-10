<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Stacquisition - Job Details</title>
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
					Job Details<br />
				</div>


				<br />
				<center>

					<s:hidden name="c_id"></s:hidden>
					<tr>

						<th>Post</th>
						<th>Criteria</th>
						<th>Vacancies</th>
						<th>Salary</th>
						<th>LastDate</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>

					<%
					try {

						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "online1", "online1");
						String sql = "select * from jobdetails";
						PreparedStatement stmt = con.prepareStatement(sql);
						ResultSet rs = stmt.executeQuery();

						while (rs.next()) {
							Long j_id = rs.getLong(1);
					%>
					<%

					%>

					<tr>
						<s:form action="updatejob">
							<td id="tds" align="left"><input id="tds" type="text"
								value="<%=rs.getString(2)%>" name="pos"
								style="border: 0px; size: 10px"></input></td>
							<td id="tds" align="left"><input id="tds" type="text"
								value="<%=rs.getString(3)%>" name="cri" style="border: 0px" /></td>
							<td id="tds"><input id="tds" type="text"
								value="<%=rs.getLong(4)%>" name="vac" style="border: 0px" /></td>
							<td id="tds"><input id="tds" type="text"
								value="<%=rs.getLong(5)%>" name="sal" style="border: 0px" /></td>
							<td id="tds"><input id="tds" type="text"
								value="<%=rs.getString(6)%>" name="lad" style="border: 0px" /></td>

							<td id="tds" align="left"><input type="hidden"
								value="<%=rs.getLong(1)%>" name="jid" /> <s:submit id="tdi"
									value="Edit"></s:submit></td>

							<td id="tds" align="left"><input type="hidden"
								value="<%=j_id%>" name="j_id" /> <s:submit value="Delete"
									id="tdi" action="DeleteJobDetail"></s:submit></td>
						</s:form>

					</tr>

					<%
					}
					rs.close();
					stmt.close();
					con.close();
					} catch (Exception e) {
					System.out.println(e);
					}
					%>



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