package com.hamit.string;

import java.io.Serializable;

public class Deneme implements Serializable {
	private static final long serialVersionUID = -8443067055908374930L;

	private int ID;
	private String number;

	public Deneme() {
		this.number = "";
	}

	static {

	}

	public Deneme(int iD, String number) {
		super();
		ID = iD;
		this.number = number;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Deneme [ID=" + ID + ", number=" + number + "]";
	}

}
