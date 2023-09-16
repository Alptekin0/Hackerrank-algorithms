package HackerRank2;

import java.util.Scanner;

public class dayOfTheProgrammer {

	public static void main(String[] args) {
		/*
		 HACKERRANK ALGORİTMA : 
		 
		  1700 İLE 2700 ARASINDAKİ YILLARIN RUSYANIN ZAMAN İCİNDE KULLANDIĞI TAKVİMLERE GÖRE
		  ZAMAN YOLCULUĞU YAPMAK İSTEYEN BİR KIZCAĞIZIN EĞER YOLCULUĞU RUSYA'YA YAPAR
		  O YIL RUSYADA 256. GÜN (256. GÜNE GİTMEK İSTEDİĞİNDEN DOLAYI) HANGİ GÜNE VE
		  AYA DENK GELDİĞİNİ BULUYORUZ.
		  
		  INPUT : 
		  1800 ---> GİDİLEN YIL
		  
		  OUTPUT : 
		  12.09.1800 ---> GİDİLEN YILDA 256. GÜN RUSLARIN ZAMAN İCİNDE DEĞİŞEN TAKVİMLERİNE GÖRE BU TARİHE DENK GELİYORMUŞ.
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/day-of-the-programmer/problem?h_r=internal-search
		 
		 
		  */

		Scanner input = new Scanner(System.in);

		int year = input.nextInt();

		dayOfProgrammer(year);
	}

	public static void dayOfProgrammer(int year) {

		if (year >= 1700 && year <= 1918) {
			if (year % 4 == 0) {
				System.out.println("12.09."+year);
			}
			else {
				System.out.println("13.09."+year);
			}
		}
		else {
			
			if (year % 400 == 0 && year % 4 == 0 && year % 100 !=0) {
				System.out.println("13.09."+year);
			}
			else {
				System.out.println("12.09."+year);
			}
			
		}
		
		
	}

}
