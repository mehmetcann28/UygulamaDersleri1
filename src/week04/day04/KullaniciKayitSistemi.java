package week04.day04;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KullaniciKayitSistemi {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		int secim = 0;
		do {
			System.out.println("### KULLANICI KAYIT SISTEMI ###");
			System.out.println("1- Kayit Ol");
			System.out.println("2- Giriş Yap");
			System.out.println("3- Şifremi Unuttum");
			System.out.println("0- Cikis");
			System.out.print("Lutfen bir secim yapiniz : ");
			secim = scanner.nextInt();
			scanner.nextLine();
			durum(secim);
		} while (secim != 0);
	}
	
	private static void durum(int secim) {
		switch (secim) {
			case 1: {
				Kullanici kullanici = kullaniciKaydi();
				break;
			}
			case 2: {
				girisYap();
				break;
			}
			case 3: {
				sifremiUnuttum();
				break;
			}
			case 4: {
				KullaniciDB.findAll();
				break;
			}
		}
	}
	
	private static Kullanici kullaniciKaydi() {
		LocalDate dogumTarihi;
		dogumTarihi = dogumTarihiAl();
		if (dogumTarihKontrol(dogumTarihi)) {
			Kullanici kullanici = new Kullanici();
			kullanici.setDogumTarihi(dogumTarihi);
			String[] isimSoyisim = isimSoyisimAl();
			kullanici.setIsim(isimSoyisim[0]);
			kullanici.setSoyisim(isimSoyisim[1]);
			kullanici.setEmail(emailAl());
			kullanici.setTelNo(telNoAl());
			kullanici.setSifre(sifreAl());
			kullanici.setKullaniciAdi(kullaniciAdiAl());
			kullanici.setTcKimlik(tcKimlikAl());
			KullaniciDB.save(kullanici);
			return kullanici;
		} else {
			System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
		}
		return null;
	}
	
	private static void girisYap() {
		System.out.println("Kullanıcı Adı:");
		String kullaniciAdi = scanner.nextLine();
		System.out.println("Şifre:");
		String sifre = scanner.nextLine();
		
		Kullanici kullanici = KullaniciDB.findByKullaniciAdiAndSifre(kullaniciAdi, sifre);
		if (kullanici != null) {
			System.out.println("Başarıyla giriş yaptınız.");
		} else {
			System.out.println("Kullanıcı adı veya şifre hatalı.");
		}
	}
	
	private static void sifremiUnuttum() {
		System.out.println("Email:");
		String email = scanner.nextLine();
		Kullanici kullanici = KullaniciDB.findByEmail(email);
		if (kullanici == null) {
			System.out.println("Bu email adresi ile kayıtlı kullanıcı bulunamadı.");
			return;
		}
		System.out.println("Yeni Şifre:");
		String yeniSifre = scanner.nextLine();
		kullanici.setSifre(yeniSifre);
		System.out.println("Şifreniz başarıyla güncellendi.");
	}
	
	private static LocalDate dogumTarihiAl() {
		while (true) {
			System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd) : ");
			String date = scanner.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			} catch (Exception e) {
				System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
			}
		}
	}
	
	private static boolean dogumTarihKontrol(LocalDate date) {
		int yas = Period.between(date, LocalDate.now()).getYears();
		boolean resitMi = (yas >= 18);
		return resitMi;
	}
	
	private static String[] isimSoyisimAl() {
		String[] isimSoyisim = new String[2];
		System.out.print("Lutfen adinizi giriniz : ");
		isimSoyisim[0] = scanner.nextLine();
		System.out.print("Lutfen soyadinizi giriniz : ");
		isimSoyisim[1] = scanner.nextLine();
		return isimSoyisim;
	}
	
	private static String emailAl() {
		System.out.print("Lutfen mailinizi giriniz : ");
		return scanner.nextLine();
	}
	
	private static String telNoAl() {
		System.out.print("Lutfen telefon numaranizi giriniz : +90 ");
		return scanner.nextLine();
	}
	
	private static String sifreAl() {
		String sifre;
		String sifreYeniden;
		while (true) {
			System.out.print("Lutfen bir sifre giriniz min 8 - max 32 karakter : ");
			sifre = scanner.nextLine();
			if (sifre.length() < 8) {
				System.out.println("Sifre 8 karakterden kisa olamaz.");
				continue;
			} else if (sifre.length() > 32) {
				System.out.println("Sifre 32 karakterden uzun olamaz.");
				continue;
			} else {
				System.out.print("Lutfen sifreninizi tekrar giriniz : ");
				sifreYeniden = scanner.nextLine();
				if (sifre.equals(sifreYeniden)) {
					return sifre;
				} else {
					System.out.println("Girdiginiz sifreler eslesmiyor! ");
				}
			}
		}
	}
	
	private static String kullaniciAdiAl() {
		String kullaniciAdi;
		while (true) {
			System.out.print("Lutfen bir kullanici adi giriniz min 4 - max 16 karakter : ");
			kullaniciAdi = scanner.nextLine();
			if (kullaniciAdi.length() < 4) {
				System.out.println("Kullanici adi 4 karakterden kisa olamaz.");
				continue;
			} else if (kullaniciAdi.length() > 16) {
				System.out.println("Kullanici adi 16 karakterden uzun olamaz.");
				continue;
			}
			return kullaniciAdi;
		}
	}
	
	private static String tcKimlikAl() {
		String tcKimlik;
		while (true) {
			System.out.print("Lutfen TC kimlik numaranizi giriniz : ");
			tcKimlik = scanner.nextLine();
			if (tcKimlik.length() != 11) {
				System.out.println("TC Kimlik No 11 haneli olmalidir.");
				continue;
			} else if (!numerikDegerKontrol(tcKimlik)) {
				System.out.println("TC Kimlik No sadece numerik karakterler barindirabilir. ");
				continue;
			}
			return tcKimlik;
		}
	}
	
	private static boolean numerikDegerKontrol(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}