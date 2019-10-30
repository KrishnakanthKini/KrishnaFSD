<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="controller.do" method="post">
		 year<input type="text" name="year"><br />
		 title<input
			type="text" name="title"><br />
			 Subject<select name="subject">
			<option value="Unknown">Select...</option>
			<option value="autumn">Autumn</option>
			<option value="summer">summer</option>
			<option value="winter">winter</option>
			<option value="spring">spring</option>
		</select><br /> <input type="submit"><input type="reset">
</body>
</html>