package com.hamit.method;

import java.util.Scanner;

public class MethodsJavaClass {

	public static void main(String[] args) {

		/*
		 * methodDeneme(); String str = methodString();
		 * System.out.println("Adınız ve soyadınız..." + str);
		 */

		// FinalClas.hamitDegiskeni;

		// Math.pow(2, 3);
		try {

			System.out.println(ScannerX());
		} catch (Exception e) {

		}

	}

	public static int ScannerX() {
		Scanner klavye = new Scanner(System.in);
		int x, y;
		System.out.println("Birinci syıyı giriniz");
		x = klavye.nextInt();

		System.out.println("İkinci syıyı giriniz");
		y = klavye.nextInt();

		return toplaMethod(x, y);

	}

	public static int toplaMethod(int x, int y) {

		return (x + y);
	}

	/*
	 * 4 işlem yapabilen bir hesap makinesi Math. pow sqrt abs topla çıkarma çarpma
	 * bölme
	 * 
	 */

//
//	// Kullanıcıdan 2 tane istensin sonrasında bunları toplasın
//
//	// Methods
//	public static void methodDeneme() {
//
//		System.out.println("Method deneme çalıştı");
//	}
//
//	public static String methodString() {
//
//		String str5 = ScannerClassi();
//		return str5;
//	}
//
//	public static String ScannerClassi() {
//		Scanner klavye = new Scanner(System.in);
//		System.out.println("Lütfen adınızı ve soyadınız giriniz");
//		String value = klavye.nextLine();
//		return value;
//	}

}
