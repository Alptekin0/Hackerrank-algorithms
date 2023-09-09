package HackerRank2;

import java.util.Scanner;

public class birthdayCakeCandles {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 HACKERRANK ALGORİTMA : 
		 
		  BOYUTU VE KENDİSİ VERİLEN DİZİNİN İCİNDEKİ EN BÜYÜK SAYININ KAC TANE OLDUĞUNU BULACAĞIZ.
		  
		  INPUT : 
		  4  ---> DİZİ BOYUTU
		  3 7 2 7 ---> DİZİ
		  
		  OUTPUT : 
		  
		  2 ---> ÇÜNKÜ DİZİNİN EN BÜYÜK ELEMANI 7. VE BU ELEMAN DİZİDE 2 ADET BULUNUYOR.
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
		  */
		
		Scanner input = new Scanner(System.in);
		int sizeOfArray = input.nextInt();
		int numbers[] = new int[sizeOfArray];
		
		for (int counter = 0; counter < numbers.length; counter++) {
			numbers[counter] = input.nextInt();
		}
		
		
		int bigger = Integer.MIN_VALUE;
		
		for (int counter = 0; counter < numbers.length; counter++) {
			if (numbers[counter] > bigger) {
				bigger = numbers[counter];
			}
		}
		
		int howManyBigger = 0;
		
		for (int counter = 0; counter < numbers.length; counter++) {
			if (bigger == numbers[counter]) {
				howManyBigger++;
			}
		}
		
		System.out.println(howManyBigger);
		
		
		
	}

}
