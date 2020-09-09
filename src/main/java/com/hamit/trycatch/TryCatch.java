package com.hamit.trycatch;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class TryCatch {

	public static void main(String[] args) throws IOException, SQLException {
		/*
		 * // Hatalar - İstisnalar
		 * 
		 * // Sytax error = gramer hatası // Logical error mantıksal hatadır // Runtime
		 * error =
		 * 
		 * try {
		 * 
		 * int x, y, z; x = 5; y = 0; z = x / y; System.out.println(z);
		 * 
		 * } catch (ArithmeticException a) { a.getMessage(); // istisnanın mesajını
		 * a.toString(); // istisna adını a.printStackTrace(); // istisnanın adını
		 * kaöıncı staırda olduğua. a.getStackTrace(); // istisnanın bilgilerini dizi
		 * olarak döndürür System.out.println("Aritmetik hata sıfıra bölme hatası"); }
		 * catch (Exception e) { e.printStackTrace();
		 * System.out.println("sıfıra bölme hatası"); }
		 * 
		 * 
		 * 
		 * java.lang object trowable Errors Exception sytax error logical error runtime
		 * 
		 * 
		 * //aritmeticException ==> 5/0 //nullpointerEx. ==> null bunu kullanmaya
		 * çalışıyorsunuz //ArrayIndexOutOfBoundsEx. ==> dizi 9 10 //ArrayStoreExc
		 * //IllegalArgumentExc ==> argüman geçersiz //classNotFoundExc. ==> sınıf yok
		 */
		// throw -new throw -throws -finally

		Connection conn = null;
		/*
		 * try {
		 * 
		 * int x = 50 / 0;
		 * 
		 * } catch (ArithmeticException a) { // throw (a);// satırını gösteriyor
		 * a.printStackTrace(); System.out.println(); } finally { try { if (conn !=
		 * null) conn.close(); } catch (Exception e) {
		 * 
		 * e.printStackTrace(); } }
		 */

		// try with resources
		/*
		 * try() {
		 * 
		 * 
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */

		// throw new
		/*
		 * int y = 9 / 0; throw new ArithmeticException("Sıfıra bölemezsin");
		 */

		try {
			int y = 5;

		} catch (Exception e) {
			e.printStackTrace();
		}

		throw new ArithmeticException("");

	}

}
