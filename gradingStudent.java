package HackerRank2;

import java.util.Scanner;

public class gradingStudent {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		  	HACKERRANK ALGORİTMA : 
		  	
		  	 MEZUNİYET PUANLARI İÇİN YAPILAN DÜZENLEMEDE BİR PROFESÖR KISACA ŞÖYLE BİR KARAR ALIR.
		  	 
		  	 GİRİLEN PUANIN EĞER BİRLER BASAMAĞI 3 VE 4 İSE 5'E YUVARLAMA 
		  	 8 VE 9 İSE 10'A YUVARLAMA YANİ ÖĞRENCİLERİN PUANINI YÜKSELTİR(EN YAKIN BEŞLİĞE YUVARLAYARAK).
		  	 
		  	 ÖRNEK : 
		  	 38 --> 40
		  	 44 --> 45
		  	 41 --> 41 // BİRLER BASAMAĞI 1 ONUN İCİN OLDUĞU GİBİ KALIR.
		  	 
		  	 INPUT : 
		  	 4   ---> KAC GİRDİ OLACAĞINI BELİRTİR
             73
             67
             38
             33
             
             OUTPUT : 
             75
             67
             40
             33  	 
		  	 
		  	 HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
		  */
		Scanner input = new Scanner(System.in);
		int numberOfgrade = input.nextInt();
	
		for (int counter = 0; counter < numberOfgrade; counter++) {
			
			int grade = input.nextInt();
			
			if (grade >= 38) {
				if (grade % 10 == 3 || grade % 10 == 4) {
					System.out.println((grade / 5) * 5 + 5);
				} else if (grade % 10 == 8 || grade % 10 == 9) {
					System.out.println((grade / 5) * 5 + 5);
				}
				else {
					System.out.println(grade);
				}
			}
			else {
				System.out.println(grade);
			}

		}

	}

}
