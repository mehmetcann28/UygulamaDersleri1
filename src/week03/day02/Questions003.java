package week03.day02;
//3- Dizideki en buyuk 2. sayiyi bulalim.
//   -> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
public class Questions003 {
	public static void main(String[] args) {
		
		int[] numbers={1258,1300,120, 130, 125, -256, 16,81, 14};
		
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i]>max) {
				max=max2;
				max2=numbers[i];
			}
			else if (numbers[i]>max2){
				max2=numbers[i];
			}
		}
		System.out.println("İkinci en büyük sayı: " + max2);
		
	}
}