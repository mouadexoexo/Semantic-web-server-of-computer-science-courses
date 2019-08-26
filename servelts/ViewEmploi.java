package com.javaschedule.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaschedule.beans.EmploiBean;
import com.javaschedule.dao.EmploiDao;


/**
 * Servlet implementation class ViewEmploi
 */
@WebServlet("/ViewEmploi")
public class ViewEmploi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ViewEmploi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Collection<EmploiBean> list= EmploiDao.getSchedule();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Emploi</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navenseignant.html").include(request, response);
		out.println("<div class='container'>");
		out.print("<h1>View Emploi</h1>");
	
		
		out.println("<table class='table table-bordered table-striped'>");
		//out.print("<tr> <th></th><th>8 - 10</th><th>10 - 12</th><th>02 - 04</th><th>04 - 06</th></tr>");
		for(EmploiBean bean:list){
		/*out.print("<tr>"+
					"<td>"+bean.getJour()+"</td>" +
					"<tr>"+
					"</tr>"+
					"<td>"+bean.getHeur()+"</td>" +
					"<tr>"+
					"</tr>"+
					
					"<td>"+bean.getSeance()+"</td>" +
					"<tr>"+
					"</tr>"+
				
					"<td>"+bean.getSalle()+"</td>" +
					
					"</tr>");
		*/
		out.print("<tr>"+
					"<td>Seance (code : "+bean.getSeance()+ ") " +bean.getJour()+" de "+" "+bean.getH_debut()+" A" + " " +bean.getH_fin() +"</td>" +
					"<td>"+bean.getType_seance()+"</td>" +
					"<td>"+bean.getC_matiere()+" ( <span>"+bean.getLibelle_matiere()+" ) </span></td>" +
					"<td>"+bean.getSalle()+"</td>" +
					"<td>"+bean.getType_salle()+"</td>" +
					"<td>"+bean.getNom()+"</td>" +
					
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