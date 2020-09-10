package com.hamit.string;

public class StringTutorials {

	public static void main(String[] args) {
		/*
		 * System.out.println("String dizisi");
		 * 
		 * String vocabulary = "Merhabalar Java Dünyası ben geldim";
		 * 
		 * System.out.println("Boyutu: " + vocabulary.length());
		 * 
		 * System.out.println("Replace: " + vocabulary.replace("Merhabalar", " "));
		 * 
		 * System.out.println("Concat: " +
		 * vocabulary.concat(" kuyruğa eklendim").concat(" 44 ").concat(" 23"));
		 * 
		 * System.out.println("Hepsi Küçük Harf: " + vocabulary.toLowerCase());
		 * 
		 * System.out.println("Hepsi Büyük Harf: " + vocabulary.toUpperCase());
		 * 
		 * System.out.println("charAt : " + vocabulary.charAt(9));
		 * 
		 * System.out.println("indexof : " + vocabulary.indexOf("Java"));
		 * 
		 * System.out.println("lastindexOf : " + vocabulary.lastIndexOf("dim"));
		 * 
		 * System.out.println("indexof : " + vocabulary.split(" ")); // parçalamak
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("trim : " + vocabulary.trim()); // boşluklardan arındırmak
		 * 
		 * System.out.println("startWith : " + vocabulary.startsWith("f"));
		 * 
		 * boolean bol = vocabulary.startsWith("M"); if (bol) {
		 * System.out.println("Evet if"); }
		 * 
		 * System.out.println("endsWith : " + vocabulary.endsWith("m"));
		 */
		/*
		 * String[] arrayList = vocabulary.split(" "); String arr = arrayList[0];
		 * System.out.println(arr);
		 * 
		 * for (Stringdizi : arrayList) { System.out.print(" " + dizi); }
		 */

		// isEmpty ile null aynı şey değildir.
		// o ile null aynı şey değildir.
		String str = "Merhaba";

		if (str != null) { // nullPointerException
			System.out.println("Evet Boş değilim ");
		}

		if (!str.isEmpty()) { // nullPointerException
			System.out.println("isEmpty Evet Boş değilim ");
		}

		if (str == ("Merhaba")) {

			System.out.println("equals yapısı ");
		}

		if (str.equals("Merhaba")) {

			System.out.println("equals yapısı ");
		}
		// sdfsdf ldk db

		// Şifreleme: Kullanıcıdan giriline 15 karakterli bir harf dizi alsın
		// içerisinde a hepsini K
		// sonuna Malatya eklensin
		// Sonrasında hepsi büyük harf olsun
		// 5 harf bize versin
		// en son durumda bunun tersini yazsın

		String str5 = "Malatya Battalgazi";
		System.out.println(str5.substring(5, 9)); // 5<=x<9
	}

}
