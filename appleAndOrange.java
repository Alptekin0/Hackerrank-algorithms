package HackerRank2;

import java.util.Scanner;

public class appleAndOrange {

	public static void main(String[] args) {	
		/*
		 HACKERRANK ALGORİTMA : 
		 
		  EVİN X VE Y KONUMU, BİR ELMA VE PORTAKAL AĞACININ KONUMU, ELMA VE PORTAKAL AĞACININ
		  DÜŞÜRDÜKLERİ MEYVE SAYISI VE BU MEYVELERİ NE KADAR MESAFAYE DÜŞÜRDÜKLERİ VERİLMİŞTİR.
		  
		  AĞAÇLARIN DÜŞÜRDÜKLERİ MEYVENİN KAÇ TANESİ EVİN ÜSTÜNE DÜŞER.
		  
		  SORU BİRAZ KARIŞIK GİRDİLERİN FAZLA OLMASINDAN DOLAYI
		  HACKERRANKTE İNCELEMEK DAHA DOĞRU OLUR.
		  
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
		  */
		
		
		
		Scanner input = new Scanner(System.in);
		
		int houseX = input.nextInt();
		int houseY = input.nextInt();
		int appleTreeLocation = input.nextInt();
		int orangeTreeLocation = input.nextInt();
		int numberOfApple = input.nextInt();
		int numberOfOrage =input.nextInt();
		int appleLocation[] = new int[numberOfApple];
		int orangeLocation[] = new int[numberOfOrage];
		int inclusiveRangeApple = 0;
		int inclusiveRangeOrange = 0;
		
		for (int counter = 0; counter < appleLocation.length; counter++) {
			appleLocation[counter] = input.nextInt() + appleTreeLocation;
			if (appleLocation[counter]>= houseX && appleLocation[counter]  <= houseY) {
				inclusiveRangeApple++;
			}
		}
		for (int counter2 = 0; counter2 < orangeLocation.length; counter2++) {
			orangeLocation[counter2] = input.nextInt() + orangeTreeLocation;
			if (orangeLocation[counter2] >= houseX && orangeLocation[counter2] <= houseY) {
				inclusiveRangeOrange++;
			}
		}
		
		
		System.out.println(inclusiveRangeApple);
		System.out.println(inclusiveRangeOrange);
		
	}

}
