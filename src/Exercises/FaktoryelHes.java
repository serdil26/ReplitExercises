package Exercises;

import java.util.Scanner;

public class FaktoryelHes {

	public static void main(String[] args) {
		/*4- Girdi olarak bir tamsayý kabul eden ve faktöriyel hesaplayan programi yazýniz.
		Input : 6
		Output: 6!=65432*1=720 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen faktoryel hesaplamasi icin bir tam sayi giriniz");
int sayi= scan.nextInt();
int fac= 1;

if (sayi>0) {
	for (int i = 1; i <= sayi; i++) {
		fac*=i;
	} System.out.println(sayi+ "!=" + fac);
} else {
	System.out.println("lutfen tam sayi giriniz");
}
	}

}
