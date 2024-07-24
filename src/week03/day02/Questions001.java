package week03.day02;

import java.util.Scanner;

//1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
//   -> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
public class Questions001 {
	public static void main(String[] args) {
		
		String[] countryArray = {"Türkiye","Çin","Japonya","Rusya","Moğolistan","Amerika"};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir ülke ismi giriniz: ");
		String country = scanner.nextLine();
		boolean bulunduMu=false;
		
		for (int i = 0; i < countryArray.length; i++) {
			if (countryArray[i].toLowerCase().equals(country)) {
				bulunduMu=true;
				break;
			}
		}
		System.out.println(bulunduMu?"BULUNDU - Aranan ülke dizide var":"BULUNAMADI - Aranan ülke dizide yok");
		
		
	}
}