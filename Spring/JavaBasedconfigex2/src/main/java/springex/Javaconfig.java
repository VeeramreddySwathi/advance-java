package springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig{


@Bean
public  Doctor doctor()
{
	Doctor doctor=new Doctor(1,"radha");
	return doctor;
}
@Bean
public  Phamarcy phamarcy()
{
   Phamarcy phamarcy=new Phamarcy("durga","hyderabad");
   return phamarcy;
}
@Bean
public patient patient()
{
	patient patient=new patient("raju",20,doctor(),phamarcy());
	return patient;
	}
}
