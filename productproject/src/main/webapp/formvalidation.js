function validateForm()
{
	var proid=document.getElementById("proId").value;
	var proname=document.getElementById("proName").value;
	var proprice=document.getElementById("proPrice").value;
	var probrand=document.getElementById("proBrand").value;
	
	if(proid.trim()==="" || proname.trim()==="" || proprice.trim()==="" || probrand.trim()==="" || promadein.trim())
	{
		alert("all fields must be filled  out");
		return false;
	}
	   if(parseFloat(proprice)<0)
	   {
		alert("proprice must be a non-negative value");
		return false;
       }	
	if(proname.length>50 || probrand.length>50)
	{
		alert("product name and probrand must be less than 50 characters");
		return false;
	}
	//read the mfg&exp dates
	var promfgdate=document.getElementById("ManufactureDate").value;
	var proexpdate=document.getElementById("ExpiryDate").value;
	//convert into date format
	var manufacturingDateObj=new Date("promfgdate");
	var expiryDateObj=new Date("proexpdate");
	//check the validition of dates
	if(manufacturingDateObj>expiryDateObj)
	{
		alert("Manufacturinf date cannot be grater than expiry date.");
		return false;
	}
	 return true;
}