package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaschedule.beans.EnseignantJobBean;
import com.javaschedule.dao.EnseignantDao;


/**
 * Servlet implementation class ViewEnseignantSeance
 */
@WebServlet("/ViewEnseignantJob")
public class ViewEnseignantJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEnseignantJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email2=request.getParameter("email2");
		//String password=request.getParameter("password");
		
		
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Session</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navenseignant.html").include(request, response);
		
		
		out.println("<div class='container'>");

		out.print("<h1>View EJB</h1>");
	
		
		//Collection<EnseignantBean> listenseignants = EnseignantDao.getAllEnseignants();
		
		/*out.print("<select name='ensselect' size='' id=''>");
		out.print("<option value='' selected>Selectioner Enseignant </option>");
		for(EnseignantBean ensbean:listenseignants){
			        out.print("<option value='"+ensbean.getId()+"' >"+ensbean.getNom() +" "+ensbean.getPrenom() +"</option>");
		}
		out.print("</select>");*/
		
		
    	
    	Collection<EnseignantJobBean> list= EnseignantDao.getAllSessions();
    	
		out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Matiere</th><th>Salle</th><th>Materiel</th><th>Seance</th></tr>");
		for(EnseignantJobBean bean:list){
			out.print("<tr>"+
					"<td>"+bean.getMatiere()+"</td>" +
					"<td>"+bean.getSalle()+"</td>" +
					"<td>"+bean.getMateriel()+"</td>" +
					"<td>"+bean.getSeance()+"</td>" +
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