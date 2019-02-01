<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<h1>Jstl</h1>
	<c:set var="nom" value="James"></c:set> <!-- Je déclare une variable qui s'apelle nom -->
	
	<c:out value="bonjour avec JSTL"></c:out>
	<br/>
	<p>Bonjour : ${nom }</p>
	
	
	<!-- c:out est équivalent à out.println, il fait donc de l'affichage -->
	<c:out value="yop"></c:out>
	<br /> ${ "avec du texte" }

	<c:if test="true">
		<h2>Titre dans un c:if</h2>
	</c:if>

	<c:forEach begin="1" end="10" step="1">	<!-- équivaut à la boucle for : for (int i = 1; i <= 10; +1) -->
		 <p>Boucle</p>
	</c:forEach>

	<c:forEach begin="0" end="20" step="5"><!-- équivaut à la boucle for : for (int i = 0; i <= 20; +5) -->
		 <p>Step 5</p>
	</c:forEach>

	<c:forEach var="i" begin="1" end="10" step="1">
		<c:if test="${i % 2 == 0 }">
			<c:out value="${i }"></c:out><!-- on veut afficher le contenu de la variable i avec les expr languages  -->
		</c:if>
		<p>Step 5</p>
	</c:forEach>

</body>
</html>