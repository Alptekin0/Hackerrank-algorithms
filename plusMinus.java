package HackerRank2;

import java.util.Scanner;

public class plusMinus {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 HACKERRANK ALGORİTMA : 
		  
		  ÖNCE BOYUTU DAHA SONRA KENDİSİ VERİLEN DİZİ İÇİNDEKİ
		  POZİTİF, NEGATİF, VE 0 ORANINI BULAN KOD.
		  
		  İNPUT : 
		  
		  10       ---> DİZİ BOYUTU
          0 100 35 0 94 40 42 87 59 0 ---> DİZİ 
          
          OUTPUT : 
          
          DİZİDEKİ POZİTİF NEGATİF VE 0 ORANI AŞAĞIDAKİ ŞEKİLDE YAZILACAKTIR.(VİRGÜLDEN SONRA 6 RAKAM VE ALT ALTA)
          
          0.700000  ----> POZİTİF ORANI
          0.000000  ----> NEGATİF ORANI
          0.300000  ----> 0 ORANI
          
          HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
          
		  */
		
		
		
		Scanner input = new Scanner(System.in);
		
		int sizeOfArray = input.nextInt();
		
		int array[] = new int[sizeOfArray];
		
		double rateOfPositive = 0;
		double rateOfNegative = 0;
		double rateOfZero = 0;
		
		
		for (int counter = 0; counter < array.length; counter++) {
			array [counter] = input.nextInt();
			
			if (array[counter] > 0) {
				rateOfPositive++;
			}
			else if (array[counter] < 0) {
				rateOfNegative++;
			}
			else {
				rateOfZero++;
			}
		}
		
		System.out.printf("%.6f %n",rateOfPositive/array.length);
		System.out.printf("%.6f %n",rateOfNegative/array.length);
		System.out.printf("%.6f %n",rateOfZero/array.length);
		
		
		
	}

}
