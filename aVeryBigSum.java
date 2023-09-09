package HackerRank2;

import java.util.Scanner;

public class aVeryBigSum {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 HACKKERRANK ALGORİTMA SORULARI : 
		 
		  İKİ TANE LONG SAYININ TOPLAMI.
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
		  
		  
		  */

		Scanner input = new Scanner(System.in);
		int numberOfEnter = input.nextInt();
		long sum = 0;

		for (int counter = 0; counter < numberOfEnter; counter++) {

			sum += input.nextLong();

		}
		System.out.println(sum);

	
	
	}

}
