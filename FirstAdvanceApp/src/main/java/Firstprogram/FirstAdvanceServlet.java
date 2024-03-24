package Firstprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/swathi")
public class FirstAdvanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter  writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<h1>welcome to satya tech</h1>");
		writer.println("<h2>welcome to advance java</h2>");
		writer.println("<h3>welcome to ratan sir</h3>");
		
			
	}

	
	}


