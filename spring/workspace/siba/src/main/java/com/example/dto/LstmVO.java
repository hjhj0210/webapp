package com.example.dto;

public class LstmVO {
	
	private double date;
	private double tonghwa;
	private double hasa;
	private double gangongup;
	private double sobiza;
	
	public LstmVO(double date, double tonghwa, double hasa, double gangongup, double sobiza) {
		super();
		this.date = date;
		this.tonghwa = tonghwa;
		this.hasa = hasa;
		this.gangongup = gangongup;
		this.sobiza = sobiza;
	}

	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public double getTonghwa() {
		return tonghwa;
	}

	public void setTonghwa(double tonghwa) {
		this.tonghwa = tonghwa;
	}

	public double getHasa() {
		return hasa;
	}

	public void setHasa(double hasa) {
		this.hasa = hasa;
	}

	public double getGangongup() {
		return gangongup;
	}

	public void setGangongup(double gangongup) {
		this.gangongup = gangongup;
	}

	public double getSobiza() {
		return sobiza;
	}

	public void setSobiza(double sobiza) {
		this.sobiza = sobiza;
	}
	
	
}
