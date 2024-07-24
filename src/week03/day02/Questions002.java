package week03.day02;
//2- En büyük ve en küçük sayiyi tespit edelim.
//   -> 0, 120, 5, 85, -256, 16, 1258, 81, 14

import java.util.Arrays;
import java.util.OptionalInt;

public class Questions002 {
	public static void main(String[] args) {
		
		int[] numbers = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		//OptionalInt max = Arrays.stream(numbers).max();
		//OptionalInt min = Arrays.stream(numbers).min();
		
		//System.out.println("max: " + max.getAsInt() + " min: " + min.getAsInt());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]<min) {
					min = numbers[i];
			}
			if (numbers[i]>max){
				max=numbers[i];
			}
		}
		System.out.println("max: " + max + " min: " + min);
	}
}