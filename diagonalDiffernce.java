package HackerRank2;

import java.util.Scanner;

public class diagonalDiffernce {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 HACKERRANK ALGORİTMA : 
		 
		 BOYULTARI VERİLEN MATRİSİN DİYAGONELLERİNİN FARKINI BULAN KOD.
		 
		 İNPUT : 
		 
		 3    ---> MATRİSİN BOYUTU VERİLMİŞ. (3*3)
		 
		 11  2  4   ---> MATRİS
		 4   5  6
		 10  8 -12
		 
		 OUTPUT : 
		 
		 15   ---> CEVAP 15 ÇÜNKÜ SAĞ ÇARPRAZDA 11
		                                            5
                                                       -12   SAYILARI VERİLMİŞ BUNLARIN TOPLAMI 11 + 5 + (-12) = 4
                                   
                                   SOL ÇARPRAZDA İSE        4
                                                         5 
		                                              10       SAYILARI VERİLMİŞ BUNLARIN TOPLAMI 4 + 5 + 10 = 19
		                                              
		               SAĞ ÇARPRAZ VE SOL ÇARPRAZ FARKI = | 4 - 19 | = 15'DİR.
		  
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
		  
		  
		  */

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int matris[][] = new int[size][size];
		int sumOfRight = 0;
		int sumOfLeft = 0;

		for (int counter = 0; counter < matris.length; counter++) { // MATRİSİ OLUŞTURMA KISMI
			for (int counter2 = 0; counter2 < matris.length; counter2++) {
				matris[counter][counter2] = input.nextInt();
			}
		}

		
		int counter = 0;
		int counter2 = matris.length - 1;
		
		while (counter2 >= 0) { // ÇARPRAZLARI TOPLAMA
			
			sumOfRight += matris[counter][counter];
			sumOfLeft += matris[counter2][counter];
						
			counter++;
			counter2--;
			
		}

		System.out.println(Math.abs(sumOfLeft - sumOfRight)); // MUTLAK DEĞERDE DİYAGONEL FARKLARINI ALIP YAZDIRMA.

	}

}
