package Advance;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;


public class Helloworldservlet extends javax.servlet.http.HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public Helloworldservlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		writer.println("welcome to sathya technology");
		writer.println("welcome to java full stack");
		writer.println("welcome to ratan sir classes");
		
		
	}

}
