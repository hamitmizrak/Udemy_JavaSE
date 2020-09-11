package com.hamit.genel1;

public class Genel1 {

	public static void main(String[] args) {
		/*
		 * // char char c = '\u01C4'; System.out.println(c); // scope
		 * 
		 * Scanner klavye = new Scanner(System.in);
		 * System.out.println("Bİr sayı giriniz"); if (klavye.hasNextInt()) { int x =
		 * klavye.nextInt(); }
		 * 
		 * // System System.err.println("Kırmızı"); System.exit(0); System.gc();
		 * System.out.println();
		 */

		// sayi ie başlanmaz
		int şçöğşü = 42;
		System.out.println(şçöğşü);

		// under_score
		long cellPhone = 444_222_11_00L;
		System.out.println(cellPhone);

		// Cast
		String sayi = "44";
		int changeValue = Integer.valueOf(sayi);
		int changeParse = Integer.parseInt(sayi);

		int i2 = 23;
		String str2 = String.valueOf(i2);
		String str3 = Integer.toString(i2);

		int sayiInt = 44;
		int sonuc = sayiInt + changeParse;
		System.out.println(sonuc);

		// boxing unboxing
		// int x = 44;
		// Integer integerBoxing = x;

		// unboxing
		// Double strUnboxing = new Double(41.45);
		// double doublex = strUnboxing;

//	for ( true ) 
//		
//	
//	int i = 0;
//	while(i < 10) {
//		System.out.println();
//	}
//
//	}

		// public static final double HAMIT = 44.2323244;
	}
}