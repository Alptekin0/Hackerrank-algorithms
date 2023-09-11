package HackerRank2;

import java.util.Scanner;

public class theBirthdayBar {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 ACIKLAMASI UZUN 
		 
		 HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
		  
		  
		  */

		Scanner input = new Scanner(System.in);

		int numberOfBar = input.nextInt();

		int lenghtOfBar[] = new int[numberOfBar];

		for (int counter = 0; counter < lenghtOfBar.length; counter++) {
			lenghtOfBar[counter] = input.nextInt();
		}

		int day = input.nextInt();
		int month = input.nextInt();
		int total = 0;
		int a = 0;
		int segmentMeeting = 0;
		int tempMonth = month;

		for (int counter = 0; counter < (lenghtOfBar.length - tempMonth) + 1; counter++) {
			for (int counter2 = counter; counter2 < month; counter2++) {
				total += lenghtOfBar[counter2];
			}
			if (total == day) {
				segmentMeeting++;
			}
			total = 0;
			month++;
		}

		System.out.println(segmentMeeting);

	}

}
