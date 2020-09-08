package com.java.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		//primitive tarzında=
		//B > S > İ > L = Tam sayılar
		byte dataTypeByte=127;
		short dataTypeShort=541;
		int dataTypeInt=1515;
		long dataTypeLong=1515L;
		
		System.out.println();
		System.out.println("byte min: "+Byte.MIN_VALUE);
		System.err.println("byte max: "+Byte.MAX_VALUE+"\n");
		
		System.out.println("long min: "+Long.MIN_VALUE);
		System.err.println("long max: "+Long.MAX_VALUE);
		
		//virgüllü
		float dataTypeFloat=152.51f;
		double dataTypeDouble=151.616;

		
		
		// f-L
		boolean dataTypeBoolean=true;  //default: false;
		char dataTypeChar='a';
		char dataTypeCharUnicode='\u01c4';  //U+01C4
		System.out.println("unicode character:"+dataTypeCharUnicode);
		
		//Wrapper 
		Integer i2=new Integer(59);
		int i5=115;
		
		int x,y,r,dikdortgenCevre,dikdortgenAlan;
		double cemberCevre,daireAlan,pi;
		x=2; 
		y=5;
		r=6;
		pi=3.14;
		
		//çevre hesabı dikdörtgen 
		System.out.println(dikdortgenCevre=2*(x+y));
		
		//Alan hesabı dikdörtgen
		System.out.println(dikdortgenCevre=(x*y));
		
		//Çember cevresi =2PiR
		System.out.println(2*pi*6);
		
		//daire alanı= PiR2
		System.out.println(pi*r*r);
		
		System.err.println(Math.PI*r*r);
		
		
		
	}
}
