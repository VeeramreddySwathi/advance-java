package springex.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
@Bean
public Emailservice emailservice()
{
	Emailservice emailservice=new Emailservice();
	return emailservice;
}
@Bean
public Javacourseservice javacourseservice()
{
	Javacourseservice javacourseservice=new Javacourseservice();
	return javacourseservice;
}
	@Bean
	public Student student()
	{
	Student student=new Student();
	student.setEmailservice(emailservice());
	student.setJavacourseservice(javacourseservice());
	return student;
	
	}
}

