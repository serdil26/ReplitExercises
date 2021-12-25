package Exercises;

import java.util.Scanner;

public class MethodCreReverseString {

	public static void main(String[] args) {
		 /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        orn: String = "Java'yi Seviyorum."
        Print: .muroyiveS iy'avaJ
         */
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine();
		 System.out.println(reverseString(cumle));
		
		
	}

	private static String reverseString(String cumle) {
		String str2 = cumle.trim();

        String strTers = "";

        for (int i = str2.length() - 1; i >= 0; i--) {

            strTers += str2.charAt(i);
        }

        return strTers;*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("metin giriniz");
		String metin=scan.nextLine();
		String reverse= cevir(metin);
		System.out.println("cevrilen metin:" + reverse);
		if (metin.equalsIgnoreCase(reverse)) {
			System.out.println("bu bir palindromdur");
		}	else {
			System.out.println("palindrom degildir");
		}	
	}

	private static String cevir(String metin) {
		if (metin.isEmpty()) {
			return metin;
		}
		return cevir(metin.substring(1))+ metin.charAt(0);
	}

}
