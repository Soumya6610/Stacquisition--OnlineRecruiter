
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
<title>Stacquisition - Company Registration</title>
<meta name="keywords"
	content="free templates, website templates, CSS, XHTML" />
<meta name="description"
	content="Simple Gray - Professional free XHTML/CSS template provided by templatemo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
       function f(){
           var x131=document.forms["m"]["username"].value;
        if(x131=="") {
         alert("Error: username cannot be blank!");
          document.forms["m"]["username"].focus();
           return false; 
          }  
        var x132=document.forms["m"]["password"].value;
        if(x132=="") {
         alert("Error: password cannot be blank!");
          document.forms["m"]["password"].focus();
           return false; 
          }  
        
        var x14=document.forms["m"]["address"].value;
        if(x14=="") {
         alert("Error: Address cannot be blank!");
          document.forms["m"]["address"].focus();
           return false; 
          } 
        var x15=document.forms["m"]["city"].value;
        if(x15=="") {
         alert("Error: City cannot be blank!");
          document.forms["m"]["city"].focus();
           return false; 
          }
          
           
       
                   
           
         
         var x17=document.forms["m"]["pincode"].value;
        if(x17=="") {
         alert("Error: Pincode cannot be blank!");
          document.forms["m"]["pincode"].focus();
           return false; 
          }
           var x18=document.forms["m"]["phon"].value;
        if(x18=="") {
         alert("Error: Phone No cannot be blank!");
          document.forms["m"]["phon"].focus();
           return false; 
          } 
          if(isNaN(x18)||x18.indexOf(" ")!=-1){
            alert("Enter numeric value in mobile field  ")
			document.forms["m"]["mobilenumber"].focus();
            return false; }
if(x18.length < 10) {
            alert("You have entered wrong number");
            document.forms["m"]["mobilenumber"].focus();
            return false;}
    var x=document.forms["m"]["email"].value; 
         var atp=x.indexOf("@");
         var dotp=x.lastIndexOf(".");
         if(atp<1||dotp<atp+2||dotp+2>=x.length)
            {
         alert("Not a Valid Email Address");
         document.forms["m"]["email"].focus();
         return false;         
                   }
          
     
          var x16=document.forms["m"]["answer"].value;
        if(x16=="") {
         alert("Error: Security Answer cannot be blank!");
          document.forms["m"]["answer"].focus();
           return false; 
          } 
       return true;
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
					<li><a href="home.jsp">Home</a></li>

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
					Company Registration<br />
				</div>


				<br />
				<center>

					<s:form action="registercomp" name="m" onsubmit="return f()">
						<table>

							<tr>
								<td><s:textfield name="username" label="Username"></s:textfield></td>
							</tr>
							<tr>
								<td><s:password name="password" label="Password"></s:password></td>
							</tr>

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
						</table>
						<br>



						<center>
							<input type="submit" value="Submit" />
						</center>

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