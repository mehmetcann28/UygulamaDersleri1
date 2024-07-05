package week02.day04.day04questions;

import java.util.Scanner;

public class Questions002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen kelime giriniz: ");
		String word = scanner.nextLine();
		int index = 0;
		int count=0;
		char targetCh='a';
		while (index<word.length()){
			if (word.charAt(index)== targetCh) {
				count++;
			}
			index++;
		}
		System.out.println("Girdiginiz kelimede "+count+" tane "+ targetCh+" harfi vardir");
		
	}
}