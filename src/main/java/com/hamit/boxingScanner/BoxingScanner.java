package com.hamit.boxingScanner;

import java.util.Scanner;

public class BoxingScanner {

	public static void main(String[] args) {
		
		
		//primitive olarak int yazdınız ancak bunu nesne olarak kullanmak istiyorsunuz.
		
		//Nesnede null kullanabilirsiniz. null  ile  0(sıfır)
		
		/*
		//boxing: kutulama primitive size wrapper classa çevirir
        int primitiveInt=15;
		Integer wrapperInteger=primitiveInt;
		System.out.println("wrapper: "+wrapperInteger);
		wrapperInteger=null;
		
		
		//unboxing
		Integer wrapperInteger2=new Integer(20);
		int  primitiveInt2=wrapperInteger;
		*/
		
		
		//Scanner
		Scanner klavye;
		klavye=new Scanner(System.in);
		//in=içeri  out=dış dünyaya verecek
		
		/*
		//Global bir değişkeni kullancaksak mutlaka ama mutlaka başlnagıç sayısını yazmak zorundayız
		int  number=0;
		
		System.out.println("Lütfen bir sayı giriniz.");
		if(klavye.hasNextInt()) {
			number=klavye.nextInt();//local değişken
		}
		
		System.out.println("Lütfen adınız giriniz.");
		String name=klavye.next();
		
		System.out.println("sayınız:"+number);
		System.out.println("adınız:"+name);
		*/
		
		//ödev: kullanıcıdan 2 tane sayı girilsin  bunları 4 işlem yapsın
		int number1,number2;
		System.out.println("Lütfen birinci sayıyı giriniz");
		number1=klavye.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz");
		number2=klavye.nextInt();
		
		System.out.println("Toplam:"+(number1%number2));

	}

}
