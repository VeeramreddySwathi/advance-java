package springex;

import org.springframework.stereotype.Component;

@Component
public class Javacourseservice implements courseservice {

	@Override
	public void courseInfo() {
		System.out.println("Java full stack development....");
		System.out.println("corejava,adva java,spring,springboot");
		
	}
	}


