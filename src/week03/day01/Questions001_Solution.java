package week03.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questions001_Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// try with resources araştır.
		
		int selection;
		boolean menuControl = true;
		
		while (menuControl){
			System.out.println("\n----String Operation----");
			System.out.println("1- Count the letters");
			System.out.println("2- Letter replacement");
			System.out.println("3- Palindrom Control");
			System.out.println("4- Pagination");
			System.out.println("0- Exit");
			System.out.print("Please choose an option: ");
			
			try {
				selection= scanner.nextInt();
			}catch (InputMismatchException e){
				System.out.println("\nPlease enter a integer value do not use letters or big numbers.");
				continue;
			}
			finally{
				scanner.nextLine();
			}
			
			switch (selection){
				case 1:
					System.out.println("\n## Count the Letters");
					System.out.print("Please enter a word: ");
					String word = scanner.nextLine();
					System.out.print("Please enter a letter: ");
					char letter = scanner.nextLine().charAt(0);
					int count = 0;
					if (!word.contains(String.valueOf(letter))){
						System.out.println("\nThere are no " + letter + " letter in the word you input");
					}
					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == letter) {
							count++;
							//index += i + " ";
							System.out.println("There is a " + letter + " letter at the " + i + ". index");
						}
					}
					System.out.println("There are amount of  " + count + " letter " + letter + " in the word that you've entered");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("See you around");
					menuControl=false;
					break;
				default:
			}
			
		}
		
	}
}