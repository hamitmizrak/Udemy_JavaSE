package com.hamit.stringbuiltok;

import java.util.StringTokenizer;

public class StringBuilderTokenizer {

	public static void main(String[] args) {
		String strTok = "malatya *Yeşilyurt Battalgazi *Java JavaSE,JavaEE+JavaME~Mssql&NoSql.";
		String str6 = stringTokenizerMethod(strTok, "*,~+");
		System.out.println(str6);
		System.out.println();
		stringBuilder(strTok, "Eklendi");

		System.out.println();
		int x = overloadingXYZ(2, 4);
		System.out.println(x);
		int y = overloadingXYZ(2, 4, 6);
		System.out.println(y);

	}

	// StringTokenizer =parçalama
	public static String stringTokenizerMethod(String str, String delimiter) {
		String str5 = null;
		StringTokenizer stringTokenizer = new StringTokenizer(str, delimiter);
		while (stringTokenizer.hasMoreTokens()) {
			str5 = stringTokenizer.nextToken();
			System.out.println(str5);

		}
		return str5;
	}

	// overloading
	// overriding

	// StringBuilder
	public static void stringBuilder(String value, String param) {
		StringBuilder stringBuilder = new StringBuilder(value);
		stringBuilder.append(" ").append(param);
		String allString = stringBuilder.toString();
		System.out.println(allString);
	}

	// Overloading
	public static int overloadingXYZ(int x, int y) {

		return x + y;
	}

	public static int overloadingXYZ(int x, int y, int z) {

		return x + y + z;
	}

	@Override
	public static void overriding() {
		System.out.println("ben bir overriding");
	}
}
