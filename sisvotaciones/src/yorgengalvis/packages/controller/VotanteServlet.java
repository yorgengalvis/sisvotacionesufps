package yorgengalvis.packages.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yorgengalvis.packages.dao.*;
import yorgengalvis.packages.models.Votante;




/**
 * Servlet implementation class VotanteServlet
 */
@WebServlet("/")
public class VotanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		private VotanteDAO votanteDAO;
	
    /**
     * Default constructor. 
     */
    public VotanteServlet() {
        super();
    }
    
    public void init() throws ServletException {
		// TODO Auto-generated method stub
		String type="postgre";
		this.votanteDAO = VotanteDAOFactory.getVotanteDao(type);
	}
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
		try {
			
		
		switch(action) {
			case "/new": newVotante(request,response);
				break;
			case "/edit": editVotante(request,response);
				break;
 			case "/delete": deleteVotante(request,response);
				break;
			default: 
				listadoVotantes(request,response);
			
				break;
		}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	private void newVotante (HttpServletRequest request,HttpServletResponse response ) 
			throws ServletException, SQLException, IOException{
		
		/*List<Usuario> listUsuarios  = usuarioDao.selectAll();
		request.setAttribute( "listUsuarios", listUsuarios);*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("new.jsp");
		dispatcher.forward(request,response);
	}
	
	private void editVotante(HttpServletRequest request,HttpServletResponse response ) 
			throws ServletException, SQLException, IOException{
		
		/*List<Usuario> listUsuarios  = usuarioDao.selectAll();
		request.setAttribute( "listUsuarios", listUsuarios);*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
		dispatcher.forward(request,response);
	}
	
	private void deleteVotante(HttpServletRequest request,HttpServletResponse response ) 
			throws ServletException, SQLException, IOException{
		
		/*List<Votante> votantes=VotanteDAO.selectAll();
		request.setAttribute( "listVotantes", votantes);
		*/
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request,response);
	}
	
	private void listadoVotantes (HttpServletRequest request,HttpServletResponse response ) 
			throws ServletException, SQLException, IOException{
		
		List<Votante> listVotantes  = votanteDAO.selectAll();
		request.setAttribute( "listVotantes", listVotantes);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
		dispatcher.forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
