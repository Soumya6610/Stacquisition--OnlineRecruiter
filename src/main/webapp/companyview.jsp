
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
<title>Stacquisition - View Company</title>
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
					<li><a href="home.jsp">Home<br /></a></li>
					<li><a href="companyview.jsp">Edit Profile<br /></a></li>
					<li><a href="jobseekerdetails">Jobseeker Details<br /></a></li>
					<li><a href="Acompanydetails">Company Details</a></li>
					<li><a href="viewjobdetails.jsp">Job Details<br /></a></li>
					<li><a href="examcreation.jsp">Exam Creation<br /></a></li>
					<li><a href="examview.jsp">Exam View<br /></a></li>
					<li><a href="">Change Password<br /></a></li>
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
					Company Details<br />
				</div>


				<br />
				<center>

					<s:form action="updatecompanydetail">
						<table>
							<s:hidden name="c_id"></s:hidden>

							<tr>
								<td><s:textfield name="c_name" label="Name"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_address" label="Address"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_post" label="Post"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_criteria" label="Criteria"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_email" label="Email-id"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_contactno" label="Contact No"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="c_cuttoff" label="CuttOff"></s:textfield></td>
							</tr>

							<s:submit value="update"></s:submit>
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