package week02.day02;

import java.util.Scanner;

public class PrimeNumber02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen sayi giriniz: ");
		long number = sc.nextLong();
		boolean isPrime = true;
		long startTime;
		long endTime;
		long timeElapsed;
		
		if (number <= 1){
			System.out.println(number + " Is not a prime number.");
		}
		else if (number==2) {
			System.out.println(number + " Is a prime number");
		}
		else {
			startTime= System.nanoTime();
			for (int i = 3; i<number;i=i+2){
				if (number%i==0){
					isPrime = false;
					break;
				}
			}
			endTime = System.nanoTime();
			timeElapsed = (endTime-startTime);
			System.out.println(number + " Is a prime number. \nTime Elapsed: "+ timeElapsed);
		}
	}
}