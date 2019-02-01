package fr.afpa.produit.bean;

public class Utilisateur {
private String nom;
private String prenom;
private int age;
private String urlImage;

public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public Utilisateur(String nom, String prenom, int age, String urlImage) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.urlImage = urlImage;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getUrlImage() {
	return urlImage;
}
public void setUrlImage(String urlImage) {
	this.urlImage = urlImage;
}



}
