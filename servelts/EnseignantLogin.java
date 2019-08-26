package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaschedule.beans.EnseignantJobBean;
import com.javaschedule.dao.EnseignantDao;

@WebServlet("/EnseignantLogin")
public class EnseignantLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Enseignant Panel</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navenseignant.html").include(request, response);
		out.println("<div class='container'>");
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		
		

		boolean status = EnseignantDao.validate(email, password);
		
		/*out.print("<form action='ViewEnseignantJob' method='get' >");
		out.print("<input type='text' name='email' value='"+ email +"' />");
		out.print("</form>");*/
		
		if(status){
			HttpSession session=request.getSession();
			session.setAttribute("enseignant","true");
			//request.getRequestDispatcher("enseignanthome.html").include(request, response);
			out.println("<div class='container'>");

			out.print("<h1>View Mes Seances </h1>");
			
	    	Collection<EnseignantJobBean> list = EnseignantDao.getAllSessionsByEmail(email);
	    	
			out.println("<table class='table table-bordered table-striped'>");
			out.print("<tr><th>Seance</th><th>Matiere</th><th>Salle</th><th>Materiel</th></tr>");
			for(EnseignantJobBean bean:list){
				out.print("<tr>"+
						"<td>"+bean.getSeance()+"</td>" +
						"<td>"+bean.getMatiere()+"</td>" +
						"<td>"+bean.getSalle()+"</td>" +
						"<td>"+bean.getMateriel()+"</td>" +
						"</tr>");
			}
			out.println("</table>");
				
			out.println("</div>");
			
		}else{
			out.println("<h1>Enseignant Login Form</h1>");
			out.println("<p>Sorry, username or password error!</p>");
			request.getRequestDispatcher("enseignantLoginForm.html").include(request, response);
		}
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
		
	}

}
