package Exercises;

import java.util.Scanner;

public class MethodCreation2 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cevirmek icin birim giriniz");
String birim= scan.next();
System.out.println("cevirmek istediginiz miktari giriniz");
double miktar= scan.nextDouble();
 birimCevirici(birim, miktar);
 
	}

	private static void birimCevirici(String birim, double miktar) {

switch (birim) {
case "kilo":
	System.out.println(miktar +" kilo "+ ( miktar* 1000) + " grama esittir");
	break;
case "saat":
	System.out.println(miktar + " saat "  +( miktar * 60) + " dakikaya esittir");
	break;
case "dakika":
	System.out.println(miktar + " dakika "  +( miktar * 60) + " saniyeye esittir");
	break;
case "kilometre":
	System.out.println(miktar + " km "  + ( miktar * 1000) + " metreye esittir");
	break;

default:
	System.out.println("kilo, saat, dakika ya da kilometre disinda birim girmeyiniz");
	break;
}
		
	}

}
