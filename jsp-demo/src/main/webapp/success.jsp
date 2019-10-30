<%@page import="comm.example.model.League"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>
<%

	League League=(League)request.getAttribute("success");
	out.println("Season: "+League.getseason());
	out.println("year: "+League.getyear());
	out.println("title: "+League.gettitle());

%>
</body>
</html>