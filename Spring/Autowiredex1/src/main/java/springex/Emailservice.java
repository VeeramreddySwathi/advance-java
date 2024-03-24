package springex;

import org.springframework.stereotype.Component;

@Component
public class Emailservice implements messageservice {

	@Override
	public void message() {
		System.out.println("your email updated....");
		System.out.println("check your email once....");
	}
}

