package jdbcex2;
import java.util.*;
public class Employee 
{
	 int empid;
	 String empname;
	double empsalary;
	
	public Employee(int empid, String empname, double empsalary) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public Employee() 
	{
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary+"]";
}
}