package week02.day01;

public class Questions002 {
	public static void main(String[] args) {
		/**int tlMiktari=10000;
		double dovizKuru=32.89;
		double dolarMiktari;
		
		dolarMiktari=(double)tlMiktari/dovizKuru;
		System.out.println(dolarMiktari);**/
		
		/**double amount = 100;
		double exchangeRate = 32.68;
		float exchangeRateFloat = 32.68f;
		
		//int sayi = Integer.MAX_VALUE;
		int sayi = 26;
		System.out.println(sayi);
		short sayiShort= 26;
		*/
		double amount = 100;
		double exchangeRate = 32.68;
		float exchange =(float) (amount / exchangeRate);
		System.out.println(amount+ " TL " + exchange + " Dolara esittir");
	}
}