package week03.day02;
//8- String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek çıktıyı almaya çalışalım;
//   "Adana şehrinin plaka kodu : 01"
//   Aşağdaki şehirler tek bir String degerdir.
//   -> 01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya
public class Questions008 {
	public static void main(String[] args) {
		String cities="01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;" +
				"09-Aydın;10-Balıkesir;42-Konya";
		int start=0;
		while (start < cities.length()){
			int tire = cities.indexOf("-",start);
			int noktaliVirgul= cities.indexOf(";",start);
			
			if (noktaliVirgul==-1) {
				noktaliVirgul=cities.length();
			}
			String plakaKodu=cities.substring(start,tire);
			String cityName=cities.substring(tire+1,noktaliVirgul);
			
			System.out.println(cityName + " şehrinin plaka kodu: " + plakaKodu);
			
			start=noktaliVirgul+1;
			
		}
		
	}
}