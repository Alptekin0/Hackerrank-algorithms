package HackerRank2;

import java.util.Scanner;

public class numberLineJumps {

	public static void main(String[] args) {
		/*
		 
		 HACKERRANK ALGORİTMA : 
		  
		  ZIPLAYAN İKİ KANGURUNUN BAŞLANGIÇ NOKTALARI VE HER ZIPLAMADA ALDIĞI MESAFE VERİLİYOR.
		  BU İKİ KANGURU BİRBİRLERİ İLE AYNI ZAMANDA AYNI YERDE BULUNABİLİR Mİ?
		  
		  SAYİ DOĞRUSU ÜZERİNDE POZİTİF YÖNDE DÜŞÜNÜYORUZ.
		  
		  EĞER AYNI ANDA AYNI NOKTADA BULUNABİLİYORSA KANGURULAR "YES" BULUNAMIYORSA "NO" DİYE ÇIKTI YAZILACAK.
		  
		  ÖRNEK :
		  
		  İNPUT :
		  
		  2  ---> 1. KANGURU KONUMU
		  1  ---> 1. KANGURU HIZI (HER ZIPLAMADA ALDIĞI YOL)
		  1  ---> 2. KANGURU KONUMU
		  2  ---> 2. KANGURU HIZI (HER ZIPLAMADA ALDIĞI YOL)
		  
		  OUTPUT :
		  
		  YES ---> ÇÜNKÜ 1. KANGURU İLK ZIPLAMASINDA 3 KONUMUNA ULAŞACAK. 2. KANGURU DA İLK ZIPLAMASINDA 3 KONUMUNA ULAŞACAK.
		           BÖYLECE İLK ZIPLAMALARINDA(AYNI ANDA) AAYNI KONUMDA OLACAKLAR VE ÇIKTI "YES" OLACAK.
		           
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
		  
		  
		  */

		Scanner input = new Scanner(System.in);
		int locationKangaroo1 = input.nextInt();
		int jumpKangaroo1 = input.nextInt();
		int locationKangaroo2 = input.nextInt();
		int jumpKangaroo2 = input.nextInt();

		int betterJump = (int) Math.max(jumpKangaroo1, jumpKangaroo2);
		int lessJump = (int) Math.min(jumpKangaroo1, jumpKangaroo2);
		int whoIsBehind = (int) Math.min(locationKangaroo1, locationKangaroo2);
		int whoIsAhead = (int) Math.max(locationKangaroo1, locationKangaroo2);

		boolean situtaion = false;

		if (locationKangaroo1 > locationKangaroo2 && jumpKangaroo1 > jumpKangaroo2) {
			System.out.println("NO");
			situtaion = true;

		} else if (locationKangaroo2 > locationKangaroo1 && jumpKangaroo2 > jumpKangaroo1) {
			System.out.println("NO");
			situtaion = true;
		} else {

			while (whoIsBehind < whoIsAhead) {
				whoIsBehind += betterJump;
				whoIsAhead += lessJump;

				if (whoIsAhead == whoIsBehind) {
					System.out.println("YES");
					situtaion = true;
					break;
				}
			}
		}

		if (situtaion == false) {
			System.out.println("NO");
		}

	}

}
