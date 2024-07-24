package week03.day02;
//4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
//   -> 2, -256, 2, 1258, 2, 2
public class Questions004 {
	public static void main(String[] args) {
		
		int[] numbers={2, -256, 2, 1258, 2, 2};
		
		boolean ayniMi=false;
		
		for (int i = 0; i < numbers.length-1; i++) {
			if (numbers[i]== 2 && numbers[i+1]==2) {
				ayniMi= true;
				break;
			}
		}
		System.out.println(ayniMi);
	}
}