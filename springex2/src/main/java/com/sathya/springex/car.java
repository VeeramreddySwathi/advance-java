package com.sathya.springex;

public class car implements vehicle {
	private String fuelType;
	private int Maxspeed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxspeed() {
		return Maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
	@Override
	public void move() {
		System.out.println("Your selected car vehicle");
		System.out.println("Maxspeed..."+Maxspeed);
		System.out.println("FuelTypes..."+fuelType);
	}
	

}
