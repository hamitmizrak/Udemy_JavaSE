package com.hamit.randomc;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {

		// System.out.println(Math.random());

		// System.out.println(rndInt);
		// System.out.println(Double.MAX_VALUE);

		// Scanner klavye = new Scanner(System.in);
		// int x = klavye.nextInt(); // have has sahiplik

		int rndInt = (int) (Math.random() * 8 + 3); // 3<=rnd<=10 3-4-5-6-7-8-9

		Random rnd = new Random();
		int y = rnd.nextInt(8) + 3;
		System.out.println(y);
	}
}
