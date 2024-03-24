let name1=prompt("enter the  first name");
let name2=prompt("enter the second name");
let ratanmass=prompt("enter the mass");
let ratanheight=parseFloat(prompt("enter the height of ratan"));
let anumass=prompt("enter the mass of anu")
let anuheight=prompt("enter the height of ratan")
let BMIratan=(ratanmass/(ratanheight*ratanheight));
let BMIanu=(anumass/(anuheight*anuheight));
console.log(BMIratan);
console.log(BMIanu);
document.write(BMIratan)+"<br>";
document.write(BMIanu)+"<br>";
document.write(BMIratan>BMIanu)
console.log(BMIratan>BMIanu);