package HackerRank2;

import java.util.Scanner;

public class simpleArraySum {

	public static void main(String[] args) {
		
		/*
		 
		 HACKERRANK ALGORİTMA SORULARI : 
		 
		  VERİLEN ARRAYIN İCİNDEKİ SAYİLARIN TOPLAMINI DONDUREN KOD.
		  
		  İNPUT : 
		  
		  6       ---> 6 UZUNLUĞUNDA DİZİ VERİLECEĞİ GİRİLMİŞ.
		  1 2 3 4 10 11   ---> DİZİ
		  
		   OUTPUT : 
		   31   ---> DİZİ TOPLAMI
		  
		  
		  */
		
		
		Scanner input = new Scanner(System.in);

		int numberOfInput = input.nextInt();

		int array[] = new int[numberOfInput];

		for (int counter = 0; counter < numberOfInput; counter++) {

			int numbers = input.nextInt();
			array[counter] = numbers;

		}
		int sum = 0;
		for (int counter = 0; counter < array.length; counter++) {

			sum += array[counter];

		}

		System.out.println(sum);

	}

}
