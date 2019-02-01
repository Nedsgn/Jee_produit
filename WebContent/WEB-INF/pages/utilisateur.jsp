<%@page import="fr.afpa.produit.bean.Utilisateur" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="ressources/css/produit.css" />
</head>
<body>
<h1>Liste des personnes</h1>

<div id ="container">

	<%
	
	
	Utilisateur[] utilisateurs = (Utilisateur[]) request.getAttribute("utilisateurs");//on a du importer la class produit pour que java le renconaissen en tant que tableau
	
	for(int i = 0; i < utilisateurs.length; i++){
		System.out.print(utilisateurs[i].getNom()+ " - ");//on est obligé ici d'appeler le getter
	//on ne ferme pas la boucle
	
	%>

<div class="block_produit">

	<div class="prix">
				<label>Age : <%=utilisateurs[i].getAge() %></label>
			</div>
<img src="<%= utilisateurs[i].getUrlImage() %>" />


			
<div class="description"><%=utilisateurs[i].getNom() %> <%=utilisateurs[i].getPrenom() %></div>

</div>

<%} %>

</body>
</html>