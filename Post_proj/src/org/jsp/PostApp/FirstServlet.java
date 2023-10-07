package org.jsp.PostApp;
	import java.io.*;
	import java.sql.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	public class FirstServlet extends HttpServlet
	{
	@Override
	protected void doPost(HttpServletRequest req, 
	HttpServletResponse resp) throws ServletException, IOException 
	{
	String sid=req.getParameter("i");
	int id=Integer.parseInt(sid);
	String name=req.getParameter("nm");
	String dept=req.getParameter("dp");
	String sperc=req.getParameter("pr");
	double perc=Double.parseDouble(sperc);
	PrintWriter out=resp.getWriter( );
	out.println("<html><body bgcolor='yellow'>"
	 +"<h1>My Details are: "+name+" to "+dept+
	 " Department "+" and percentage "+perc+ "</h1>"+ "</body></html>");
	// PRESENTATION LOGIC //
	out.close( );
	Connection con=null;
	PreparedStatement pstmt=null;
	 String qry="insert into btm.student values(?,?,?,?)";
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	pstmt=con.prepareStatement(qry);
	// SET THE VALUE FOR PLACEHOLDER BEFORE EXECUTION //
	pstmt.setInt(1,id);
	pstmt.setString(2,name);
	pstmt.setString(3,dept);
	pstmt.setDouble(4,perc);
	 pstmt.executeUpdate( );
	// PERSISTENCE LOGIC //
	}catch (ClassNotFoundException | SQLException e)
	{
	e.printStackTrace( );
	}
	finally
	{
	if(pstmt!=null)
	{
	try {
	pstmt.close( );
	} catch (SQLException e) {
	e.printStackTrace( );
	}
	}
	if(con!=null)
	{
	try {
	con.close( );
	} catch (SQLException e) {
	e.printStackTrace( );
	             }
	           }
             }
           }
         }
	
