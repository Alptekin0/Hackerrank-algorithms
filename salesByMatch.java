package HackerRank2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class salesByMatch {

	public static void main(String[] args) {
		/*
		 
		 HACKERRANK ALGORİTMA : 
		 
		  VERİLEN DİZİDEKİ HER SAYI BİR RENK ÇORABI İFADE ETMEKTEDİR.
		  BU DİZİDE KAÇ TANE AYNI RENK ÇORAP OLDUĞUNU BULACAĞIZ.
		  
		  İNPUT : 
		   6 ---> DİZİ ELEMAN SAYISI (ÇORAP SAYISI)
		   1 1 2 3 2 1  ---> DİZİ ELEMANLARI (RENKLERİ TEMSİL EDEN ELEMANLAR)
		   
		   OUTPUT : 
		    2 ---> 2 ÇİFT ÇORABI EŞLEYEBİLDİK. DİĞERLERİ TEK KALDI. 1, 1 AYNI RENK 1 ÇİFT ETTİ.
		           2, 2 AYNI RENK BİR ÇİFT DAHA. GERİ KALAN 1, 2 VE 3 TEK OLARAK KALDI ÇİFTLEYEMEDİK.
		           BÖYLECE 2 TANE ÇİFT ÇORABIMIZ OLDU.
		           
		   HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
		       
		 */
		
		Scanner input = new Scanner(System.in);
		
		int arrayLenght = input.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		
		for (int counter = 0; counter < arrayLenght; counter++) {
			array.add(input.nextInt());
		}
		
		
		 Collections.sort(array);
		 int result = sockMerchant(array);
		 System.out.println(result);
	}
	
	public static int sockMerchant(ArrayList<Integer> array ){
		
		int firstVariable = array.get(0);
		int sayac = 0;
		int pairCounter = 0;
		
		for (int counter = 0; counter < array.size(); counter++) {
			
			if (array.get(counter) == firstVariable) {
				sayac++;
			}
			else {
				pairCounter += sayac / 2;
				firstVariable = array.get(counter);
				counter--;
				sayac = 0;
			}
		}
		
		 if (sayac != 0) {
			 pairCounter += sayac / 2;
		}
		
		
		
		return pairCounter;
	}

}
