<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arraylist</title>
</head>
<body>
<h1>Array list</h1>

<%
ArrayList<String> villes = (ArrayList<String>) request.getAttribute("villes");

%>

<p>

Taille du tableau : <%= villes.size() %>
</p>
<%if(villes.isEmpty()){ %>
<p>Le tableau est vide</p>
<%} %>



<%
for(int i = 0; i < villes.size(); i++){
	out.println(villes.get(i) + "<br/>"); //=villes[i]
}
%>


<h2>Expressions Languages : </h2>

<p>
Tableau Villes : ${ villes }
</p>

<p>
<ul>
		<li>${villes[0] }</li>
		<li>${villes[1] }</li>
		<li>${villes[2] }</li>
		<li>${villes[3] }</li>
		
		</ul>
</p>


</body>
</html>