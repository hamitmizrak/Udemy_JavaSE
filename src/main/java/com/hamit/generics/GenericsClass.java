package com.hamit.generics;

import java.util.List;

public class GenericsClass<T> {

	private T Id;
	private T name;

	public GenericsClass() {
		// TODO Auto-generated constructor stub
	}

	public GenericsClass(T id, T name) {
		super();
		Id = id;
		this.name = name;
	}

	// Getter and setter
	public T getId() {
		return Id;
	}

	public void setId(T id) {
		Id = id;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// Jenerics : Tür problemlerini çözmek için kullanıyoruz.
		// Bünyesinde tüm referans tipleri Byte,Short,Integer,Long Double,Float
		// ,Boolean,Character
		// Verilerimizi dinamiklşetiriyoruz

		// genericsMethod(10, 20, 30, 40);// argüman

	}

	// Generics Metotlar
	public static <T> void genericsMethod(T x, int y, double z, float k, List<?> list) { // parametre

	}

}
