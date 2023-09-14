package HackerRank2;

import java.util.Scanner;

public class compareTheTriplets {

	public static void main(String[] args) {
		/*
		 
		  HACKERRANK ALGORİTMA SORUSU : 
		  
		  BOB VE ALİCE 3'ER BÜYÜKLÜĞÜ OLAN BİRER MATRİS YARATIYOR.
		  BU MATRİSLERİN AYNI SIRADAKİ ELEMANLARI KARŞILAŞTIRILIYOR
		  KİMİN ELEMANI DAHA BÜYÜK İSE BİR PUAN ALIYOR.
		  
		  DAHA FAZLA PUAN ALAN KAZANIR.
		  
		  İNPUT : 
		  
		  5 6 7   -----> ALİCE'İN DİZİSİ
		  3 6 10  -----> BOB'UN DİZİSİ
		  
		  OUTPUT :
		   
		  1 1  -------> ALİCE BİR PUAN VE BOB BİR PUAN ALDI SONUÇ : 1 1 (AYNI SIRALAMADIKİ ELEMANI BÜYÜK OLAN 1 PUAN ALIYOR).
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
		 
		 */
		
		
		Scanner input = new Scanner(System.in);
 		int alice[] = new int[3];
 		int bob[] = new int[3];
 		
 		int aliceScore = 0;
 		int bobScore = 0;
 		
		for (int counter = 0; counter < alice.length; counter++) {
			alice[counter] = input.nextInt();
		}
		for (int counter2 = 0; counter2 < bob.length; counter2++) {
			bob[counter2] = input.nextInt(); 
		}
		
		for (int counter3 = 0; counter3 < 3; counter3++) {
			if (alice[counter3] > bob[counter3]) {
				aliceScore++;
			}
			else if (alice[counter3] < bob[counter3]) {
				bobScore++;
			}
		}
		
		
		System.out.println(aliceScore + " " + bobScore);
		
		
	}

}
