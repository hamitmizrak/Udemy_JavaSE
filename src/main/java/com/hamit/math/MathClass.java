package com.hamit.math;

public class MathClass {

	public static void main(String[] args) {
		// Math ==>static yani new oluşturmadan Class.Metot Şeklinde çalışır.

		System.out.println("e:" + Math.E);

		// 2 Pi R
		System.out.println("pi:" + Math.PI);

		// düşü bir sayınız var ne olursa olsun 0 büyük olmak zorunda
		System.out.println("Mutlak: " + Math.abs(-14));

		System.out.println("Büyük sayı: " + Math.max(15, 45));

		System.out.println("Küçük sayı: " + Math.min(15, 45));

		System.out.println("karekök:" + Math.sqrt(16));

		System.out.println(Math.random());
		int randoInt = (int) (Math.random() * 5 + 1); // 1 <=x<=5 0,1,2,3,4
		System.out.println("değerimiz:" + randoInt);

		System.out.println("üst: " + Math.pow(2, 5));

		System.out.println("ceil üste yuvarla:" + Math.ceil(15.1)); // sonuç:16
		System.out.println("floor alta yuvarla:" + Math.floor(15.8)); // sonuc:15
		System.out.println("round: " + Math.round(15.8)); // round= Hem ceil hemde floor yaptığı

		// 2 tane random sayı olsun bu sayılardan 2 ile 15 arasında olsun bunlardan
		// küçük olanı ekranda göstersin bu sayının karekök alsın,
		// ancak bu sayı mutlaka sıfırdan büyük olsun ve üste yuvarlasın.
		int x, y;
		x = (int) (Math.random() * 15 + 2);
		y = (int) (Math.random() * 15 + 2);
		System.out.println("1.sayı :" + x);
		System.out.println("2.sayı :" + y);

		System.out.println("En küçüğü: " + Math.min(x, y));
		System.out.println("Artı olan Küçük sayının Karekökü: " + Math.abs(Math.floor(Math.sqrt(Math.min(x, y)))));

	}
}
