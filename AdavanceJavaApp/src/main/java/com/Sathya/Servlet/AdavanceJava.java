package com.Sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdavanceJava extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public AdavanceJava() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer=response.getWriter();
		writer.println("welcome to advance java");
		writer.println("welcome to ratan sir classes");
		
		
	}

		
	}


