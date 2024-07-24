package week04.kks.original;

import java.time.LocalDate;

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
	
	// Getters and Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getTcKimlik() {
		return tcKimlik;
	}
	
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	
	public String getSifre() {
		return sifre;
	}
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	// Override equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Kullanici kullanici = (Kullanici) obj;
		return id == kullanici.id;
	}
	
	@Override
	public String toString() {
		return "Kullanici{" +
				"id=" + id +
				", isim='" + isim + '\'' +
				", soyisim='" + soyisim + '\'' +
				", email='" + email + '\'' +
				", telNo='" + telNo + '\'' +
				", tcKimlik='" + tcKimlik + '\'' +
				", kullaniciAdi='" + kullaniciAdi + '\'' +
				", sifre='" + sifre + '\'' +
				", dogumTarihi=" + dogumTarihi +
				'}';
	}
}