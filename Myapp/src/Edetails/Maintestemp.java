package Edetails;
class Emp1{
	int eid;
	String enmae;
	double esal;



public Emp1(int eid, String enmae, double esal) {
		super();
		this.eid = eid;
		this.enmae = enmae;
		this.esal = esal;
	}



@Override
public String toString() {
	return "Emp1 [eid=" + eid + ", enmae=" + enmae + ", esal=" + esal + "]";
}



		// TODO Auto-generated constructor stub
	}



public class Maintestemp {

	public static void main(String[] args) {
		Emp1 e=new Emp1(1010,"swathi",20000);
		System.out.println(e);
		// TODO Auto-generated method stub

	}

}
