function ConvertToINR()
{
	const dollarinput=document.getElementById('dollerInput').value;
	
	const INR=(parseFloat(dollarinput*82.89));
	
	document.getElementById('INROutput').value=INR.toFixed(2);
}