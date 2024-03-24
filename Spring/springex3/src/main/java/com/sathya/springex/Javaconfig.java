package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
@Bean
public person person1()
{

	person person1=new person();
	person1.setName("chinnu");
	person1.setEmail("chinnu@11gmail.com");
	return person1;
}
	@Bean
	public person person2() {
	person person2=new person();
	person2.setName("chinna");
	person2.setEmail("chinna@11gmail.com");
	return person2;
}
	@Bean
	public person person3() {
	person person3=new person();
	person3.setName("nani");
	person3.setEmail("nani@11gmail.com");
	return person3;
}
}






