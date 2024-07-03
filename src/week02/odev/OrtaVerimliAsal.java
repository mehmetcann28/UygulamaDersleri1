package week02.odev;

public class OrtaVerimliAsal {
	public static void main(String[] args) {
		
		
		int number= 2097593;
		
		boolean status = true;
		
		long startTime = System.nanoTime();
		for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++)
		{
			
			if (number % i == 0) {
				status = false;
				break;
			}
		}
		
		long endTime = System.nanoTime();
		long durationOrtaVerimli = endTime-startTime;
		
		if (status == true)
		{
			System.out.println(number + " asal sayidir");
		}
		else
		{
			System.out.println(number + " asal sayi degildir.");
		}
		System.out.println("\nOrta verimli calisma suresi: " + durationOrtaVerimli + " nanosaniyedir.");
	}
}