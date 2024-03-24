package com.sathyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
   
       	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				//read the data
       		
				int proid=Integer.parseInt(request.getParameter("Product ID"));
				String Proname=request.getParameter("Product name");
				double proprice=Double.parseDouble(request.getParameter("Product Price"));
				int proquantity=Integer.parseInt(request.getParameter("Product Price"));
				//step-2;process the data
				
				double totalbill,discount,netamount;
				totalbill=proprice*proquantity;
				 if(totalbill<1000)
					 discount=0;
				 else if(totalbill>=1000  && totalbill<5000)
					 discount=0.05*totalbill;
				 else if(totalbill>=5000 && totalbill<10000)
					 discount=0.1*totalbill;
				 else
					 discount=1.5*totalbill;
				 netamount=totalbill-discount;
				 
				 
				 
				 //step;3 render the response
				 
				 response.setContentType("text/html");
				 PrintWriter Writer=response.getWriter();
				 Writer.println("<html>");
				 Writer.println("<body bgcolor=pink>");
				 Writer.println("<h1>......Product Bill......</h1>");

				 Writer.println("ProductID:"+proid+"<br><br>");
				 Writer.println("Product name:"+Proname+"<br><br>");
				 Writer.println("product Price:"+proprice+"<br><br>");
				 Writer.println("Product Quantity:"+proquantity+"<br><br>");
				 Writer.println("Total Billamount:"+totalbill+"<br><br>");
				 Writer.println("Discount Amount:"+discount+"<br><br>");
				 Writer.println("Net Amount to pay:"+netamount+"<br><br>");
				 Writer.println("</body>");
				 Writer.println("</html>");
		
		}

}
