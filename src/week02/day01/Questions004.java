package week02.day01;

import java.util.Scanner;

public class Questions004 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Lutfen yasinizi giriniz: ");
		int yas= scanner.nextInt();
		scanner.nextLine();
		System.out.print("Lutfen isminizi giriniz: ");
		String isim =scanner.nextLine();
		
		System.out.println("Yasiniz: "+yas+"\nIsminiz: "+isim);
		
		
	}
}