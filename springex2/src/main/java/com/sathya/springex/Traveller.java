package com.sathya.springex;

public class Traveller {
	private String name;
	private long mobile;
	private String email;
	vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startjourney()
	{
		System.out.println("welcome to world tour");
		System.out.println("Hey"+name);
		System.out.println("check your mobile number"+mobile);
		System.out.println("mail id is"+email);
		vehicle.move();
	}
	

}
