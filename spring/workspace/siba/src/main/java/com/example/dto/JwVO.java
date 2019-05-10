package com.example.dto;

public class JwVO {
	
	private double latitude;
	private double longtitude;
	
	
	public JwVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwVO(double latitude, double longtitude) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	
}
