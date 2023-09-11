package HackerRank2;

import java.util.Scanner;

public class divisibleSumPairs {

	public static void main(String[] args) {		
		/*
		  HACKERRANK ALGORİTMA : 
		  
		   VERİLEN BİR DİZİ(DİZİ UZUNLUĞU İLE BİRLİKTE VERİLİYOR.) VE BİR SAYI.
		   DİZİ İCİNDEKİ KAC TANE 2 ELEMANIN TOPLAMI SAYIYI TAM BÖLÜYOR DİYE KONTROL EDİP EKRANA YAZDIRACAĞIZ.
		   
		   INPUT : 
		   6 3   ---> 6 : DİZİ UZUNLUĞU , 3 : BÖLÜNEBİLİRLİĞİ KONTROL EDECEĞİMİZ SAYİ
		   1 3 2 6 1 2 ---> DİZİ
		   
		   OUTPUT : 
		   5  ---> DİZİNİN ELEMANLARINI KENDİSİ HARİC İLERİ DOĞRU 2 ŞER 2 ŞER (İKİLİ OLARAK) OLACAK ŞEKİLDE TOPLUYORUZ.
		           EĞER TOPLAM 3'E BÖLÜNÜYOR İSE SAYAC BİR ARTIYOR.(TOPLADIĞIMIZ İKİLİ)
		           VE SONDA SAYACI YAZDIRIYORUZ.
		           
		   HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
		 */
		
		
		Scanner input = new Scanner(System.in);

		int arrayLenght = input.nextInt();

		double isDivise = input.nextDouble();

		double array[] = new double[arrayLenght];

		for (int counter = 0; counter < arrayLenght; counter++) {
			array[counter] = input.nextInt();
		}

		int sayac = 0;

		for (int counter = 0; counter < array.length; counter++) {
			for (int counter2 = counter + 1; counter2 < array.length; counter2++) {
				Double total = array[counter] + array[counter2];
				if (total >= isDivise && total % isDivise == 0) {
					sayac++;
				}
			}
		}
		System.out.println(sayac);

	}
}
