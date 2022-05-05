<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
<h2>Lead | Create</h2>
<form action ="saveLead" method ="post">  
		<pre>
			First Name  <input type ="text" name="firstName"/>
			Last Name   <input type ="text" name="lastName"/>
			Email       <input type="text" name="email"/>
			Lead Source:
			<select name="leadSource" >
			  <option value="tv commercial">TV Commercial</option>
			  <option value="radio">Radio</option>
			  <option value="news paper">News Paper</option>
			  <option value="online">Online</option>
			</select>
			
			Mobile      <input type="text" name="mobile"/>
					    		       <input type="submit" value="save"/>
		
		</pre>
					
</form>
</body>
</html>