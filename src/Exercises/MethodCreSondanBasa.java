package Exercises;

import java.util.Scanner;

public class MethodCreSondanBasa {

	public static void main(String[] args) {
		/*
	    Problem tanimi:
	    Kullanicidan aldiginiz bir String'deki kelimeleri sondan basa dogru yerlestiren
	    String parametreli return type li reverseWord isminde bir method yazınız

	     Test DAta :
	    İnput : Allah Javaci arkadaslara  zihin acikligi versin
	    Output : versin acikligi zihin arkadaslara Javaci Allah
	     */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle= scan.nextLine();

System.out.println(terstenKelimeler(cumle));
	}

	private static String terstenKelimeler(String cumle) {
		String[] arr= cumle.trim().split(" ");
		String tersten= "";
		
		for (int i = arr.length-1; i >=0; i--) {
			tersten+= arr[i] + " ";
		}
		return tersten.trim();
	}

}
