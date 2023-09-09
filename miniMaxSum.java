package HackerRank2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class miniMaxSum {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 HACKERRANK ALGORİTMA : 
		 
		  5 ELEMANLI OLARAK VERİLEN DİZİNİN EN BÜYÜK DÖRT SAYISININ VE EN KÜÇÜK DÖRT SAYISININ TOPLAMI
		  
		  İNPUT : 
		  
		  1 2 3 4 5 ----> 5 ELEMANLI DİZİ
		  
		  OUTPUT : 
		  
		  10 14   ----> 10 DİZİDEKİ EN KÜÇÜK 4 ELEMANIN TOPLAMI
		                14 İSE EN BÜYÜK 4 ELEMANIN TOPLAMI.
		                
		   HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
		   
		  */

		Scanner input = new Scanner(System.in);
		ArrayList<Long> arr = new ArrayList<>();

		for (int counter = 0; counter < 5; counter++) {
			arr.add(input.nextLong());
		}

		minMax(arr);

	}

	public static void minMax(ArrayList<Long> arr) {

		long sumOfBig = 0, sumOfSmall = 0;

		Collections.sort(arr);

		for (int counter = 0; counter < arr.size(); counter++) {

			if (counter >= 1) {
				sumOfBig += arr.get(counter);
			}
			if (counter < 4) {
				sumOfSmall += arr.get(counter);
			}
		}

		System.out.println(sumOfSmall + " " + sumOfBig);

	}

}
