package fr.afpa.produit.bean;

public class Produit {
	private String description;
	private double prix;
	private String imgUrl;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String description, double prix, String imgUrl) {
		super();
		this.description = description;
		this.prix = prix;
		this.imgUrl = imgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	

}
