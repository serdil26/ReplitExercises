package Exercises;

import java.util.Scanner;

public class SwitchTernaryString_2 {

	public static void main(String[] args) {
		/* Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J* W**

CCN : ** ** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir. */
		Scanner scan=new Scanner(System.in);
		System.out.println("Adinizi Soyadinizi giriniz");
String adSoyad= scan.nextLine().toUpperCase();
System.out.println("Kredi karti numaranizi giriniz");
String kartNo= scan.nextLine();

System.out.println(adSoyad.replaceAll(adSoyad, kartNo));
System.out.println("CCN : ** ** **** " + kartNo.substring(11, 16));
	}

}
