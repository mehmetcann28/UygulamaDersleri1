package week02.day03;
import java.util.Scanner;
import java.util.Scanner;
//2- Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre bur. hesabı yapan program
//
//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart

public class Questions002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir ay giriniz: ");
		int month= scanner.nextInt();
		System.out.println("Lutfen bir gun giriniz: ");
		int day= scanner.nextInt();
		
		switch (month){
			case 1:{
				if(day<=21){
					System.out.println("Oglak");
				}else {
					System.out.println("Kova");
				}
			}
			case 2:{
				if (day<=19){
					System.out.println("Kova");
				}else {
					System.out.println("Balik");
				}
			}
			case 3:{
				if (day<=20){
					System.out.println("Balik");
				}
			}
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
		}
		
		
		
	}
}