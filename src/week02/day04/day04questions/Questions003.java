package week02.day04.day04questions;

import java.util.Scanner;

public class Questions003 {
	public static void main(String[] args) {
		String words = "Java,React,Spring";
		int yazdir = 1;
		int entry = words.length()+yazdir;
		System.out.println(entry);
		
		words = words.replace(",", "\n");
		System.out.println(words);
		
		
		/**for (int i = 0; i < words.length(); i++) {
		 if (words.charAt(i)==',') {
		 System.out.println();
		 }
		 else {
		 System.out.print(words.charAt(i));
		 }
		 }*/
		
		
		//int index =0;
		
		/**for (int i = 0; i <words.length() ; i++) {
		 if (words.charAt(i)==',') {
		 System.out.println(words.substring(index,i));
		 index=i+1;
		 }
		 else {
			
		 }
		 }
		 System.out.println(words.substring(index));*/
		
		
		//int start = 0;
		//int end = words.indexOf(",");
		
		/**while (end!=-1){
		 System.out.println(words.substring(start,end));
		 start=end+1;
		 end=words.indexOf(',',start);
		 }
		 System.out.println(words.substring(start));*/
		
		
	}
}