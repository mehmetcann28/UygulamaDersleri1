package week03.day03;

public class MethodFundamentals {
	public static void main(String[] args) {
		System.out.println();
		int mehmet=3;
		String name ="Mehmet can";
		int age = 24;
		
		System.out.println(parameterizedReturnTypeMethod(mehmet));
	}
	
	/*
	1- Geriye değer döndüren
	2- Geriye değer döndürmeyen
	3- Parametre alan
		3.1 - Birden fazla parametre alan
		3.2 - Tek parametre alan
	4- Parametre almayan
	5- Overloads methods
	
	Metot içerisinde metot çağırılabilir. Ancak metot içersinde metot oluşturulamaz.
	Metotlar class scope'unda tanımlanır.
	 */
	
	// parametresiz metot
	public static void nonParameterizedMethod(){
	
	}
	// parametresiz ama geri dönüş tipi olan metot
	public static void nonParameterizedReturnTypeMethod(){
		System.out.println("Hello word");
		return;
	}
	
	// parametreli geri dönüş tipsiz
	
	public static String parameterizedReturnTypeMethod(int number){
		int number1 =5;
		number +=number1;
		return "Merhaba " + number;
	}
	public static void parameterizedNonReturnTypeMethod(String name,int age){
	
	}
}