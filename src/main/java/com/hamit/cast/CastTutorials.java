package com.hamit.cast;

public class CastTutorials {
	
	public static void main(String[] args) {
		//alt çizgi
		int telephoneNumber=1112223344;
		System.out.println("Telefon numarası: "+telephoneNumber);
		
		int cellNumber=111_222_33_44;
		System.out.println("Cell numarası   : "+cellNumber);
		
		//cast işlemi
		//Javada değişkenler gelirken String olarak gelir.  
		String variableString="12";
		int variableInteger=12;
		System.err.println("Toplam:"+(variableString+variableInteger));
		
		
		
		float variableFloat=12.52f;
		float variableFloatCast=(float) 12.52;
		
		long variableLong=155151L;
		long variableLongCast=(long)155151;
		
		// b >  s  > i  > l
		
		int x=45;
		long y=x;
		System.out.println(y);
		
		System.out.println("Long max değeri: "+Long.MAX_VALUE);
		long x1=95995;
		int  y1=(int)x1;
		System.out.println("değişken: "+y1);
		
		
		long primitiveLong=51415;
		Long wrapperLong=primitiveLong;
		
		//int  ==> String 
		int variableInt=95;
		String variableString2=String.valueOf(variableInt);   //nesne düzeyde 
		String variableString3=Integer.toString(variableInt); //daha hızlı
		
		
		
		//String ==> int
		String variableString4="20";
		int variableInt4=Integer.valueOf(variableString4);  //düzeyde düzeyde 
		int variableInt5=Integer.parseInt(variableString4); //daha hızlı
		
		
		//  "45"  45 sayılar toplansın sonuç 90 olsun 
		
		
		
	}
}
