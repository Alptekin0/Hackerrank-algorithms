package HackerRank2;

import java.util.Scanner;

public class billDivision {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 HACKERRANK ALGORİTMA : 
		 
		 2 ARKADAŞ YEMEK YİYORLAR HESABI BÇLÜŞÜP ÖDEMEYE KARAR VERİYORLAR.
		 GELEN HESAPTA BİRİNİN YEMEDİĞİ BİR YEMEK VAR.
		 O HARİÇ DİĞERLERİNİ BÖLÜŞÜREK ÖDEYECEKLER.
		 ARKADAŞLARDAN BİRİ PARAYI VERİYOR DİĞERİ ÖDEME YAPIYOR.
		 VE ARKADAŞI FAZLA PARA VERMİŞ İSE ÜSTÜNÜ ONA VERMESİ İCİN HESAPLAMALI. BU HESABI YAPACAĞIZ
		 EĞER PARA ÜSTÜ KALMIYOR İSE DİĞER ARKADAŞ TAM DEĞERİNDE VERMİŞ İSE EKRANA "BON APPETİT" YAZDIRACAĞIZ.
		 
		 INPUT : 
		 
		 4 1  ---> 4 = YEDİKLERİ YEMEK SAYISI , 1 = HESAPTA GELEN AMA BİR ARKADAŞIN YEMEDİĞİ(DİĞERLERİ BERABER YİYİLDİ ORTAK ÖDENECEK).
		 3 10 2 9  ---> YENİLEN YEMEKLERİN HESABI 1 İNDEKSLİ YEMEĞİ DİĞER ARKADAŞ YEMEDİĞİNİ SÖYLEDİ. AMA DİĞERLERİ ORTAK
		 7   ---> 7 TL BİR ARKADAŞIN VERDİĞİ PARA
		 
		 OUTPUT :
		 
		  BON APPETİT ---> 1 İNDEKS HARİC DİĞERLERİ ORTAK YENMİŞ VE ORTAK ÖDENECEK. 3+2+9 = 14 TL TUTUYOR.
		                   İKİ ARKADAŞ HER BİRİ 7 TL VERMESİ GEREKİYOR.
		                   ARKADAŞLARDAN BİRİ 7 TL VERMİŞ PARA ÜSTÜ KALMIYOR. BU NEDENLE BON APPETİT YAZDIRDIK.
		                   PARA ÜSTÜ KALSAYDI PARA ÜSTÜNÜ YAZACAKTIK.
		   
		   HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
		  
		  
		  */

		Scanner input = new Scanner(System.in);

		int orderedItemsNumbers = input.nextInt();

		int didntEat = input.nextInt();

		int array[] = new int[orderedItemsNumbers];

		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = input.nextInt();
		}

		int annasGive = input.nextInt();

		BonAppetit(orderedItemsNumbers, didntEat, array, annasGive);

	}

	public static void BonAppetit(int orderedItemsNumbers, int didntEat, int[] array, int annasGive) {

		int total = 0;

		for (int counter = 0; counter < array.length; counter++) {
			if (counter != didntEat) {
				total += array[counter];
			}
		}

		if (total / 2 == annasGive) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(annasGive - (total / 2));
		}

	}

}
