package week03.day04;

public class Questions004 {
	public static void main(String[] args) {
		int[] array = { 1, 5, -4, 3 };
		
		// En küçük farkı bulmak için başlangıç değeri
		int minDifference = Integer.MAX_VALUE;
		
		// Tüm çiftler arasındaki farkları kontrol edin
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int difference = Math.abs(array[i] - array[j]);
				System.out.println("Difference between " + array[i] + " and " + array[j] + " is: " + difference);
				if (difference < minDifference) {
					minDifference = difference;
				}
			}
		}
		
		// En küçük farkı yazdırın
		System.out.println("En küçük fark: " + minDifference);
	}
}