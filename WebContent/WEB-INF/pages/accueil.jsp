<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
<link rel="stylesheet" href="ressources/css/accueil.css" />
</head>
<body>
<h1 >Accueil</h1>
<div id="nav"><i class="material-icons">
menu
</i><p>Menu</p></div>

<div id="panelNav">
<nav> <ul>
<li><a href="#">A propos</a></li>
<li><a href="#">Mes recettes</a></li>
<li><a href="#">Mes photographies</a></li>
<li><a href="#">Contact</a></li>

</ul>

</nav>
</div>

<div>
<p>Nom : ${personnes[0].nom }</p><!-- ici le Getter de la class Personne est appelé puisque le .nom est de base en private -->
<p>Prenom : ${personnes[0].prenom }</p>
<p>Age : ${personnes[0].age }</p>
<p>Poids : ${personnes[0].poids}</p>
<p>Taille : ${personnes[0].taille }</p>
<p>---------------------</p>
<p>Nom : ${personnes[1].nom }</p>
<p>Prenom : ${personnes[1].prenom }</p>
<p>Age : ${personnes[1].age }</p>
<p>Poids : ${personnes[1].poids}</p>
<p>Taille : ${personnes[1].taille }</p>
<p>---------------------</p>
<p>Nom : ${personnes[2].nom }</p>
<p>Prenom : ${personnes[2].prenom }</p>
<p>Age : ${personnes[2].age }</p>
<p>Poids : ${personnes[2].poids}</p>
<p>Taille : ${personnes[2].taille }</p>
<p>---------------------</p>
<p>Nom : ${personnes[3].nom }</p>
<p>Prenom : ${personnes[3].prenom }</p>
<p>Age : ${personnes[3].age }</p>
<p>Poids : ${personnes[3].poids}</p>
<p>Taille : ${personnes[3].taille }</p>


<!-- 
<p>Nom : ${jj.nom }</p><!-- ici le Getter de la class Personne est appelé puisque le .nom est de base en private -->
<!-- <p>Prenom : ${jj.prenom }</p>
<p>Age : ${jj.age }</p>
<p>Poids : ${jj.poids}</p>
<p>Taille : ${jj.taille }</p>
<p>---------------------</p>
<p>Nom : ${st.nom }</p>
<p>Prenom : ${st.prenom }</p>
<p>Age : ${st.age }</p>
<p>Poids : ${st.poids}</p>
<p>Taille : ${st.taille }</p>
<p>---------------------</p>
<p>Nom : ${gr.nom }</p>
<p>Prenom : ${gr.prenom }</p>
<p>Age : ${gr.age }</p>
<p>Poids : ${gr.poids}</p>
<p>Taille : ${gr.taille }</p>
<p>---------------------</p>
<p>Nom : ${bm.nom }</p>
<p>Prenom : ${bm.prenom }</p>
<p>Age : ${bm.age }</p>
<p>Poids : ${bm.poids}</p>
<p>Taille : ${bm.taille }</p>

-->

<!-- 
Vu qu'on a créé des objets dans la servlet , on doit appeller ces derniers et plus ceux là. De plus le fait d'avoir créer des objet permet de garder les memes noms des caractéristiques ici nom, prenom, age, tailel, poids

<p>Nom : ${nom }</p>
<p>Prenom : ${prenom }</p>
<p>Age : ${age }</p>
<p>Poids : ${poids}</p>
<p>Taille : ${taille }</p>
<p>---------------------</p>
<p>Nom : ${nom1 }</p>
<p>Prenom : ${prenom1 }</p>
<p>Age : ${age1 }</p>
<p>Poids : ${poids1}</p>
<p>Taille : ${taille1 }</p>
<p>---------------------</p>
<p>Nom : ${nom2 }</p>
<p>Prenom : ${prenom2 }</p>
<p>Age : ${age2 }</p>
<p>Poids : ${poids2}</p>
<p>Taille : ${taille2 }</p>

 -->


</div>
<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src= "http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
		<script type="text/javascript" src="ressources/js/accueil.js"></script>
</body>
</html>