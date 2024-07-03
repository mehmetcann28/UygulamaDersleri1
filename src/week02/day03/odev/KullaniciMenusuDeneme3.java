package week02.day03.odev;

import java.util.Scanner;

public class KullaniciMenusuDeneme3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int langSelection;
		int turkishMenuSelection;
		int englishMenuSelection;
		
		System.out.println("Hosgeldiniz! / Welcome!\nLutfen goruntuleme dilini seciniz. / Please select display " +
				                 "language.\n1-- Turkish(TR)\n2-- English (EN): ");
		langSelection= scanner.nextInt();
		
		if (langSelection==1) {
			while (true){
				System.out.println("0-- Cikis Yap\n" + "1--  Merhaba Dunya yazdir.\n" + "2-- Faktoriyel Hesapla.\n" +
						                   "3-- Asal sayi kontrolu yap.");
				turkishMenuSelection= scanner.nextInt();
				if (turkishMenuSelection==0) {
					System.out.println("Program sonlandirilmistir! Gorusmek uzere!");
					break;
				}
				else if (turkishMenuSelection==1) {
					System.out.println("Merhaba Dunya");
				}
				else if (turkishMenuSelection==2) {
					while (true){
						System.out.print("Lutfen sayiyi giriniz (Ust menuye donmek icin 0 girin): ");
						int number = scanner.nextInt();
						int x = number;
						if (number==0){
							break;
						}
						long factorial;
						factorial = 1;
						while(x>=2){
							factorial*=x;
							x--;
						}
						System.out.println("Girdiginiz sayi= " + number + "\nBu sayinin faktoriyeli = " + factorial);
					}
				}
				else if(turkishMenuSelection==3){
					while (true){
						System.out.print("Lutfen sayi giriniz (Ust menuye donmek icin 0 girin): ");
						long number = scanner.nextLong();
						if(number==0){
							break;
						}
						boolean isPrime = true;
						long sqrt = (long) Math.sqrt(number);
						
						if (number <= 1 || number % 2 ==0 && number!= 2) {
							System.out.println("Girdiginiz sayi: " + number + "\nBu sayi bir asal sayi degildir.");
						}
						else if (number == 2) {
							System.out.println("Girdiginiz sayi: " + number + "\nBu sayi bir asal sayidir.");
						}
						else {
							for (long i = 3; i <= sqrt; i = i+2) {
								if (number % i == 0) {
									isPrime = false;
									break;
								}
							}
							if (isPrime) {
								System.out.println("Girdiginiz sayi: " + number + "\nBu sayi bir asal sayidir.");
							}
							else {
								System.out.println("Girdiginiz sayi: " + number + "\nBu sayi bir asal sayi degildir.");
							}
							
						}
					}
				}
				else {
					System.out.println("Yanlis giris yaptiniz. Lutfen tekrar giris yapiniz: ");
				}
			}
		
		}
		else if (langSelection==2) {
			while (true){
				System.out.println("0 -- Log Out.\n" + "1--  Print Hello World.\n" + "2-- Perform Factorial " +
						                   "Calculation.\n" + "3-- Check Prime Numbers.");
				englishMenuSelection = scanner.nextInt();
				if (englishMenuSelection==0) {
					System.out.println("The program has been terminated! See you later!");
					break;
				}
				else if (englishMenuSelection==1) {
					System.out.println("Hello World");
				}
				else if (englishMenuSelection==2) {
					while(true){
						System.out.println("Please enter a number (Enter 0 to return to the top menu): ");
						int number = scanner.nextInt();
						int x=number;
						if(number == 0){
							break;
						}
						long factorial =1;
						while(number>=2){
							factorial*=number;
							number--;
						}
						System.out.println("The number you entered: " + x + "\nFactorial of this number = "+ factorial);
					}
				}
				else if (englishMenuSelection==3) {
					while(true){
						System.out.print("Please enter a number (Enter 0 to return to the top menu): ");
						long number = scanner.nextLong();
						if (number == 0){
							break;
						}
						boolean isPrime = true;
						long sqrt = (long) Math.sqrt(number);
						
						if (number <= 1 || number % 2 ==0 && number!= 2) {
							System.out.println("The number you entered: " + number + "\nIs not a prime number.");
						}
						else if (number == 2) {
							System.out.println("The number you entered: " + number + "\nIs a prime number.");
						}
						else {
							for (long i = 3; i <= sqrt; i = i+2) {
								if (number % i == 0) {
									isPrime = false;
									break;
								}
							}
							if (isPrime) {
								System.out.println("The number you entered: " + number + "\nIs a prime number.");
							}
							else {
								System.out.println("The number you entered: " + number + "\nIs not a prime number.");
							}
							
						}
					}
				}
				else {
					System.out.println("You have logged in incorrectly. Please log in again:");
				}
			}
		}
		else {
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar giris yapiniz:");
		}
	}
}