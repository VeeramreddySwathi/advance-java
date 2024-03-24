package com.sathya.springex;

public class Bus implements vehicle {
	private String BusType;
	private int Maxspeed;
	public String getBusType() {
		return BusType;
	}
	public void setBusType(String busType) {
		BusType = busType;
	}
	public int getMaxspeed() {
		return Maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
	@Override
	public void move() {
		System.out.println("your selected bus vehicle");
		System.out.println("BusType..."+BusType);
		System.out.println("Maxspeed..."+Maxspeed);
	}
	

}
