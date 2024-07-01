package week02.day01;

public class Questions001 {
	public static void main(String[] args) {
		/**int urun_fiyati=100;
		double kdv=0.18;
		double kar=0.15;
		double ham_fiyat;
		
		//urun_fiyati=ham_fiyat+kdv+kar
		ham_fiyat=(double)(urun_fiyati/(1+kdv+kar));
		
		System.out.println("Urunun ham fiyati: "+ham_fiyat);
		*/
		float rawPrice = 0, price = 100,vatRatio = 0.18f, profitRatio = 0.15f, priceWithoutVat;
		priceWithoutVat = price - (price * vatRatio);
		System.out.println("KDV'siz fitay: " + priceWithoutVat);
		rawPrice = priceWithoutVat - (priceWithoutVat * profitRatio);
		System.out.println("Ham fiyat: " + rawPrice);
	}
}