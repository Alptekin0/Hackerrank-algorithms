package HackerRank2;

import java.util.Scanner;

public class staircase {

	public static void main(String[] args) {
		/*
		 HACKERRANKK ALGORİTMA :
		  
		  VERİLEN "N" SAYISI BÜYÜKLÜĞÜNDE AŞAĞIDAKİ ŞEKLİ OLUŞTURMA
		  
		  N = 4 İSE ;
		  
		   #
          ##
         ###
        ####
        
        HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
		  
	*/

		Scanner input = new Scanner(System.in);
		int lenght = input.nextInt();
		int tempLenght = lenght;

		for (int counter = 0; counter < lenght; counter++) {
			
			for (int space = tempLenght - 1; space > 0; space--) {
				System.out.print(" ");
			}
			for (int symbol = 0; symbol <= counter; symbol++) {
				System.out.print("#");
			}
			System.out.println();
			tempLenght--;
		}
		
		

	}

}
