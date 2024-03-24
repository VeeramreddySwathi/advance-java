package springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
	@Autowired
	private Emailservice emailservice;
	@Autowired
	 private Javacourseservice javacourseservice;
	@Autowired
	/*public student(Emailservice emailservice, Javacourseservice javacourseservice) {
		super();
		this.emailservice = emailservice;
		this.javacourseservice = javacourseservice;
	}*/
	
	
	public Emailservice getEmailservice() {
		return emailservice;
	}
	@Autowired
	public void setEmailservice(Emailservice emailservice) {
		this.emailservice = emailservice;
	}
	public Javacourseservice getJavacourseservice() {
		return javacourseservice;
	}
	@Autowired
	public void setJavacourseservice(Javacourseservice javacourseservice) {
		this.javacourseservice = javacourseservice;
	}

	public void details()
	 {
		 emailservice.message();
		 javacourseservice.courseInfo();
}
	
}