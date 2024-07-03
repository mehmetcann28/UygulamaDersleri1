package week02.day01;

import java.util.Scanner;

//1'den başlayarak, kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların 1 fazlasının toplamını ekrana
// yazdıran program.
public class Questions008 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen sayi girininiz: ");
		int number = scanner.nextInt();
		int total = 0;
		int i =1;
		
		/**for (int i=1; i<=number;i++){
			total=total+(i+1);
		}*/
		while(i<=number){
			total=total+(i+1);
			i++;
		}
		System.out.println("1'den girdiginiz sayiya kadar olan sayilarin 1 fazlasinin toplami: " +total);
	}
}