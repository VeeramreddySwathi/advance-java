package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Nameformat")
public class Nameformat extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Nameformat() 
    {
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	


	String firstname=request.getParameter("Firstname");
	String middlename=request.getParameter("Middlename");
	String lastname=request.getParameter("Lastname");
	
		{
			String status;
		if(firstname.equals("swathi")&&middlename.equals("reddy")&&lastname.equals("veeram"))
		{
			status="Login Successful....";
		
		}
		else
		{
			status="Login fail...";
			
		}
		PrintWriter Writer=response.getWriter();
		response.setContentType("text/html");
		Writer.println("<html>");
		Writer.println("<h1>full name.....</h1>");
		Writer.println(firstname+" "+middlename+" "+lastname+" "+status);
		Writer.println("</html>)");
		
		
	}
	
}

	

}