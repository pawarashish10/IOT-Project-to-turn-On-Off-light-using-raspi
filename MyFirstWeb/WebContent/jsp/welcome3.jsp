<html>
<body>
	<center>
		<h1>
			<font color="red"> Welcome Page </font>
		</h1>
	</center>
	<%
	    String msg = "";
		if(request.getAttribute("error_messages")!= null)
	    msg = (String) request.getAttribute("error_messages");
		if(msg != null || msg.trim().length() == 0)
		{
	%>
	<font color="red"><%=msg%></font>
	
	<%}%>
	<form method="get" action="/MyFirstWeb/Welcome3Servelet">
		
		<table>
			<tr>
				<td><label for="fname">First Name</label></td>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			<tr>
				<td><label for="lname">Last Name</label></td>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<td><label for="mname">Middle Name</label></td>
				<td><input type="text" name="mname" id="mname"></td>
			</tr>
		</table>
		<br> <br> <input type=submit name="submit" value="submit" />
		</form>

		</boby>
</html>