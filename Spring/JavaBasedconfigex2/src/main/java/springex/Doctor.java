package springex;

public class Doctor {
   private int id;
   private String name;
  

public Doctor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}
  public void doctorInfo()
   {
   System.out.println("hey"+id+"welcome to java");
   System.out.println("hey"+name+"welcome to java");
   
}
}