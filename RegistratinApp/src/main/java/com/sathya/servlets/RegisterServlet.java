package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	

      
        
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step-1: read the form
			
			String usearname=request.getParameter("usearname");
			String password=request.getParameter("password");
			long mobile=Long.parseLong(request.getParameter("mobile"));
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String DOB=request.getParameter("DOB");
			String[]quals=request.getParameterValues("Qualification"); 
			String Country=request.getParameter("Country");
			String[] languages=request.getParameterValues("languages");
			String comments=request.getParameter("comments");
			
			
			//step-2:
			
			String q=String.join(",", quals);
			String l=String.join("-",languages);
			
			//step-3:Render the data
			
			response.setContentType("text/html");
			PrintWriter	writer=response.getWriter();
			writer.println("<body bgcolor=pink");
			writer.println("<h1>RESTRATION FORM....<br></h1>");
			writer.println("your name="+usearname+ "<br>");
			writer.println("password="+password+"<br>");
			writer.println("mobile="+mobile+"<br>");
			writer.println("email="+email+"<br>");
			writer.println("gender="+gender+"<br>");
			writer.println("DOB="+DOB+"<br>");
			writer.println("Qualification="+q+"<br>");
			writer.println("Country="+Country+"<br>");
			writer.println("languages="+l+"<br>");
			writer.println("Comments:"+comments);
			
			writer.println("</body>");
			writer.println("</html>");
		
			
					
			
			
		
			
			
			
			

			
			
			
			
			
			
			
	}

}
