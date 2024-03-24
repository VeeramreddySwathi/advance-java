package com.sathya.servlet;

import java.io.InputStream;
import java.sql.Date;

public class product {

	
		
		
		private String proId;
		private String proName;
		private double proPrice;
		private String proBrand;
		private String proMadeIn;
		private  Date proMfgDate;
		private  Date proExpDate;
		private InputStream proImage;
		public product() {
			super();
			this.proId = proId;
			this.proName = proName;
			this.proPrice = proPrice;
			this.proBrand = proBrand;
			this.proMadeIn = proMadeIn;
			this.proMfgDate = proMfgDate;
			this.proExpDate = proExpDate;
			this.proImage = proImage;
		}
		public String getProId() {
			return proId;
		}
		public void setProId(String proId) {
			this.proId = proId;
		}
		public String getProName() {
			return proName;
		}
		public void setProName(String proName) {
			this.proName = proName;
		}
		public double getProPrice() {
			return proPrice;
		}
		public void setProPrice(double proPrice) {
			this.proPrice = proPrice;
		}
		public String getProBrand() {
			return proBrand;
		}
		public void setProBrand(String proBrand) {
			this.proBrand = proBrand;
		}
		public String getProMadeIn() {
			return proMadeIn;
		}
		public void setProMadeIn(String proMadeIn) {
			this.proMadeIn = proMadeIn;
		}
		public Date getProMfgDate() {
			return proMfgDate;
		}
		public void setProMfgDate(Date proMfgDate) {
			this.proMfgDate = proMfgDate;
		}
		public Date getProExpDate() {
			return proExpDate;
		}
		public void setProExpDate(Date proExpDate) {
			this.proExpDate = proExpDate;
		}
		public InputStream getProImage() {
			return proImage;
		}
		public void setProImage(InputStream proImage) {
			this.proImage = proImage;
		}
	}