package week02.day01;

import java.util.Scanner;

public class Questions007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen sayiyi giriniz: ");
		int number = scanner.nextInt();
		int factorial =1;
		for (int i=2; i<=number;i++){
			factorial*=i;
		}
		factorial = 1;
		while(number>=2){
			factorial*=number;
			number--;
		}
		System.out.println("Girdiginiz sayinin faktoriyeli = "+ factorial);
	}
}