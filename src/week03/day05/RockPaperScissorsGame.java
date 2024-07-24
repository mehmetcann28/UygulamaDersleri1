package week03.day05;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Kaç tur oynamak istersiniz? ");
			int rounds = scanner.nextInt();
			scanner.nextLine(); // Enter tuşu için eklenmiştir
			
			int userScore = 0;
			int computerScore = 0;
			
			for (int i = 1; i <= rounds; i++) {
				System.out.println("Tur " + i + ": Seçiminizi yapın (Taş, Kağıt, Makas). Çıkmak için 'Çıkış' yazın:");
				String userChoice = scanner.nextLine();
				
				if (userChoice.equalsIgnoreCase("Çıkış")) {
					System.out.println("Oyundan çıktınız.");
					scanner.close();
					return;
				}
				
				String computerChoice = getComputerChoice();
				System.out.println("Bilgisayarın seçimi: " + computerChoice);
				
				String result = determineWinner(userChoice, computerChoice);
				System.out.println(result);
				
				if (result.equals("Kazandınız!")) {
					userScore++;
				} else if (result.equals("Kaybettiniz!")) {
					computerScore++;
				}
				
				System.out.println("Skor - Kullanıcı: " + userScore + ", Bilgisayar: " + computerScore);
			}
			
			if (userScore > computerScore) {
				System.out.println("Genel kazanan: Kullanıcı!");
			} else if (computerScore > userScore) {
				System.out.println("Genel kazanan: Bilgisayar!");
			} else {
				System.out.println("Oyun berabere!");
			}
			
			System.out.println("Oyunu bitirmek için 'Çıkış' yazın. Devam etmek için herhangi bir tuşa basın.");
			String continueGame = scanner.nextLine();
			if (continueGame.equalsIgnoreCase("Çıkış")) {
				System.out.println("Oyundan çıktınız.");
				break;
			}
		}
		
		scanner.close();
	}
	
	public static String getComputerChoice() {
		String[] options = {"Taş", "Kağıt", "Makas"};
		Random random = new Random();
		int index = random.nextInt(3);
		return options[index];
	}
	
	public static String determineWinner(String userChoice, String computerChoice) {
		switch (userChoice.toLowerCase()) {
			case "taş":
				return evaluateRock(computerChoice);
			case "kağıt":
				return evaluatePaper(computerChoice);
			case "makas":
				return evaluateScissors(computerChoice);
			default:
				return "Geçersiz seçim!";
		}
	}
	
	public static String evaluateRock(String computerChoice) {
		switch (computerChoice.toLowerCase()) {
			case "taş":
				return "Berabere!";
			case "kağıt":
				return "Kaybettiniz!";
			case "makas":
				return "Kazandınız!";
			default:
				return "Geçersiz seçim!";
		}
	}
	
	public static String evaluatePaper(String computerChoice) {
		switch (computerChoice.toLowerCase()) {
			case "taş":
				return "Kazandınız!";
			case "kağıt":
				return "Berabere!";
			case "makas":
				return "Kaybettiniz!";
			default:
				return "Geçersiz seçim!";
		}
	}
	
	public static String evaluateScissors(String computerChoice) {
		switch (computerChoice.toLowerCase()) {
			case "taş":
				return "Kaybettiniz!";
			case "kağıt":
				return "Kazandınız!";
			case "makas":
				return "Berabere!";
			default:
				return "Geçersiz seçim!";
		}
	
	}
}