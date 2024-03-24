package springex;

public class patient {
 private String name;
 private int  age;
private  Doctor doctor;
 private Phamarcy phamarcy;
 
 public patient(String name, int age, Doctor doctor, Phamarcy phamarcy) {
	super();
	this.name = name;
	this.age = age;
	this.doctor = doctor;
	this.phamarcy = phamarcy;
}

public void details()
 {
	 doctor.doctorInfo();
	 phamarcy.phamarcyInfo();
 }
 


}
 

