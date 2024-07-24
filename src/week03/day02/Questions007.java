package week03.day02;
//7- Dizide 13 sayısına denk gelene kadar devam edelim. 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise 13'den sonra   gelen sayıyı toplama ekleyelim.
//   -> 1, 13, 13, 13, 5, 13
public class Questions007 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 13, 13, 13, 5, 13};
		int total =0;
		for (int i = 0; i < numbers.length-1; i++) {
			if (numbers[i]==13 && numbers[i+1]!=13){
				total+=numbers[i+1];
			}
		}
		System.out.println(total);
	}
}