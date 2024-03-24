package com.sathya.servlet;

import java.sql.Date;

public class product {

	 private String pid;
	 private String proname;
	 private double proprice;
	 private String probrand;
	 private String promadein;
	 private Date promnfdate;
	 private Date proexpdate;
	 private byte[]proImage;
	public product(String pid, String proname, double proprice, String probrand, String promadein, Date promnfdate,
			Date proexpdate, byte[] proImage) {
		super();
		this.pid = pid;
		this.proname = proname;
		this.proprice = proprice;
		this.probrand = probrand;
		this.promadein = promadein;
		this.promnfdate = promnfdate;
		this.proexpdate = proexpdate;
		this.proImage = proImage;
	}
	
	
	public product() {
		// TODO Auto-generated constructor stub
	}


	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public double getProprice() {
		return proprice;
	}
	public void setProprice(double proprice) {
		this.proprice = proprice;
	}
	public String getProbrand() {
		return probrand;
	}
	public void setProbrand(String probrand) {
		this.probrand = probrand;
	}
	public String getPromadein() {
		return promadein;
	}
	public void setPromadein(String promadein) {
		this.promadein = promadein;
	}
	public Date getPromnfdate() {
		return promnfdate;
	}
	public void setPromnfdate(Date promnfdate) {
		this.promnfdate = promnfdate;
	}
	public Date getProexpdate() {
		return proexpdate;
	}
	public void setProexpdate(Date proexpdate) {
		this.proexpdate = proexpdate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	 

}
