package com.hamit.foreach;

public class forEachWhileDo {

	public static void main(String[] args) {

		// bitiş belitmek zorundayız
		for (int i = 0; i < args.length; i++) {

		}

		// bitiş belitmek zorunda değiliz
		int i = 0;
		while (i <= 10) {
			i++;
			System.out.print(i + " -");
		}

		//
		int k = 0;
		do {
			k++;
			System.out.println("Bir kez kesin çalışacak\n" + k + ".nci kez çalıştı");
		} while (k < 5);

		String[] dizi = { "Kelime", "Malatya", "Battalgazi" };

		// ForEach yapısı
		for (String arr : dizi) {
			System.out.println(arr);
		}

		// Boyut Matrix

		for (int t = 1; t <= 3; t++) { // 1 - 2 -3 -4
			for (int j = 1; j <= 3; j++) { // 1 2

				if (t == j)
					System.out.print("c");
				if (t < j)
					System.out.print("*");
				if (t > j)
					System.out.print("+");
			}
			System.out.println();
		}

	}
}
