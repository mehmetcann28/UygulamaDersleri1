package week02.day04;

public class StringFunctions {
	public static void main(String[] args){
		String value = " Merhaba Dunya ";
		String value2= "Merhaba Dunya";
		System.out.println(value.charAt(2));//2.indexteki karakteri gösteriyor.
		
		System.out.println(value.trim());//whitespaceleri siler.
		
		System.out.println(value2.length());
		
		System.out.println(value2.indexOf('a'));//a harfinin ilk görüldüğü indexi verir.
		
		System.out.println(value2.lastIndexOf('a'));//a harfinin sondan görüldüğü ilk indexi verir.
		
		System.out.println(value2.substring(5));//5.index ve sonrasının getirir.
		
		System.out.println(value2.substring(0,5));//0. indexten 5.indexe kadar olan kısmı getirir.
		
		System.out.println(value.equals(value2));
		
		System.out.println(value.trim() == value2);
		// referans degerine bakarak okuyor.
		// Bu iki degiskenin degeri bellekte ayni adreste saklanmiyor.
		
		System.out.println(value.trim().equals(value2));
		
		System.out.println(value == " Merhaba Dunya ");
		// value degiskeninin degeri ile ham (raw) " Merhaba Dunya " degerini karsilastiriyor.
		// Farkli bir string degiskeni icerisinde olmayan " Merhaba Dunya " text'i heap'te herhangi bir nesneye karsilik gelmiyor.
		// doyisiyla value degiskeninin degerini aldığı adres, aslında " Merhaba Dunya " yazısının ta kendisi.
		// o yüzden true döner.
		
		
		
		System.out.println(value.trim() == value2);
		// referans degerine bakarak okuyor.
		// Bu iki degiskenin degeri bellekte ayni adreste saklanmiyor.
		
		System.out.println(value.trim().equals(value2));
		
	}
}