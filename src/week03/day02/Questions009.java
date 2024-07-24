package week03.day02;
//9- 2 Boyutlu Array'de çarpım tablosunu yazdıralım.
public class Questions009 {
	public static void main(String[] args) {
		
		int size=10;
		int[][] multiplicationTable = new int[size][size];
		
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <=size ; j++) {
				multiplicationTable[i-1][j-1] = i*j;
			}
		}
		
		for (int i = 1; i <=size ; i++) {
			for (int j = 1; j <=size ; j++) {
				System.out.println(i+"*"+j+"="+multiplicationTable[i-1][j-1] + "\t");
			}
		}
		
		
		
	}
}