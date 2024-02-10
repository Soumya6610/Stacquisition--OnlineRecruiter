<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="com.opensymphony.xwork2.ActionSupport"%>
<%@page import="p.LoginAction"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Stacquisition - Edit Account | Jobseeker</title>
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
					Jobseeker Details<br />
				</div>


				<br />
				<center>

					<table border="1" width="327" height="30">
						<table>

							<s:form action="jobseekeredit">
								<table border="1" width="327" height="30">
									<table>
										<s:hidden name="loginid"></s:hidden>
										<tr>
											<td><s:textfield name="firstname" label="Firstname"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="middlename" label="Middlename"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="lastname" label="Lastname"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="date1" label="DOB"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="gender" label="Gender"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="age" label="Age"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="category" label="Category"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="nationality" label="Nationality"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="fathers_name"
													label="Fathers Name"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="fathers_occupation"
													label="Fathers Occupation"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="mothers_name"
													label="Mothers Name"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textarea name="present_address"
													label="Present Address"></s:textarea></td>
										</tr>
										<tr>
											<td><s:textarea name="permanent_address"
													label="Permanent Address"></s:textarea></td>
										</tr>
										<tr>
											<td><s:textfield name="contact_no" label="Contact No"></s:textfield></td>
										</tr>
										<tr>
											<td><s:textfield name="email_id" label="Email_id"></s:textfield></td>
										</tr>



										</center>

									</table>
									<br />
									<table border="1">
										<h4>
											<tr>
												<td><center>
														<font color="#8008"></font><strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">BOARD/UNIVERSITY<strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">YEAR<strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">MARKS IN PERCENTAGE<strong></strong>
													</center></td>
											</tr>
										</h4>

										<%
										Map session1 = ActionContext.getContext().getSession();
										ArrayList<LoginAction> al = (ArrayList<LoginAction>) session1.get("ALIST");
										for (int i = 0; i < al.size(); i++) {
										%>
										<tr>
											<td><font color="#80080"><strong>10th/Xth/EQUIVALENT</strong></font></td>
											<td><input type="text" name="board"
												value="<%=al.get(i).getBoard()%>" /></td>
											<td><input type="text" name="year"
												value="<%=al.get(i).getYear()%>" /></td>
											<td><input type="text" name="marks"
												value="<%=al.get(i).getMarks()%>" /></td>
										</tr>

										<tr>
											<td><font color="#80080"><strong>12th/Xiith/EQUIVALENT</strong></font></td>
											<td><input type="text" name="twboard"
												value="<%=al.get(i).getTwboard()%>" /></td>
											<td><input type="text" name="twyear"
												value="<%=al.get(i).getTwyear()%>" /></td>
											<td><input type="text" name="twmarks"
												value="<%=al.get(i).getTwmarks()%>" /></td>
										</tr>
									</table>

									<table border="1">
										<h4>
											<tr>
												<td><center>
														<font color="#8008"></font><strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">INSTITUTE<strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">COURSE<strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">YEAR<strong></strong>
													</center></td>
												<td><center>
														<font color="#80080">MARKS IN PERCENTAGE<strong></strong>
													</center></td>
											</tr>
										</h4>


										<tr>
											<td><font color="#80080"><strong>GRADUATION</strong></font></td>
											<td><input type="text" name="ginstitute"
												value="<%=al.get(i).getGinstitute()%>" /></td>
											<td><input type="text" name="course"
												value="<%=al.get(i).getCourse()%>" /></td>
											<td><input type="text" name="gyear"
												value="<%=al.get(i).getGyear()%>" /></td>
											<td><input type="text" name="gmarks"
												value="<%=al.get(i).getGmarks()%>" /></td>
										</tr>


										<tr>
											<td><font color="#80080"><strong>POST
														GRADUATION</font>
												</center></td>
											<td><input type="text" name="PGinstitute"
												value="<%=al.get(i).getPGinstitute()%>" /></td>
											<td><input type="text" name="PGCourse"
												value="<%=al.get(i).getPGCourse()%>" /></td>
											<td><input type="text" name="PGyear"
												value="<%=al.get(i).getPGyear()%>" /></td>
											<td><input type="text" name="PGmarks"
												value="<%=al.get(i).getPGmarks()%>" /></td>
										</tr>
										<%
										}
										%>

									</table>

									<s:submit value="update"></s:submit>
									</br>
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
								<br /> <a
									href='http://all-free-download.com/free-website-templates/'></a>
							</div>
</body>
</html>