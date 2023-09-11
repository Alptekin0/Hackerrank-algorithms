package HackerRank2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class betweenTwoSets {

	public static void main(String[] args) {
		System.out.println();
		
		/*
		 HACKERRANK ALGORİTMA : 
		 
		  ANLAŞILMASI ZOR BİR KOD.
		  
		  HACKERRANK LİNKİ : https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
		  
		  */
		
		
		Scanner input = new Scanner(System.in);
		int firstArrayLenght = input.nextInt();
		int secondArrayLenght = input.nextInt();
		ArrayList<Integer> firstArray = new ArrayList<>();
		ArrayList<Integer> secondArray = new ArrayList<>();

		for (int counter = 0; counter < firstArrayLenght; counter++) {
			firstArray.add(input.nextInt());
		}
		for (int counter2 = 0; counter2 < secondArrayLenght; counter2++) {
			secondArray.add(input.nextInt());
		}

		Collections.sort(firstArray);
		Collections.sort(secondArray);

		int first = firstArray.get(0);
		int last = secondArray.get(secondArrayLenght - 1);
		int sayac = 0;

		ArrayList<Integer> memory = new ArrayList<>();
		ArrayList<Integer> memory2 = new ArrayList<>();

		while (first < last) {

			for (int counter = 0; counter < firstArray.size(); counter++) {

				if (first % firstArray.get(counter) == 0) {
					sayac++;
				}

			}
			if (sayac == firstArray.size()) {
				memory.add(first);
			}
			sayac = 0;
			first += firstArray.get(0);
		}

		int sayac2 = 0;

		for (int counter = last; counter > 0; counter--) {
			if (last % counter == 0) {

				for (int counter2 = 0; counter2 < secondArray.size(); counter2++) {

					if (secondArray.get(counter2) % counter == 0) {
						sayac2++;
					}
				}
			}
			if (sayac2 == secondArray.size()) {
				memory2.add(counter);
			}
			sayac2 = 0;
		}

		int nihayiSayac = 0;

		for (int counter = 0; counter < memory.size(); counter++) {
			for (int counter2 = 0; counter2 < memory2.size(); counter2++) {
				if (memory.get(counter) == memory2.get(counter2)) {
					nihayiSayac++;
				}
			}
		}
		if (firstArray.get(0) == 1) {
			nihayiSayac++;
		}
		System.out.println(nihayiSayac);

	}

}
