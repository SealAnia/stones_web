package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import necklace.DiamondNecklace2;
import stone.Diamond;

/**
 * Servlet implementation class AddDiamondServlet
 */
public class AddDiamondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDiamondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/jsp/AddDiamond.jsp";
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		String diamondClarity = request.getParameter("diamondClarity");
		Double diamondWeight = Double.valueOf(request.getParameter("diamondWeight"));
		Diamond diamond = new Diamond(Diamond.NAME, Diamond.COLOR, diamondWeight,
				Diamond.PRICEFORUNIT, diamondClarity);
		DiamondNecklace2 diamondNecklace = DiamondNecklace2.getInstance();
		diamondNecklace.add(diamond);
		writer.println(diamond.toString());
		
		request.setAttribute("diamondClarity", diamondClarity);
		request.setAttribute("diamondWeight", diamondWeight);
		
	    doGet(request, response);
	}

}
