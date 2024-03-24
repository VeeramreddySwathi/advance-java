package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Login() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String Username=request.getParameter("username");
		String password=request.getParameter("password");
		String Status;
		 
		if(Username.equals("sathya")&& password.equals("sathya@123"))
		{
			Status="Login Sucessful...";
		}
		else
		{
			Status="Login Fail...";
		}
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.print("<html>");
		writer.print("<h1>LoginStatus....</h1>"+Status);
		
		writer.print("</html>");
		
			
			

		


		
		
	}

		}


