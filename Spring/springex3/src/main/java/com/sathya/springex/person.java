package com.sathya.springex;

public class person {
  private String name;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  public void personinfo()
  {
	  System.out.println("hey"+name+"chinnu");
	  System.out.println("hey"+email+"chinuu@gmail.com");
  }
}
