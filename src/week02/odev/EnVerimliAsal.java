package week02.odev;

public class EnVerimliAsal {
	public static void main(String[] args) {
		
		int number = 2097593;
		boolean isPrime = true;
		long startTime = System.nanoTime();
		if (number <= 1) {
			isPrime = false;
		}
		else if (number == 2) {
			isPrime = true;
		}
		else {
			for (long i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		long endTime = System.nanoTime();
		long durationEnVerimliAsal = endTime - startTime;
		
		if (isPrime) {
			System.out.println(number + " asaldır.");
		}
		else {
			System.out.println(number + " asal değildir.");
		}
		
		System.out.println("\nEn verimli calisma suresi: " + durationEnVerimliAsal + " nanosaniyedir.");
	}
}