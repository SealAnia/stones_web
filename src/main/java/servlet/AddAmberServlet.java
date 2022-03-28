package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import necklace.AmberNecklace2;
import stone.Amber;

/**
 * Servlet implementation class AddAmberServlet
 */
public class AddAmberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAmberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/jsp/AddAmber.jsp";
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		Integer amberClarity = Integer.valueOf(request.getParameter("amberClarity"));
		Double amberWeight = Double.valueOf(request.getParameter("amberWeight"));
		Amber amber = new Amber(Amber.NAME, Amber.COLOR, amberWeight,
				Amber.PRICEFORUNIT, amberClarity);
		AmberNecklace2 amberNecklace = AmberNecklace2.getInstance();
		amberNecklace.add(amber);
		writer.println(amber.toString());
		
		request.setAttribute("amberClarity", amberClarity);
		request.setAttribute("amberWeight", amberWeight);
		
	    doGet(request, response);
	}

}
