package adavance;
class Employee1
{
int empid;
String empname;
double empsalary;
public Employee(int empid, String empname, double empsalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
}



	@Override
public String toString() {
	return "Employee1 [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
}
}
	
	public class Employee {

	public Employee(int i, String string, int j) {
			// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) {
		Employee employee=new Employee(1001,"mrs.swathi",10000);
		System.out.println(employee);
		// TODO Auto-generated method stub
	}
	}


