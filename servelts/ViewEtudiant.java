package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaschedule.beans.EtudiantFiliereCursusBean;
import com.javaschedule.dao.EtudiantDao;

/**
 * Servlet implementation class ViewEtudiant
 */
@WebServlet("/ViewEtudiant")
public class ViewEtudiant extends HttpServlet {

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Etudiant</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navenseignant.html").include(request, response);
		out.println("<div class='container'>");
		out.print("<h1>View Etudiants</h1>");
	
		Collection<EtudiantFiliereCursusBean> list= EtudiantDao.getAllRecords();
		
		
		out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Id</th><th>Nom</th><th>Prenom</th><th>CIN</th><th>Tel</th><th>Adresse</th><th>Email</th><th>Departement</th><th>Cursus</th><th>Filiére</th><th>CNE</th><th>Apogee</th>"
				+ "</tr>");
		for(EtudiantFiliereCursusBean bean:list){
			out.print("<tr>"+
					"<td>"+bean.getEtudiant().getId()+"</td>" +
					"<td>"+bean.getEtudiant().getNom()+"</td>" +
					"<td>"+bean.getEtudiant().getPrenom()+"</td>" +
					"<td>"+bean.getEtudiant().getCin()+"</td>" +
					"<td>"+bean.getEtudiant().getTel()+"</td>" +
					"<td>"+bean.getEtudiant().getAdresse()+"</td>" +
					"<td>"+bean.getEtudiant().getEmail()+"</td>" +
					"<td>"+bean.getEtudiant().getDepartement()+"</td>" + 
					"<td>"+bean.getCursus()+"</td>" + 
					"<td>"+bean.getFiliere()+"</td>" + 
					//"<td>"+bean.getEtudiant().getSexe()+"</td>" + 
					"<td>"+bean.getEtudiant().getCne()+"</td>" + 
					"<td>"+bean.getEtudiant().getApogee()+"</td>" + 
				
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