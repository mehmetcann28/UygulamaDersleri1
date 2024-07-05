package week02.day04.day04questions;

import java.util.Scanner;

public class Questions001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen kelime giriniz: ");
		String word = scanner.nextLine();
		//String wordTrim=word.trim();
		//System.out.println(wordTrim);
		int index =0;
		while (true){
			try {
				word.charAt(index);
				index++;
			}
			catch (Exception e) {
				break;
			}
		}
		System.out.println(word + " harf sayisi " + index);
	}
}