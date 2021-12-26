package Exercises;

import java.util.Scanner;

public class StringMan1 {

	public static void main(String[] args) {
		// //8- Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan oluþan yeni bir String yazdýrýn
        //Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
        //INPUT : Mustafa
    //  OUTPUT : fafafa
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz");
		String isim= scan.next().toLowerCase();
		String str[]=isim.split("");
		
		if (isim.length()>=2) {
			for (int i = 0; i<3; i++) {
				for (int j = str.length-2; j <= isim.length()-1; j++) {
					System.out.print(str[j]);
				}
			}
		}

	}

}
