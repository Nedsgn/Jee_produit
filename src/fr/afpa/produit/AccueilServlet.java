package fr.afpa.produit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.produit.bean.Personne;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Personne jj = new Personne("James", "Jack", 45, 1.78, 80);//creation d'un objet avec la class Personne
		
		Personne st = new Personne("Savage", "Tiger", 25, 1.70, 69);
		
		Personne gr = new Personne("Glave", "Rebecca", 32, 1.63, 59);
		
		Personne bm = new Personne("Bros","Mario", 78, 1.58, 89);
		
		
		/*String nom = "james";
	String prenom ="jack";
	int age = 45;
	double taille = 1.80;
	double poids = 80;
	
	String nom1 = "Savage";
	String prenom1 ="Tiger";
	int age1 = 25;
	double taille1 = 1.70;
	double poids1 = 69;
	
	String nom2 = "Glave";
	String prenom2 ="Rebecca";
	int age2 = 32;
	double taille2 = 1.63;
	double poids2 = 59;*/
		
		
		
		//on décide de faire un tableau pour éviter de mettre 36 fois setattribute
		
		Personne[] personnes = {jj, st, gr, bm};//on met que des objets de type Personne
		
		request.setAttribute("personnes", personnes);//ici on envoie le tableau Personne à la jsp
	
/*	request.setAttribute("jj", jj); //ici on envoie juste l'objet par le setAttribute
	request.setAttribute("st", st);
	request.setAttribute("gr", gr);
	request.setAttribute("bm", bm);
	*/
	
	
	//--------------ici on a une duplication de code. Grâce à la création d'une class Personne on peut creer des objets qui remplacerons toutes ces lignes
	
/*	request.setAttribute("nom", nom);
	request.setAttribute("prenom", prenom);
	request.setAttribute("age", age);
	request.setAttribute("taille", taille);
	request.setAttribute("poids", poids);
	
	request.setAttribute("nom1", nom1);
	request.setAttribute("prenom1", prenom1);
	request.setAttribute("age1", age1);
	request.setAttribute("taille1", taille1);
	request.setAttribute("poids1", poids1);
	
	
	request.setAttribute("nom2", nom2);
	request.setAttribute("prenom2", prenom2);
	request.setAttribute("age2", age2);
	request.setAttribute("taille2", taille2);
	request.setAttribute("poids2", poids2);*/
	
	
	
	this.getServletContext().getRequestDispatcher("/WEB-INF/pages/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
