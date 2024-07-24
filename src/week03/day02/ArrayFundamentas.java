package week03.day02;

public class ArrayFundamentas {
	public static void main(String[] args) {
		// Aynı türde çoklu veri saklar.
		// Boyutu sabittir. Bir kere boyutlandırıldı mı, bir daha yeniden boyutlandırma doğrudan yapılamaz.
		
		String[] stringArray = new String[4];
		System.out.println(stringArray.length);
		String [] stringsArray1 = {"Kelime1","Kelime2"};
		String stringArray3[] = new String[5];
		boolean[] booleanArray = new boolean[3];
		System.out.println(booleanArray[0]); // Booleanlar default'ta false değeri alırlar.
		System.out.println(stringArray[0]); // Stringler default'ta null değeri alırlar.
		String str = stringArray[0];
		
		//{0,1,2,3,4,5,6,7,8,9,10}
		// {true,false,true,false,true,false,true,false,true,false}
		//boolean bool = str.equals("Mehmet Can"); // null pointer exception.
		
		//System.out.println(stringArray[5]); // Array Index Out Of Bounds Exception
		
		booleanArray[0]= (3==(1+2));
		System.out.println(booleanArray[0]);
	}
}