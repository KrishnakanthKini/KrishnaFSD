<%@page import="java.util.List"%>
<html>
<title>main page</title>
<body>

	<%
		
		
	List<String> list=(List<String>)request.getAttribute("errors");
	if(list!=null)
	{
		for(String str:list)
		{
			out.println("<font color='red'>"+str+"<br/>");
		}
		out.println("</font>");
	}
	
	
	%>
	<h2>index page</h2>
	<!--<form action="controller.do" method="post">
		 First Name<input type="text" name="fName"><br /> Last Name<input
			type="text" name="lName"><br /> Age<input type="text"
			name="age"><br /> Subject<select name="subject">
			<option value="Unknown">Select...</option>
			<option value="Physics">Physics</option>
			<option value="Bio Physics">Bio Physics</option>
			<option value="Bio Chemistry">Bio Chemistry</option>
			<option value="Applied Physics">Applied Physics</option>
		</select><br /> <input type="submit"><input type="reset"> -->
		
		
		
		
		
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Duke's Soccer League: Home</title>
</head>
<body>
<!-- Page Heading -->
<table border="1" cellpadding="5" cellspacing="0" width="400">
<tr align="center" valign="center" height="20">
<td><h3>Dukes Soccer League: Home</h3></td>
</tr>
</table>
<p>
This is the Home page for Dukes Soccer League.
</p>
<h3>Players</h3>
<ul>
<li><a href="controller.do">List all leagues</a></li>
<li>Register for a league (TBA)</li>
</ul>
<h3>League Administrator</h3>
<ul>
<li><a href="index1.jsp">Add a new league (TBA)</a></li>
</ul>
</body>
</html>
