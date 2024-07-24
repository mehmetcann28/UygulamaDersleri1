package week03.day04;

//3- Kullanici disaridan bir sayi girecek.
//
//    Ornek girdi = 10;
//    Sirasiyla;
//    1- 10 + 50
//    2- (10+50) * 30
//    3- ((10+50)*30) -40
//    4- (((10+50)*30) -40) / 20
//    islemlerini yaptiracagiz.
//
//    Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.

import java.util.Scanner;

public class Questions003 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int input = scanner1.nextInt();
		double result = finalStep(input);
		
	}
	public static double finalStep(int number){
		return step4(step3(step2(step1(number),number),number),number);
	}
	//    1- 10 + 50
	public static int step1(int number){
		int result = number+50;
		System.out.println("Step 1 ("+number+" + 50) = "+result);
		return result;
	}
	//    2- (10+50) * 30
	public static int step2(int number,int original) {
		int result = number * 30;
		System.out.println("Step 2 ((" + original + " + 50) * 30): " + result);
		return result;
	}
	//    3- ((10+50)*30) -40
	public static int step3(int number,int original){
		int result = number-40;
		System.out.println("Step 3 ((" + original + " + 50) * 30) - 40: " + result);
		return result;
	}
	//    4- (((10+50)*30) -40) / 20
	public static int step4(int number,int original){
		double result =(double) number /20;
		System.out.println("Step 3 (((" + original + " + 50) * 30) - 40) / 2: " + result);
		return (int) result;
	}
	
	
}