package org.jsp.lifecycleApp2;
	import java.io.*;
	import javax.servlet.*;
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
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>Student name is "+name+" from "
						+place+ "</h1>" +"</body></html>");
		out.close();
		System.out.println("service method is executed");
		}
	 @Override
	 public void destroy() {
		 System.out.println("Closed all the costly resources!!");
	 }

	}


