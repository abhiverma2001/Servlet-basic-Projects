package org.jsp.ui1App;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends GenericServlet{
@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("nm");
	String place=req.getParameter("pl");
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor='yellow'>"
			+ "<h1>Student name is "+name+" from "
					+place+ "</h1>" +"</body></html>");
	out.close();	
		
	}

	

}
