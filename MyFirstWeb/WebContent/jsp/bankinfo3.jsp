<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bank Info</h1>
<form method="get" action="/MyFirstWeb/Bank3Servelet">
<%
	    String msg = "";
		if(request.getAttribute("error_messages")!= null)
	    msg = (String) request.getAttribute("error_messages");
		if(msg != null || msg.trim().length() == 0)
		{
	%>
	<font color="red"><%=msg%></font>
	
	<%}%>
		<table>
			<tr>
				<td><label for="bankname">Bank Name</label></td>
				<td><input type="text" name="bankname" id="bankname"></td>
			</tr>
			<tr>
				<td><label for="accno">Account No</label></td>
				<td><input type="text" name="accno" id="accno"></td>
			</tr>
			<tr>
				<td><label for="ssn">SSN</label></td>
				<td><input type="text" name="ssn" id="ssn"></td>
			</tr>
		</table>
		<br> <br> <input type=submit name="submit_bank" value="submit_bank" />
		</form>
</body>
</html>