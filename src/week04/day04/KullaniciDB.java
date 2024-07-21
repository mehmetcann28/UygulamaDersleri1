package week04.day04;

public class KullaniciDB {
	private static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	public static Kullanici save(Kullanici kullanici) {
		for (Kullanici existingUser : kullaniciOzelListe.getKullaniciDizisi()) {
			if (existingUser.getEmail().equals(kullanici.getEmail())) {
				System.out.println("Girdiğiniz email kullanılmaktadır.");
				return null;
			}
			if (existingUser.getTcKimlik().equals(kullanici.getTcKimlik())) {
				System.out.println("Girdiğiniz TC kimlik başkasına aittir.");
				return null;
			}
			if (existingUser.getKullaniciAdi().equals(kullanici.getKullaniciAdi())) {
				System.out.println("Girdiğiniz kullanıcı adı kullanılmaktadır.");
				return null;
			}
		}
		return kullaniciOzelListe.add(kullanici);
	}
	
	public static Kullanici[] findAll() {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		for (Kullanici kullanici : kullaniciDizisi) {
			System.out.println(kullanici);
		}
		return kullaniciDizisi;
	}
	
	public static Kullanici findByKullaniciAdiAndSifre(String kullaniciAdi, String sifre) {
		for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()) {
			if (kullanici.getKullaniciAdi().equals(kullaniciAdi) && kullanici.getSifre().equals(sifre)) {
				return kullanici;
			}
		}
		return null;
	}
	
	public static Kullanici findByEmail(String email) {
		for (Kullanici kullanici : kullaniciOzelListe.getKullaniciDizisi()) {
			if (kullanici.getEmail().equals(email)) {
				return kullanici;
			}
		}
		return null;
	}
}