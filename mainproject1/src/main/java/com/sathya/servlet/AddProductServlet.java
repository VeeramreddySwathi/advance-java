package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
@MultipartConfig
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
        
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
				// read the data from form
						String proid=request.getParameter("proid");
						String  proname=request.getParameter("proname");
						double proprice=Double.parseDouble(request.getParameter("proprice"));
						String  probrand=request.getParameter("probrand");
						String promadein=request.getParameter("madein");
						Date mnfdate=Date.valueOf(request.getParameter("manufacturedate"));
						Date expdate=Date.valueOf(request.getParameter("Proexpdate"));
						Part part=request.getPart("image");
						InputStream inputstream=part.getInputStream();
						
						//convert the input stream to byte array
						
						byte[] proimage= IOUtils.toByteArray(inputstream);
						
						//using above details create the product object
						product product=new product();
						 product.setPid(proid);
						 product.setProname(proname);
						 product.setProprice(proprice);
						 product.setProbrand(probrand);
						 product.setPromadein(promadein);
						 product.setPromnfdate(mnfdate);
						 product.setProexpdate(expdate);
						 product.setProImage(proimage);
						 
						 // send the data Dao1 layer
						 
						 ProductDao1 productdao1=new ProductDao1();
								int result=productdao1.save(product);
								if(result==1)
								{
									  // read the data and send to request
									   request.setAttribute("saveResult",result);
									RequestDispatcher dispatcher=request.getRequestDispatcher("productlist.jsp");
									dispatcher.forward(request, response);
								}
								else
								{
									response.setContentType("text/html");
									PrintWriter writer=response.getWriter();
									writer.println("data insertion fail.."+result);
									RequestDispatcher dispatcher=request.getRequestDispatcher("AddProduct.html");
									  dispatcher.include(request, response);
								}
						    	
					}
					
}