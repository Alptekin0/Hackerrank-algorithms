package HackerRank2;

import java.util.Scanner;

public class breakingTheRecord {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		   HACKERRANK ALGORİTMA : 
		     
		     BİR BASKETBOLCU OYNADIGI MACLARDA SEZON REKORLARINI KAC KEZ KIRDIGINI SAYMAK İSTİYOR
		     BUNUN İCİN BİZE OYNADIĞI MAC SAYISI VE MACTA ATTIĞI SKOR SAYISI VERİLİYOR.
		     İLK MACTAN İTİBAREN HEM EN KÖTÜ SKORU REKORUNU KAC KEZ KIRDIĞINI HEM DE EN İYİ SKOR REKORLARINI YAZDIRIYORUZ.
		     
		     INPUT : 
		      
		      	4 ---> OYNADIĞI MAC SAYISI
		      	12 24 10 24 ---> MACLARDA ALDIĞI SKOR
		      	
		     OUTPUT : 
		     
		     1 1 ---> ÇÜNKÜ İLK MAC 12 DEN İTİBAREN EN YÜKSEK VE EN DÜŞÜK REKORLARINI SAYMAYA BAŞLIYORUZ.
		              SONRAKİ SAYI 24 EN YÜKSEK REKOR 1 OLDU
		              SONRAKİ SAYI 10 EN DÜSÜK REKOR 1 OLDU
		              SONRAKİ SAYI 24 EN YÜKSEK REKOR ZATEN 24 OLDUGU İCİN BİR ŞEY DEĞİŞMEDİ
		              BÖYLECE EN YÜKSEK VE EN DÜŞÜK REKORUNU 1 KEZ KIRMIŞ OLDU.
		              CIKTI 1 1 OLDU.
		              
		      HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
		              
		     
		  
		  */
		
		
		Scanner input = new Scanner(System.in);

		int numberOfMatch = input.nextInt();

		int maxScore = Integer.MIN_VALUE;
		int minScore = Integer.MAX_VALUE;
		int countMin = 0;
		int countMax = 0;

		for (int counter = 0; counter < numberOfMatch; counter++) {

			int Scores = input.nextInt();

			if (maxScore < Scores) {
				maxScore = Scores;
				countMax++;
			}
			if (minScore > Scores) {
				minScore = Scores;
				countMin++;
			}
		}

		System.out.println((countMax - 1) + " " + (countMin - 1));

	}

}
