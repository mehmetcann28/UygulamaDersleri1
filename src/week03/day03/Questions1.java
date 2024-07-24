package week03.day03;
//1- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
import java.util.Scanner;

public class Questions1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nHesap makinesi uygulamasına hoşgeldiniz. Önce sizden hangi işlemi yapacağınızı " + "karşısında belirtilen sayısal ifade ile seçmeniz istenmektedir. Lütfen seçiminizi yapınız.\n0--> Hesap makinesi " + "uygulamasını kapatır\n1--> Toplama işlemi sayfasına yönlendirilirsiniz\n2--> " + "Çıkarma işlemi sayfasına yönlendirilirsiniz\n3--> Çarpma işlemi sayfasına " + "yönlendirilirsiniz\n4--> Bölme işlemi sayfasına yönlendirilirsiniz");
			
			System.out.print("\nLütfen hesap makinesinde yapmak istediğiniz işlemi seçiniz: ");
			int calculatorChoice = scanner.nextInt();
			System.out.println("Seçiminiz: " + calculatorChoice + "\n");
			switch (calculatorChoice) {
				
				case 0:
					System.out.println("Hesap makinesi programı kapatılıyor...");
					break;
				case 1:
					System.out.print("Lütfen hesap yapmak istediğiniz 1.sayıyı giriniz: ");
					int number1 = scanner.nextInt();
					System.out.print("Lütfen hesap yapmak istediğiniz 2. sayıyı giriniz: ");
					int number2 = scanner.nextInt();
					System.out.println();
					int result = addition(number1, number2);
					System.out.println("Girdiğiniz birinci sayı: " + number1 + " Girdiğiniz ikinci sayı: " + number2 + "\n" + number1 + " + " + number2 + " = " + result);
					break;
				case 2:
					System.out.print("Lütfen hesap yapmak istediğiniz 1.sayıyı giriniz: ");
					int number3 = scanner.nextInt();
					System.out.print("Lütfen hesap yapmak istediğiniz 2. sayıyı giriniz: ");
					int number4 = scanner.nextInt();
					System.out.println();
					int result1 = subtraction(number3, number4);
					System.out.println("Girdiğiniz birinci sayı: " + number3 + " Girdiğiniz ikinci sayı: " + number4 + "\n" + number3 + " - " + number4 + " = " + result1);
				case 3:
					System.out.print("Lütfen hesap yapmak istediğiniz 1.sayıyı giriniz: ");
					int number5 = scanner.nextInt();
					System.out.print("Lütfen hesap yapmak istediğiniz 2. sayıyı giriniz: ");
					int number6 = scanner.nextInt();
					System.out.println();
					int result2 = multiplication(number5, number6);
					System.out.println("Girdiğiniz birinci sayı: " + number5 + " Girdiğiniz ikinci sayı: " + number6 + "\n" + number5 + " * " + number6 + " = " + result2);
				case 4:
					System.out.print("Lütfen hesap yapmak istediğiniz 1.sayıyı giriniz: ");
					double number7 = scanner.nextDouble();
					System.out.print("Lütfen hesap yapmak istediğiniz 2. sayıyı giriniz: ");
					double number8 = scanner.nextDouble();
					System.out.println();
					double result3 = division(number7, number8);
					System.out.println("Girdiğiniz birinci sayı: " + number7 + " Girdiğiniz ikinci sayı: " + number8 + "\n" + number7 + " / " + number8 + " = " + result3);
				default:
					System.out.println("Yanlış giriş yaptınız");
				
			}
			
			
		}
	}
	
	public static int addition(int sayi1, int sayı2) {
		int result = sayi1 + sayı2;
		return result;
	}
	
	public static int subtraction(int sayi1, int sayi2) {
		int result = sayi1 - sayi2;
		return result;
	}
	
	public static int multiplication(int sayi1, int sayi2) {
		int result = sayi1 * sayi2;
		return result;
	}
	
	public static double division(double sayi1, double sayi2) {
		double result = 1;
		if (sayi2 == 0) {
			if (sayi1 == 0) {
				System.out.println("Belirsiz");
			}
			else {
				System.out.println("0'a bölünme hatası");
			}
		}
		else {
			result = sayi1 / sayi2;
		}
		return result;
	}
}