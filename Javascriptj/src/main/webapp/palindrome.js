function ConvertToReverseString() {
    const stringIn = document.getElementById('String').value; // Corrected variable name
    let i;
    let stringOut = ""; // Changed variable name and initialized as empty string
    for (i = stringIn.length - 1; i >= 0; i--) {
        stringOut += stringIn[i]; // Concatenate characters to form the reversed string
    }
    document.getElementById('ReverseString').value = stringOut; // Corrected variable name
  if(stringIn===stringOut)
  {
	  alert("its a palindrome");
	  }
	  else{
		  alert("its not a palindrome")
		  
	  }
  }
