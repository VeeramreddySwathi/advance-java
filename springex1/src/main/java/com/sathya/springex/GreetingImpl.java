package com.sathya.springex;

public class GreetingImpl  implements Greeting{
 @Override
	public void greet() {
		
	

	System.out.println("This is a spring first example");
	System.out.println("Rantan sir wow....");
}
 public GreetingImpl()
{
	System.out.println("GreetingImpl constructor::object created");

 }
}
