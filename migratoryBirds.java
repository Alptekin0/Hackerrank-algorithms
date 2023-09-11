package HackerRank2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class migratoryBirds {

	public static void main(String[] args) {		
		/*
		  HACKERRANK ALGORİTMA : 
		  
		   UZUNLUĞU İLE BİRLİKTE BİR DİZİ VERİLİYOR. 
		   BU DİZİ İCİNDEKİ EN COK TEKRAR EDEN ELEMANI BULUYORUZ.
		   EĞER 2 TANE ELEMAN AYNI SIKLIKTA TEKRAR EDİYOR İSE KÜCÜK OLANI YAZDIRMAMIZ LAZIM.
		   
		   İNPUT : 
		   
		   15    ---> DİZİ UZUNLUĞU
		   2 4 3 2 3 1 2 1 3 3 4 4 4 3 4 ---> DİZİ
		   
		   OUTPUT : 
		   
		   3 ---> DİZİ İCİNDE 3 VE 4 5 KEZ TEKRAR EDİYOR VE EN COK TEKRAR EDEN ELEMANLARDIR.
		          HER İKİSİ DE AYNI TEKRAR SIKLIĞINA SAHİP FAKAT KÜÇÜK OLANI YAZDIRMAMIZ LAZIM.
		          BU NEDENLER ÇIKTI 3 OLUYOR. 
		          
	       
	       HACKERRANK : https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
		  
		  
		  */
		
		Scanner input = new Scanner(System.in);

		int arrayLenght = input.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		for (int counter = 0; counter < arrayLenght; counter++) {
			array.add(input.nextInt());
		}

		Collections.sort(array);
		Collections.reverse(array);

		int result = migratorBirds(arrayLenght, array);
		System.out.println(result);

	}

	public static int migratorBirds(int arrayLenght, ArrayList<Integer> array) {

		int sayac = 0;
		int tempsayac = 0;
		int frequenceValue = 0;
		int counter = 0;

		for (; counter < array.size(); counter++) {
			for (int counter2 = counter + 1; counter2 < array.size(); counter2++) {

				if (array.get(counter) == array.get(counter2)) {
					sayac++;
					counter++;
				}
			}
			if (sayac >= tempsayac) {
				frequenceValue = array.get(counter);
				tempsayac = sayac;
			}
			counter++;
			sayac = 0;

		}

		return frequenceValue;
	}

}
