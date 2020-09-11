package com.hamit.genel1;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Genel2 {
	public static void main(String[] args) {
		System.out.printf("%s  %d  %f ", "Hamit", 10, 14.44);

		// String
		String str = "Merhabalar Nasılsınız";
		System.out.println();
		System.out.println(" boy: " + str.length());
		System.out.println("charAt " + str.charAt(0));
		System.out.println("index " + str.indexOf("Na"));
		System.out.println("trim " + str.trim());
		System.out.println("uppercase " + str.toUpperCase());
		System.out.println("lower case " + str.toLowerCase());
		System.out.println(str.substring(5));
		System.out.println("subString " + str.substring(0, 8)); // 0<=x<8
		System.out.println(str.replace("Merhabalar", "Hello"));
		System.out.println(str.concat(" ekleme"));
		System.out.println(str.contains("Mer"));
		System.out.println(str.compareTo("Merhabalar"));
		System.out.println(str.equals("Merhabalar Nasılsınız"));
		System.out.println(str.isEmpty());
		System.out.println();

		String[] dizi = str.split(" ");
		for (String str5 : dizi) {
			System.out.println(str5);
		}

		// Random
		int x = (int) (Math.random() * 4 + 1);// 1<=x<5
		System.out.println(x);

		Random rnd = new Random();
		int y = rnd.nextInt(4) + 1;
		System.out.println("nesne random:" + y);

		// StringBuilder
		String db = "Databasesden gelen veriler";
		StringBuilder builder = new StringBuilder(db);
		builder.append(" ").append(" 44").append(" 23").append(" son eklemek");
		String toString44 = builder.toString();
		System.out.println(toString44);
		System.out.println();

		// StringTokenizer
		String strTok = "malatya *Yeşilyurt Battalgazi *Java JavaSE,JavaEE+JavaME~Mssql&NoSql.";
		StringTokenizer stringTokenizer = new StringTokenizer(strTok, "*,~ ");
		while (stringTokenizer.hasMoreTokens()) {
			String str4 = stringTokenizer.nextToken();
			System.out.println(str4);
		}

		// Scanner
		Scanner klavye = new Scanner(System.in);
		// double m = klavye.nextDouble();

	}
}
