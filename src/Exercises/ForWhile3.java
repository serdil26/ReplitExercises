package Exercises;

public class ForWhile3 {

	public static void main(String[] args) {
		/* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.(mülakat Sorusu)
Input :
String str=“Javaisalsoeasy”
Output: a s */
		
		String cumle= "IlovelearningJava";
		int sayi=0;
		int kacTane=0;
		int index=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			sayi=0;
			for (int j = 0; j < cumle.length(); j++) {
				if (cumle.charAt(i)==cumle.charAt(j)) {
					sayi++;
				}
				if (sayi>kacTane) {
					kacTane=sayi;
					index=i;
				}
			}
			
		}
		System.out.println("Cumlede  " +  cumle.charAt(index) + " harfi " + kacTane + " kere kullanilmistir");
		
		

	}

}
