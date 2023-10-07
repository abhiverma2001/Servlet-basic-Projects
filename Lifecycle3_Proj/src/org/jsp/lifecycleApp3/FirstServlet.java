package org.jsp.lifecycleApp3;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/fs",loadOnStartup=3)
public class FirstServlet extends GenericServlet{
	public FirstServlet() {
		System.out.println("Servlet object is created");
	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Servlet Object is initialized");
	}
@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("nm");
    String place=req.getParameter("pl");
	String mobile=req.getParameter("mn");
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor='yellow'>"
			+ "<h1>Student name is "+name+" from "
					+place+ " and "+mobile+"</h1>" +"</body></html>");
	out.close();
	System.out.println("service method is executed");
	}
 @Override
 public void destroy() {
	 System.out.println("Closed all the costly resources!!");
 }

}