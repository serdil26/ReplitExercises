package Exercises;

import java.util.Scanner;

public class ForWhile1 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
char ch1= 'a' ;
  ​String name =“John came late" 
  ​Expected Output:   Number of a = 2 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String user= scan.nextLine();
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		int count= 0;
		
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i)==harf) {
				count++;
			}
		}
		System.out.println("Girdiginiz cumlede " + harf +" karakteri "+ count+ " kere kullanilmistir");

	}

}
