package com.sathya.springex;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-configi.xml");
    	
    	// get the bean
    	Traveller Traveller=context.getBean("Traveller",Traveller.class);
    	Traveller.startjourney();
    }
}
