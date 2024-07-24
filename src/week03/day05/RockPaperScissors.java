package week03.day05;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean gameState = true;
		
		while (gameState){
			
			System.out.println("Taş kağıt makas oyununa hoşgeldiniz..");
			System.out.println("Seçiminizi yapınız.(Taş, kağıt, makas) Çıkmak için 'Çıkış' yazınız: ");
			String userChoice= scanner.nextLine();
			
			if (userChoice.equalsIgnoreCase("Çıkış")){
				System.out.println("Oyundan çıkış yapılıyor");
				scanner.close();
				break;
			}
			String computerChoice= computerChoiceMethod();
			
		}
	}
	
	private static String computerChoiceMethod() {
		String[] option = {"Taş","Kağıt","Makas"};
		Random random = new Random();
		int index = random.nextInt(3);
		return option[index];
	}
}