<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Banana GEST</title>
</head>
<body>
<% if (session.getAttribute("user")!=null) { %>
<h3>hola <%= session.getAttribute("user")!=null?((String)session.getAttribute("user")):"" %>, Login correcto.</h3>
<img src="<%= session.getAttribute("foto")!=null?((String)session.getAttribute("foto")):"" %>" alt="Smiley face" height="142" width="142">
<% } %>
<form action="logout_servlet" method="get">
<input type="submit" value="Logout" >
</form>
<br>
</body>
</html>