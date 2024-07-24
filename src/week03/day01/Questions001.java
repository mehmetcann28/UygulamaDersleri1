package week03.day01;

import java.util.Scanner;

public class Questions001 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("\nMenu:");
			System.out.println("1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu ve index numaralarını yazdırın. Eğer harf içermiyorsa 'aradığınız harf yok' gibi bir çıktı verin.");
			System.out.println("2- Dışarıdan bir kelime giriniz. Daha sonra değiştirmek istediğiniz harfi giriniz ve hangi harfle değiştireceğinizi belirtin. Eğer kelimemiz içerisinde o harf varsa değiştirsin.");
			System.out.println("3- Dışarıdan girilen bir kelimeyi ters çevirip yazdıralım. Ayrıca bu kelimenin bir palindrom olup olmadığını kontrol edelim (örneğin: 'kek', 'iki', 'kabak', 'saippuakivikauppias').");
			System.out.println("4- Dışarıdan 5 adet kelime girelim. Her kelimenin a, b veya c ile başlayıp başlamadığını kontrol edelim. Ayrı ayrı sayfa açıldığını düşünelim; a ile başlayanlar bir sayfaya, b ile başlayanlar bir sayfaya, c ile başlayanlar bir sayfaya yazılsın. Diğer harflerle başlayanlar için ayrı bir sayfa düşünelim. Sonrasında girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa olduğunu ekrana yazdıralım.");
			System.out.println("0 - Çıkış");
			
			System.out.print("\nLütfen seçim yapınız:");
			
			int entry= scanner.nextInt();
			System.out.println("Seçiminiz: " + entry);
			scanner.nextLine();
			
			switch (entry){
				
				case 1:
					System.out.print("Lütfen bir kelime giriniz: ");
					String word = scanner.nextLine();
					System.out.print("Lütfen bir harf giriniz: ");
					char letter = scanner.nextLine().charAt(0);
					
					int count = 0;
					String index = "";
					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == letter) {
							count++;
							index += i + " ";
						}
					}
					if (count > 0) {
						System.out.println("'"+letter+"' Harfi kelimede " + count + " kez bulunuyor. Index " +
								                  "numaraları: " + index);
					} else {
						System.out.println("Aradığınız harf yok.");
					}
					break;
					
				case 2:
					System.out.print("Bir kelime girin: ");
					String word1 = scanner.nextLine();
					System.out.print("Değiştirmek istediğiniz harfi girin: ");
					char oldChar = scanner.nextLine().charAt(0);
					System.out.print("Yeni harfi girin: ");
					char newChar = scanner.nextLine().charAt(0);
					
					if (word1.indexOf(oldChar) != -1) {
						String newWord = word1.replace(oldChar, newChar);
						System.out.println("\nYeni kelime: " + newWord);
					} else {
						System.out.println("\nKelime içerisinde belirtilen harf yok.");
					}
					break;
					
				case 3:
					System.out.print("Bir kelime girin: ");
					String word2 = scanner.nextLine();
					String reversedWord = new StringBuilder(word2).reverse().toString();
					System.out.println("Ters çevrilmiş kelime: " + reversedWord);
					if (word2.equals(reversedWord)) {
						System.out.println("Bu kelime bir palindromdur.");
					} else {
						System.out.println("Bu kelime bir palindrom değildir.");
					}
					break;
					
				case 4:
					String[] words = new String[5];
					for (int i = 0; i < 5; i++) {
						System.out.print((i + 1) + ". kelimeyi girin: ");
						words[i] = scanner.nextLine();
					}
					String aPage = "", bPage = "", cPage = "", otherPage = "";
					
					for (String word3 : words) {
						char firstChar = word3.toLowerCase().charAt(0);
						switch (firstChar) {
							case 'a':
								aPage += word3 + " ";
								break;
							case 'b':
								bPage += word3 + " ";
								break;
							case 'c':
								cPage += word3 + " ";
								break;
							default:
								otherPage += word3 + " ";
								break;
						}
					}
					
					int pageCount = 0;
					if (aPage.length() > 0) pageCount++;
					if (bPage.length() > 0) pageCount++;
					if (cPage.length() > 0) pageCount++;
					if (otherPage.length() > 0) pageCount++;
					
					System.out.println("Elimizde " + pageCount + " adet sayfa var.");
					if (aPage.length() > 0) System.out.println("A sayfası: " + aPage);
					if (bPage.length() > 0) System.out.println("B sayfası: " + bPage);
					if (cPage.length() > 0) System.out.println("C sayfası: " + cPage);
					if (otherPage.length() > 0) System.out.println("Diğer sayfa: " + otherPage);
					break;
					
				case 0:
					System.out.println("Çıkış yapılıyor...");
					scanner.close();
					return;
				default:
					System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
				}
		}
	}
}