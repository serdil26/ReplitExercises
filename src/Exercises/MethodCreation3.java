package Exercises;

import java.util.Scanner;

public class MethodCreation3 {

	public static void main(String[] args) {
		 /*
        Problem tanimi :
        Bir String icinde kac kelime oldugunu yazdiran bir method yaziniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
		
		String cumle= "bugun hava cok kapali";
		int sonuc= 0;
		
		
		 kacKelime(cumle);
	}

	private static void kacKelime(String cumle) {
		int sayac=0;
		char bosluk = ' ';
		
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==bosluk) {
				sayac++;
				
			}
		}
	
System.out.println( "cumle icersinde "+ (1+sayac) + " kelime vardir");


		
	}
}

