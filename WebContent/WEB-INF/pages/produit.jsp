<%@page import="java.util.ArrayList"%>
<%@page import="fr.afpa.produit.bean.Produit"%> <!-- il faut importer le package ou se trouve la class produit -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produit</title>
<link rel="stylesheet" href="ressources/css/produit.css" />
</head>
<body>

	<h1>Liste des produits</h1>

	<div id="conteneur">
	
		<%
	
	ArrayList<Produit> produits = (ArrayList<Produit>) request.getAttribute("produits");
	//Produit[] produits = (Produit[]) request.getAttribute("produits");//on a du importer la class produit pour que java le renconaissen en tant que tableau
	
	for(int i = 0; i < produits.size(); i++){
		System.out.print(produits.get(i).getDescription() + " - ");//on est obligé ici d'appeler le getter
	//on ne ferme pas la boucle
	
	%>
	
 <!-- Nous pouvons désormais afficher toutes nos images avec ce seul code html plus le code java au dessus, on a donc englobé du code html avec du code java -->
 
		<div class="block_produit">
			<div class="prix">
				<label><%=produits.get(i).getPrix() %>€</label>
			</div>
			
			<img id="axe" src="<%= produits.get(i).getImgUrl() %>" />
			
			<div class="description"><%=produits.get(i).getDescription() %></div>
		</div>

		<!-- <div class="block_produit">
			<div class="prix">
				<label>${produits[1].prix}€</label>
			</div>
			<img id="lait" src="${produits[1].imgUrl }" />
			<div class="description">${produits[1].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[2].prix}€</label>
			</div>
			<img id="evian" src="${produits[2].imgUrl }" />
			<div class="description">${produits[2].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[3].prix}€</label>
			</div>
			<img src="${produits[3].imgUrl }" />
			<div class="description">${produits[3].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[4].prix}€</label>
			</div>
			<img src="${produits[4].imgUrl }" />
			<div class="description">${produits[4].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[5].prix}€</label>
			</div>
			<img src="${produits[5].imgUrl }" />
			<div class="description">${produits[5].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[6].prix}€</label>
			</div>
			<img src="${produits[6].imgUrl }" />
			<div class="description">${produits[6].description }</div>
		</div>

		<div class="block_produit">
			<div class="prix">
				<label>${produits[7].prix}€</label>
			</div>
			<img src="${produits[7].imgUrl }" />
			<div class="description">${produits[7].description }</div>
		</div>
 -->

<% } %>


<%
//tout ce qui est englobé dansla boucle audessu sera affiché uniquement si la bocule est vraie . J'ai du code html à l'interrieur de ma page que je conditionne
if(false){
	
%>
<h2>N'importe quoi</h2>

<%} %>
	</div>
	


</body>
</html>