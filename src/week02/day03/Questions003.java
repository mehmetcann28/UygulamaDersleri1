package week02.day03;

import java.util.Scanner;

public class Questions003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
		int number = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " mukemmel bir sayidir.\n" + total);
		}
		else {
			System.out.println(number + "mukemmel bir sayi degildir.");
		}
	}
}