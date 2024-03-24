package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class Name<printwriter> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, Object Middlename) throws ServletException, IOException {
		
		
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
			PrintWriter  writer=response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<h1>full name.....</h1>");
			writer.println(firstname+" "+middlename+" "+lastname+" "+status);
			writer.println("</html>)");
			
			
		}
		
	}

		

}
