package fr.afpa.produit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.produit.bean.Utilisateur;

/**
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet("/utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		Utilisateur mb = new Utilisateur("bros", "aaron", 64, "ressources/img/user/aaron.jpg");
		Utilisateur ja = new Utilisateur("james", "alice", 24, "ressources/img/user/alice.jpg");
		Utilisateur sd = new Utilisateur("Steven", "Daryl", 34, "ressources/img/user/daryl.jpg");
		Utilisateur jd = new Utilisateur("Jhon", "Derek", 24, "ressources/img/user/derek.jpg");
		Utilisateur gl = new Utilisateur("Gordon", "Lance", 30, "ressources/img/user/lance.jpg");
		Utilisateur hl = new Utilisateur("Hamilton", "Lesa", 41, "ressources/img/user/lesa.jpg");
		Utilisateur ll = new Utilisateur("Lucky", "Luke", 52, "ressources/img/user/luke.jpg");
		Utilisateur mr = new Utilisateur("Mc cain", "Ryan", 24, "ressources/img/user/ryan.jpg");
		Utilisateur ds = new Utilisateur("Doherty", "Shannon", 21, "ressources/img/user/shannon.jpg");
		Utilisateur mw = new Utilisateur("Mc Guire", "Walter", 56, "ressources/img/user/walter.jpg");
		
Utilisateur [] utilisateurs = {mb, ja, sd, jd, gl, hl, ll, mr,ds, mw}; //plusieurs utilisateurs de même type
		
		request.setAttribute("utilisateurs", utilisateurs);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
