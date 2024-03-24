package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/addproductservlet")
public class addproductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		//Read the data
				String proid=request.getParameter("proId");
				 String proname=request.getParameter("proName");
				   Double proprice=Double.parseDouble(request.getParameter("proPrice"));
				 String probrand=request.getParameter("proBrand");
				 String proMadeIn=request.getParameter("proMadeIN");
				 Date proMfgDate=Date.valueOf(request.getParameter("ManufactureDate"));
				 Date proExpDate=Date.valueOf(request.getParameter("ExpiryDate"));
				 Part part=request.getPart("Image");
				 InputStream inputstream=part.getInputStream();
				 
				 //Using above Details create the Product Object
				 
				 product product=new  product(); 
						 
				 product.setProId(proid);
				 product. setProName(proname);
				 product.setProPrice(proprice);
				 product.setProBrand(probrand);
				 product.setProMadeIn(proMadeIn);
				 product.setProMfgDate(proMfgDate);
				 product.setProExpDate(proExpDate);
				 product.setProImage(proImage);
				 //giving the product object to DAO layer.
				 productDao productDao=new productDao();
				 int result=productDao.save(product);
				 
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("This is product servlet");
			}

		
		
		
		
		
		
	}


