<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="formPage" method="get">
		Name: <input type="text" name="name"> <br>
		Coffee Type: <select name="coffeetype">
			<option value="latte">latte</option>
			<option value="mocha">mocha</option>
			<option value="americano">americano</option>
			<option value="coffee">coffee</option>
		</select> <input type="submit" value="Submit!">
		
	</form>

</body>
</html>