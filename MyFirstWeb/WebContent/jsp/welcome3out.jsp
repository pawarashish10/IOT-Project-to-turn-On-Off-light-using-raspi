<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="pinfo" class = "com.as.samples.vo.PersonalInfo" scope = "session"></jsp:useBean>
	<font color = green size=4>You have successfully submitted the data</font>
	<br>
	<font color = red size=3>First Name</font>
	<jsp:getProperty property="firstname" name="pinfo"/>
	<br>
	<font color = red size=3>Middle Name</font>
	<jsp:getProperty property="middlename" name="pinfo"/>
	<br>
	<font color = red size=3>last Name</font>
	<jsp:getProperty property="lastname" name="pinfo"/>
	
	<br>
	<jsp:useBean id="cinfo" class = "com.as.samples.vo.ContactInfo" scope = "session"></jsp:useBean>
	<font color = red size=3>Address</font>
	<jsp:getProperty property="addr" name="cinfo"/>
	<br>
	<font color = red size=3>City</font>
	<jsp:getProperty property="city" name="cinfo"/>
	<br>
	<font color = red size=3>State</font>
	<jsp:getProperty property="state" name="cinfo"/>
	
	<br>
	<jsp:useBean id="binfo" class = "com.as.samples.vo.BankInfo" scope = "session"></jsp:useBean>
	<font color = red size=3>Bank Name</font>
	<jsp:getProperty property="bankName" name="binfo"/>
	<br>
	<font color = red size=3>Account no</font>
	<jsp:getProperty property="accNo" name="binfo"/>
	<br>
	<font color = red size=3>SSN</font>
	<jsp:getProperty property="ssn" name="binfo"/>
</body>
</html>