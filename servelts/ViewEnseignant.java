package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaschedule.beans.EnseignantBean;
import com.javaschedule.dao.EnseignantDao;

/**
 * Servlet implementation class ViewEnseignant
 */
@WebServlet("/ViewEnseignant")
public class ViewEnseignant extends HttpServlet {

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Enseignant</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navenseignant.html").include(request, response);
		out.println("<div class='container'>");
		out.print("<h1>View Enseignant</h1>");
	
		Collection<EnseignantBean> list= EnseignantDao.getAllEnseignants();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Id</th><th>Nom</th><th>Prenom</th><th>CIN</th><th>Tel</th><th>Adresse</th><th>Email</th><th>Departement</th><th>Sexe</th></tr>");
		for(EnseignantBean bean:list){
			out.print("<tr>"+
					"<td>"+bean.getId()+"</td>" +
					"<td>"+bean.getNom()+"</td>" +
					"<td>"+bean.getPrenom()+"</td>" +
					"<td>"+bean.getCin()+"</td>" +
					"<td>"+bean.getTel()+"</td>" +
					"<td>"+bean.getAdresse()+"</td>" +
					"<td>"+bean.getEmail()+"</td>" +
					"<td>"+bean.getDepartement()+"</td>" + 
					"<td>"+bean.getSexe()+"</td>" + 
					//"<td>"+bean.getPassword()+"</td>" + 
				
					"</tr>");
		}
		out.println("</table>");
			
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
