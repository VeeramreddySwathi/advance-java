package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
       
   
    
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response, ServletRequest session) throws ServletException, IOException {
		
		
		HttpSession Session=request.getSession(false);
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();

		writer.println("<html>");
		writer.println("<body");
		writer.println("username...."+Session.getAttribute("username"));
		writer.println("Age....."+Session.getAttribute("Age"));
		writer.println("Qualification...."+Session.getAttribute("Qualification"));
		writer.println("Designation....."+Session.getAttribute("Designation"));
		writer.println("Email..."+request.getParameter("Email"));
		writer.println("Mobile...."+request.getParameter("Mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		
		
		
		
	}

}
