package week02.day01;

import java.util.Scanner;

public class Questions005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen dairenin yaricapini giriniz:");
		double yaricap= scanner.nextDouble();
		double cevre = 2*Math.PI*yaricap;
		double alan = Math.PI*(yaricap*yaricap);
		System.out.println("Dairenin cevresi: "+cevre+"\nDairenin alani: "+alan);
	}
}