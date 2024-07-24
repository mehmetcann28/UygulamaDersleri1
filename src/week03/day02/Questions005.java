package week03.day02;

import java.util.Arrays;

//5 - Dizideki bütün sayıların toplamını yazdıralım.
//    Dizinin her bir elemanı için;
//    çift ise çifttir, tek ise tektir yazdıralım.
//    -> 0, 120, 5, 85, -256, 16, 1258, 81, 14
public class Questions005 {
	public static void main(String[] args) {
		
		int[] numbers = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		int sum = Arrays.stream(numbers).sum();
		System.out.println("Dizideki sayıların toplamı: "+sum);
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2==0) {
				System.out.println(numbers[i]+ "--> Çift ");
			}
			else {
				System.out.println(numbers[i]+"--> Tek");
			}
		}
		System.out.println("------------------------------------------");
		int total=0;
		for (int number:numbers ){
			
			if (number%2==0) {
				System.out.println(number+"--> sayısı çifttir.");
			}
			else {
				System.out.println(number + "--> sayısı tektir");
			}
		}
		System.out.println("Total: "+total);
		System.out.println("---------------------------------------");
	}
}