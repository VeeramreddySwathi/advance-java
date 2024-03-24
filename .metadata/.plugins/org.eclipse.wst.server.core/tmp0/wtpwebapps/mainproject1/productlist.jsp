<%@page import="com.sathya.servlet.ProductDao1" import="java.util.Base64"%>
<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Product List</title>
<!--  BootStrap CDN Link to Get the Support of BootStrap -->
	<link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link> 
</head>

<body>
<div class="text-center md-1 text-success">
 <h1>List of Available Products</h1>
</div>
<div>
<a href="add-product.html" class="btn btn-success">Save Product</a>
</div>
<div>
 <input type="text" placeholder="search"/>
</div>
<div>
 <c:if test="${saveResult==1}">
 <h1 class="text-danger  text-center">Data Inserted successfully...</h1>
 </c:if>
</div>
	<table class="table table-bordered table-stripped">
	<thead class="thread-dark">
	<tr>
	<th>product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Brand</th>
		<th>Product MadeIn</th>
		<th>Product MfcDate</th>
		<th>Product ExpDate</th>
		<th>Product Image</th>
	</tr>
</thead>
<tbody>
 <c:forEach  var="product" items="<%=new ProductDao1().findAll()%>" >	
 <tr>
	<td>${product.pid}</td> 
	<td>${product.proname}</td> 
	<td>${product.proprice}</td> 
	<td>${product.probrand}</td> 
	<td>${product.promadein}</td> 
	<td>${product.promnfdate}</td> 
	<td>${product.proexpdate}</td> 
	<td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="ProductImage" style="max-width:100px; max-height:100px;"> </td> 
	</tr>
	</c:forEach>
</tbody>
	</table>
</body>
</html>