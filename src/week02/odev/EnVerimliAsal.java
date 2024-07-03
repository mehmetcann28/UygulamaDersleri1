package week02.odev;

public class EnVerimliAsal {
	public static void main(String[] args) {
		
		int number = 2097593;
		boolean status = true;
		long startTime = System.nanoTime();
		if (number <= 1) {
			status = false;
		}
		else if (number == 2) {
			status = true;
		}
		else {
			for (long i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					status = false;
					break;
				}
			}
		}
		long endTime = System.nanoTime();
		long durationEnVerimliAsal = endTime - startTime;
		
		if (status) {
			System.out.println(number + " asaldır.");
		}
		else {
			System.out.println(number + " asal değildir.");
		}
		
		System.out.println("\nEn verimli calisma suresi: " + durationEnVerimliAsal + " nanosaniyedir.");
	}
}