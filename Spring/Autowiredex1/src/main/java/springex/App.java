package springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springex.springex.Javaconfig;
import springex.springex.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
        Student student=context.getBean("student",Student.class);
        student.details();
    }
}