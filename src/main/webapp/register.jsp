
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Stacquisition - Approval</title>
<meta name="keywords"
	content="free templates, website templates, CSS, XHTML" />
<meta name="description"
	content="Simple Gray - Professional free XHTML/CSS template provided by templatemo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
function fun()
{
var x=document.forms["m"]["firstname"].value;
var y=document.forms["m"]["present_address"].value;
var a=document.forms["m"]["contact_no"].value;
var b=document.forms["m"]["email_id"].value;
var c=document.forms["m"]["education qualification"].value;



var m=x.match(/[^a-zA-Z]/);

        if (m!=null)
     {
         alert("Error:Invalid name!!!");

         document.forms["m"]["firstname"].focus();

          return false;
} 
re=/^\w+$/;
	if(!re.test(document.forms["m"]["name"].value))
	{
	alert("Error: Username must contain only letters");
	document.forms["m"]["name"].focus();
	return false;
	}

var atpos=b.indexOf("@");
var dotpos=b.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=b.length)
  {
  alert("Not a valid e-mail address");
  return false;
  }

if(a.length>10 || a.length<10)
{
alert("Error: Enter 10 digit contact number!!");
return false;
}
if(x=="")
{
alert("Name Field Should Be Filled Out!!!");
return false;
}
if(y=="")
{
alert("Address Area Should Not Be Blank!!!");
return false;
}

if(a=="")
{
alert("Phone Number Is Required!!!");
return false;
}
if(x=="")
{
alert("Education Qualification Field Should Be Filled Out!!!");

return false;
}
return true;
}


function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
<sx:head />
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
					Welcome to REGISTER PAGE<br />
				</div>


				<br />
				<center>

					<s:form action="register1" name="m" onsubmit="return fun()"
						method="post" enctype="multipart/form-data">
						<table>

							<h1>
								<U>PERSONAL DETAILS</U>
							</h1>
							<tr>
								<td><s:textfield name="username" label="USERNAME"></s:textfield></td>
							</tr>
							<tr>
								<td><s:password name="password" label="PASSWORD"></s:password></td>
							</tr>
							<tr>
								<td><s:textfield name="firstname" label="FIRST NAME"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="middlename" label="MIDDLE NAME"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="lastname" label="LAST NAME"></s:textfield></td>
							</tr>
							<tr>
								<td><sx:datetimepicker name="date1" label="DOB"
										displayFormat="dd-MMM-yyyy" value="todayDate" /></td>
							</tr>
							<tr>
								<td><s:textfield name="age" label="AGE"></s:textfield></td>
							</tr>
							<tr>
								<td><s:radio name="gender" label="GENDER"
										list="{'male','female'}" /></td>
							</tr>
							<tr>
								<td><s:textfield name="branch" label="BRANCH"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="regdno" label="REGISTRATION NUMBER"></s:textfield></td>
							</tr>
							<tr>
								<td><s:radio name="category" label="CATEGORY"
										list="{'general','sc','st'}" /></td>
							</tr>
							<tr>
								<td><s:radio name="nationality" label="NATIONALITY"
										list="{'Indian','Non Indian'}" /></td>
							</tr>
							<tr>
								<td><s:textfield name="fathers_name" label="FATHER'S NAME"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="fathers_occupation"
										label="FATHER'S OCCUPATION"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="mothers_name" label="MOTHER'S NAME"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="email_id" label="EMAIL-ID"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textfield name="contact_no" label="CONTACT NO"></s:textfield></td>
							</tr>
							<tr>
								<td><s:textarea name="present_address"
										label=" PRESENT ADDRESS"></s:textarea></td>
							</tr>
							<tr>
								<td><s:textarea name="permanent_address"
										label="PERMANENT ADDRESS"></s:textarea></td>
							</tr>
						</table>
						<h2>
							<u>EDUCATIONAL QUALIFICATION</u>
						</h2>
						<u>10th/Xth/EQUIVALENT:</u>
						<br />
						<br />
        	BOARD/UNIVERSITY:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="text" name="board" />&nbsp; &nbsp;
        	&nbsp;&nbsp;&nbsp;&nbsp; YEAR OF PASSING:&nbsp;&nbsp;<input
							type="text" name="year">
        &nbsp; &nbsp; &nbsp; 
        	</br>
						</br>MARKS IN PERCENTAGE:&nbsp;&nbsp;<input type="text" name="marks" />
						<br />
						<br />

						<u>12th/Xiith/EQUIVALENT:</u>
						<br />
						<br />
        	
        	BOARD/UNIVERSITY:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
							name="twboard" />&nbsp; &nbsp; 
        	&nbsp;&nbsp;&nbsp;&nbsp; 
        	YEAR OF PASSING:<input type="text" name="twyear">
						<br />
            MARKS IN PERCENTAGE:&nbsp;&nbsp;<input type="text"
							name="twmarks" />
						<br />

						<u>GRADUATION:</u>
						<br />
        	INSTITUTE:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
							name="ginstitute" />
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; COURSE:
        <select name=course>
							<option>BTECH</option>
							<option>BBA</option>
							<option>BCA</option>
						</select>
						<BR />
						<BR />
        	YEAR OF PASSING:<input type="text" name="gyear">
                	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MARKS IN PERCENTAGE:<input
							type="text" name="gmarks" />
						<br />


						<u>POST GRADUATION:</u>
						<br />
        	INSTITUTE:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
							name="PGinstitute" />
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; COURSE:
        <select name=PGCourse>
							<option>MTECH</option>
							<option>MBA</option>
							<option>MCA</option>
						</select>
						<BR />
						<BR />
        	YEAR OF PASSING:<input type="text" name="PGyear">
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	 MARKS IN PERCENTAGE:<input type="text" name="PGmarks" />
						<br />


						<br />
						<tr>
							<td><s:radio name="experience"
									label="DO YOU HAVE ANY EXPERIENCE" list="{'yes','no'}" /></td>
						</tr>
     &nbsp;&nbsp;
      Experience in years:&nbsp;&nbsp;
        <select name=experience>
							<option>--------select---------</option>
							<option>0</option>
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
							<option>More than 10 years</option>
							<option>Less than 6 months</option>
						</select>
						<s:file name="userImage" label="select the Resume"></s:file>

						<br />

						</table>

						<s:submit value="REGISTER"></s:submit>
					</s:form>
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