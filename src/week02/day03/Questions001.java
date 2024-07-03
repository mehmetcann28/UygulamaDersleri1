package week02.day03;

import java.util.Scanner;
//1- Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim.

public class Questions001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
		int number = sc.nextInt();
		
		String day = switch (number) {
			case 1 -> "Pazartesi";
			case 2 -> "Sali";
			case 3 -> "Carsamba";
			case 4 -> "Persembe";
			case 5 -> "Cuma";
			case 6 -> "Cumartesi";
			case 7 -> "Pazar";
			default -> "Lutfen gecerli aralikta bir sayi giriniz! (1-7)";
		};
		System.out.println(day);
	}
}