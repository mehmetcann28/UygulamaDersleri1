package week02.day03.odev;

import java.util.Scanner;

public class KullaniciMenusuDeneme1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int turkishMenu = 0;
		int turkishMenuSelection;
		int langSelection;
		while (i<=2){
			System.out.println("Hosgeldiniz! / Welcome!\nLutfen goruntuleme dilini seciniz. / Please select display language.\n1-- Turkish(TR)\n2-- English (EN)");
			langSelection = scanner.nextInt();
			if (langSelection<1 || langSelection>2) {
				System.out.println("Yanlis giris yaptiniz. Lutfen devam etmek istediginiz dilin yaninda yazan numarayi giriniz!!");
			}
			else {
				if (langSelection==1){
					while(turkishMenu<=4){
						System.out.println("0 -- Cikis Yap\n" + "1--  Merhaba Dunya yazdir.\n" + "2-- Faktoriyel Hesapla.\n" + "3-- Asal sayi kontrolu yap.");
						turkishMenuSelection = scanner.nextInt();
						if (turkishMenuSelection<0|| turkishMenuSelection>3){
							System.out.println("Bu kod calisti");
						}
						else {
						
						}
					}
				}
				i++;
			}
			
		
		}
	}
}