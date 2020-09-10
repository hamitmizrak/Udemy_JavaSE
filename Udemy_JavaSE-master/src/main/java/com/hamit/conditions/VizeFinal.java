package com.hamit.conditions;

import java.util.Scanner;

public class VizeFinal {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String nameSurname;
		double vizeDb, finalDb;
		int key;
		System.out.println("Ad Soyad giriniz");
		nameSurname = klavye.nextLine();

		System.out.println("Vize giriniz");
		vizeDb = klavye.nextDouble();

		System.out.println("Final giriniz");
		finalDb = klavye.nextDouble();

		key = (int) ((vizeDb * 40) / 100 + (finalDb * 60) / 100);

		if (key < 50) {
			System.out.println("Notunuz:" + key + "\nkaldınız");
		} else if (50 < key && key < 70) {
			System.out.println("orta");
		} else {
			System.out.println("Başarılı");
		}

//		        pazartesi =1
//				salı=2

	}
}
