package fr.afpa.produit;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.produit.bean.Produit;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Produit axe = new Produit("Axe", 3.50, "ressources/img/axe.jpg");
		Produit lait = new Produit("Lait", 2.63, "ressources/img/lait.jpg");
		Produit lindt = new Produit("Lindt", 4.45, "ressources/img/lindt.jpg");
		Produit evian = new Produit("Evian", 3.41, "ressources/img/evian.jpg");
		Produit baguette = new Produit ("Baguette", 2.12, "ressources/img/baguette.jpg");
		Produit the = new Produit("the", 1.69, "ressources/img/the.jpg");
		Produit cristaline = new Produit("Cristaline", 1.30, "ressources/img/cristaline.jpg");
		Produit cafe = new Produit("Café", 1.23, "ressources/img/cafe.jpg");
		
		//Produit [] produits = {axe, lait, lindt, evian, baguette, the, cristaline, cafe}; //j'ai appelé le tableau "produits"
		//ou ce tableau car il est plus puissant que le tableau classique : on doit plus passer par des boucles for par exemple
		
		ArrayList<Produit> produits = new ArrayList<>();
		produits.add(axe);
		produits.add(lait);
		produits.add(lindt);
		produits.add(evian);
		produits.add(baguette);
		produits.add(the);
		produits.add(cristaline);
		produits.add(cafe);
		
		
		request.setAttribute("produits", produits);
		
		
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/produit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
