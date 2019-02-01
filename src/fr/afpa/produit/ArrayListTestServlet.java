package fr.afpa.produit;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArrayListTestServlet
 */
@WebServlet("/test")
public class ArrayListTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArrayListTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> villes = new ArrayList<>();
		
		villes.add("France");
		villes.add("Espagne");
		villes.add("Belgique");
		villes.add("Suisse");
		villes.add("Canada");
		villes.add("USA");
		villes.add("Chine");
		
		System.out.println("Taille de mon tableau : " + villes.size());
		
		System.out.println(villes.get(0));
		
	villes.remove(2);
		 //vide le tableau
		
		//villes.set(2,"Belgium");//pour modifier la valeur de l'indice 2
		//villes.clear();
		
		if(villes.contains("France")) {
			System.out.println("Nous sommes en France");
		}
		
		if(villes.contains("Belgique")) {
			System.out.println("Nous sommes en Belgique");
		}
		request.setAttribute("villes", villes);
		
		//ArrayList<String> tableau = new ArrayList<>();
		//String[] tableau
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/arraylist.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
