package springex.springex;

public class Student {
 private Emailservice emailservice;
 private Javacourseservice javacourseservice;
public Emailservice getEmailservice() {
	return emailservice;
}
public void setEmailservice(Emailservice emailservice) {
	this.emailservice = emailservice;
}
public Javacourseservice getJavacourseservice() {
	return javacourseservice;
}
public void setJavacourseservice(Javacourseservice javacourseservice) {
	this.javacourseservice = javacourseservice;
}
 public void details()
 {
	 emailservice.message();
	 javacourseservice.courseInfo();
 }
}
