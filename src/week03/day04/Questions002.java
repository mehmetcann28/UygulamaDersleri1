package week03.day04;

//2-  Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).
//
//    2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.
//
//    3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.
//
//    Yani;
//    Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.

import java.util.Scanner;

public class Questions002 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Kaç sayı girmek istiyorsunuz? (2 veya 3): ");
		int number = scanner.nextInt();
		
		/**if (number == 2) {
			System.out.print("Birinci sayıyı giriniz: ");
			int number1 = scanner.nextInt();
			System.out.print("İkinci sayıyı giriniz: ");
			int number2 = scanner.nextInt();
			int sum = sum(number1,number2);
			System.out.print("Sayıların toplamı: "+ sum);
		}
		else if (number == 3){
			System.out.print("Birinci sayıyı giriniz: ");
			int number1 = scanner.nextInt();
			System.out.print("İkinci sayıyı giriniz: ");
			int number2 = scanner.nextInt();
			System.out.print("Üçüncü sayıyı giriniz: ");
			int number3 = scanner.nextInt();
			int sum = sum(number1,number2,number3);
			System.out.print("Sayıların toplamı: "+ sum);
		}
		else {
			System.out.println("Lütfen 2 veya 3 sayi girmeyi tercih edin.");
		}
		scanner.close();*/
		
		switch (number){
			case 2:{
				System.out.print("Birinci sayıyı giriniz: ");
				int number1 = scanner.nextInt();
				System.out.print("İkinci sayıyı giriniz: ");
				int number2 = scanner.nextInt();
				int sum = sum(number1,number2);
				System.out.print("Sayıların toplamı: "+ sum);
				break;
			}
			case 3:{
				System.out.print("Birinci sayıyı giriniz: ");
				int number1 = scanner.nextInt();
				System.out.print("İkinci sayıyı giriniz: ");
				int number2 = scanner.nextInt();
				System.out.print("Üçüncü sayıyı giriniz: ");
				int number3 = scanner.nextInt();
				int sum = sum(number1,number2,number3);
				System.out.print("Sayıların toplamı: "+ sum);
				break;
			}
			default:
				System.out.println("Lütfen 2 veya 3 sayi girmeyi tercih edin.");
				break;
		}
		
	}
	
	public static int sum(int number1,int number2){
		return number1+number2;
	}
	public static int sum(int number1,int number2,int number3){
		return number1+number2+number3;
	}
}