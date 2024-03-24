package springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
      System.out.println("@@@@@@");
      patient patient=context.getBean("patient",patient.class);
      patient.details();
    }
}
