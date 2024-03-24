package com.sathya.sarvlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet<printWriter> extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the requested data
    	
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
    
		//process the data
		 int result=0;
				switch(operation)
				{
				case "+": result=num1+num2;
				           break;
				     
				case "-": result=num1-num2;
			                break;	
			     
				case "*": result=num1*num2;
			                 break;
			     
				case "/": result=num1/num2;
			                 break;
			     
				case "%": result=num1%num2;
			                break;
				}
				
				//render the data to client
				response.setContentType("text/html");
			     PrintWriter writer=response.getWriter();	    
			     writer.println("<html>");
			     writer.println("<h1> --CALCULATOR FORM--  </h1>");
			     writer.println("<body bgcolor=pink>");
			     writer.println("<p>Your First Number="+num1+"</p>");
			     writer.println("<p>Your Second Number="+num2+"</p>");
			     writer.println("<p>Operation="+ operation+"</p>");
			     writer.println("<p>Result="+result+"</p>");
			     writer.println("</body>");
			     writer.println("</html>");
} 
}
    