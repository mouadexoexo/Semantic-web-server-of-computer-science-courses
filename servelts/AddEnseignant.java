package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaschedule.beans.EnseignantBean;
import com.javaschedule.dao.EnseignantDao;



@WebServlet("/AddEnseignant")
public class AddEnseignant extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Accountant Added</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		
		int id = new Integer(request.getParameter("id"));
		
		String nom=request.getParameter("nom");
	 	String prenom=request.getParameter("prenom");
		String cin=request.getParameter("cin");
		String tel=request.getParameter("tel");
		String adresse=request.getParameter("adresse");
		String email=request.getParameter("email");

		String departement=request.getParameter("departement");
		String sexe=request.getParameter("sexe");
		String password=request.getParameter("password");
		
		EnseignantBean bean=new EnseignantBean(id, nom, prenom, cin, tel, adresse, email, departement, sexe, password);
		
		//int status=EnseignantDao.save(bean);
		
		out.print("<h1>Add Accountant Form</h1>");
		out.println("<p>Accountant is added successfully!</p>");
		request.getRequestDispatcher("AddEnseignant.html").include(request, response);
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
