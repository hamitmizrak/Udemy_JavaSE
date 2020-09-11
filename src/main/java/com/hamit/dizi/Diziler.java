package com.hamit.dizi;

import java.util.Arrays;

public class Diziler {
	public static void main(String[] args) {
		double[] dizi = new double[10];
		dizi[0] = 4.4;
		dizi[1] = 5.6;
		dizi[8] = 2.4;

//		System.out.println(dizi[15]);

		// iterative for dizi örneği
		for (int i = 0; i < dizi.length; i++) {
			// System.out.println(dizi[i]);
		}

		System.out.println();
		// forEach indis lazım değilse yani sadece ekranda göstermek istiyorsam
		for (double d2 : dizi) {
			// System.out.println(d2);
		}

		//

		int[] array = { 5, 6, 3, 9, 6, 4, 2, 5 };
		for (int d2 : array) {
			// System.out.println(d2);
		}

		char[] array2 = { 'a', '7' };
		for (char d3 : array2) {
			// System.out.println(d3);
		}

		// diziler = 0 indiskten başlar
		String[][] matrix = new String[2][2];
		matrix[0][0] = "0-0";
		matrix[0][1] = "0-2";
		matrix[1][1] = "1-1";
		matrix[1][0] = "1-0";
		for (int i = 0; i < matrix.length; i++) {// dıştaki for yani satır bulur
			for (int j = 0; j < matrix.length; j++) { // içteki
				// System.out.println(matrix[i][j]);
			}
			// System.out.println();
		}

		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 }, { 3, 4, 5, 6 }, { 3, 4, 5, 6 } };
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				// System.out.print(matrix2[i][j]);
			}
			// System.out.println();
		}

		// Object
		Object[] tekBoyutlu = new Object[2];
		tekBoyutlu[0] = 5;
		tekBoyutlu[1] = "Hamit Mızrak";
		for (Object s2 : tekBoyutlu) {
			// System.out.println(s2);
		}

		// API- DB
		// StringBuilder
		// StringTokenizer
		// Object

		int[] dizi8 = { 5, 6, 8, 1, 2 };
		Arrays.sort(dizi8);
		for (int s3 : dizi8) {
			System.out.print("-" + s3);
		}
		System.out.println();
		int arama = Arrays.binarySearch(dizi8, 2555);
		if (arama < 0) {
			System.out.println("aranılan değer YOKTUR");

		} else {
			System.out.println("aranılan değer bulunuyor" + "2");
		}

	}
}
