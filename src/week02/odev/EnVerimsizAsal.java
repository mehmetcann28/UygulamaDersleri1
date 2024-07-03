package week02.odev;

public class EnVerimsizAsal {
	public static void main(String[] args) {
		
		int number = 2097593;
		boolean status = true;
		long startTime = System.nanoTime();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				status = false;
				break;
			}
		}
		
		if (status == true) {
			System.out.println(number + " asal sayidir");
		}
		else {
			System.out.println(number + " asal sayi degildir.");
		}
		
		long endTime = System.nanoTime();
		long durationEnVerimsiz = endTime - startTime;
		System.out.println("\nEn verimsiz calisma suresi: " + durationEnVerimsiz + " nanosaniyedir.");
		
		
	}
}