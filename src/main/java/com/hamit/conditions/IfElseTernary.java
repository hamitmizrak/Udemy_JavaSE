package com.hamit.conditions;

public class IfElseTernary {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * if(true){ //kodlar }else if(true){ }else{ }
		 * 
		 * 
		 * if(true) //kodlar
		 * 
		 * 
		 * if(true){ }else{
		 * 
		 * }
		 * 
		 * String str=3>2 ? true :false;
		 * 
		 * < <= > >=
		 * 
		 * || veya bit=tek karakter | && ve kelime bit =&
		 * 
		 * break; // döngüyü kırıyor for while return; //metot kırıyor. continue; //
		 * sadece o sart sağlanıyorsa o şartı atlar sonra devam
		 * 
		 */
		boolean bol = 3 > 1;
		if (bol) {
			System.out.println("evet doğru");
		} else {
			System.out.println("Hayır yanlış");
		}

		String str = bol ? "evet doğru" : "hayır yanlış";
		System.out.println("sonuc=" + str);

		int yas = 9;
		if (yas == 1) {
			System.out.println("yaş 1");
		} else if (yas == 2) {
			System.out.println("yaş 2");
		} else if (yas == 3) {
			System.out.println("yaş 3");
		} else if (yas == 4) {
			System.out.println("yaş 4");
		} else if (yas == 8) {
			System.out.println("yaş 8");
		} else {
			System.out.println("yaş farklı");
		}

		int key = 9;
		switch (key) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 8:
			System.out.println("8");
			break;
		default:
			System.out.println("farklı");
			break;
		}

		// Kullanıcıda ad soyad vize final 50 ise geçtiniz 50<x<70 orta 70<=x<100
		// Başarılı

	}
}
