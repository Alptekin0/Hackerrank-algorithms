package HackerRank2;

import java.util.Scanner;

public class timeConversion {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 
		 HACKERRANK ALGORİTMA : 
		 
		 "AM" VEYA "PM" ŞEKLİNDE VERİLEN SAATİ ASKERİ(MİLİTARY) SAATE DÖNÜŞTÜRME
		 
		 INPUT : 
		 04:59:59PM
		 
		 OUTPUT : 
		 16:59:59

		  HACKERRANK LİNK : https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
		  */

		Scanner input = new Scanner(System.in);
		String string = input.next();

		turnIntoMilitaryClock(string);

	}

	public static void turnIntoMilitaryClock(String string) {

		if (string.contains("PM")) {

			string = string.substring(0, 8);
			int pm = 00;
			String pmString = "00";
			if (!string.substring(0, 2).equals("12")) {
				pm = Integer.valueOf(string.substring(0, 2)) + 12;
				System.out.println(pm + "" + string.substring(2, 8));
			} else {
				System.out.println(pmString + "" + string.substring(2, 8));
			}

		}

		if (string.contains("AM")) {
			string = string.substring(0, 8);
			String am = "00";
			if (string.substring(0, 2).equals("12")) {
				System.out.println(am + "" + string.substring(2, 8));
			} else {
				System.out.println(string);
			}

		}

	}

}
