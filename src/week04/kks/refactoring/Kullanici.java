package week04.kks.refactoring;

import java.time.LocalDate;
import java.util.Objects;

public class Kullanici {
	private int id;
	private String isim;
	private String soyisim;
	private String email;
	private String telNo;
	private String tcKimlik;
	private String kullaniciAdi;
	private String sifre;
	private LocalDate dogumTarihi;
	
	// Getters and Setters for all fields
	
	// Override equals and hashCode
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Kullanici kullanici = (Kullanici) obj;
		return id == kullanici.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// Other methods...
}