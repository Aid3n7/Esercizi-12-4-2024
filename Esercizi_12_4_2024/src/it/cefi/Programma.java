package it.cefi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Un'array è una sequenza (collezione) "omogenea" e "immutabile" di dati.
 * Gli arrays possono essere monodimensionali o multidimensionali.
 * Gli arrays in Java sono degli oggetti istanziati a partire da alcune classi "speciali".
 */
public class Programma {

	public static void main(String[] args) {

		// int[] numeri = new int[10];
		// int[] numeri = new int[] { 10, 20, 30, 40, 50 };
		int[] numeri = { 50, 20, 10, 40, 40, 30 };
 
		System.out.println("dimensione array = " + numeri.length);

		// numeri[0] = 100;

		for (int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}

		System.out.println("------------------------------");

		for (int numero : numeri) {
			System.out.println(numero);
		}

		System.out.println("------------------------------");

		// Esercizio n. 1: Scrivere un algoritmo in grado di determinare qual è il
		// valore più piccolo presente nell'array
		// Esercizio n. 2: Scrivere un algoritmo in grado di determinare qual è il
		// valore più grande presente nell'array
		// Esercizio n. 3: Scrivere un algoritmo in grado di sommare tra di loro gli
		// elementi dell'array
		// Esercizio n. 4: Scrivere un algoritmo in grado di determinare la posizione di
		// un elemento all'interno dell'array (se l'elemento non c'è devo restituire -1)

		// ESERCIZIO 1:

		/*
		 * Versione 1 ----------------------------------------------
		 * 
		 * Arrays.sort(numeri);
		 * 
		 * {
		 * 
		 * System.out.println("Il numero piu piccolo e': " + numeri[0]);
		 * 
		 * }
		 * 
		 * ----------------------------------------------
		 */

		// Versione 2

		int min = numeri[0];

		for (int j = 0; j < numeri.length; j++) {
			if (numeri[j] < min) {
				min = numeri[j];
			}

		}
		System.out.println("Il valore minimo e': " + min);

		// ESERCIZIO 2:

		/*
		 * Versione 1 ----------------------------------------------
		 * Arrays.sort(numeri);
		 * 
		 * {
		 * 
		 * System.out.println("Il numero piu grande e': " + numeri[numeri.length - 1]);
		 * 
		 * } ----------------------------------------------
		 */

		// Versione 2
		int max = numeri[0];
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] > max) {
				max = numeri[i];
			}

		}
		System.out.println("Il valore massimo e': " + max);

		// ESERCIZIO 3:

		int somma = 0;
		for (int i = 0; i < numeri.length; i++) {
			somma = somma + numeri[i];
		}

		System.out.println("La somma dei numeri e': " + somma);

		// ESERCIZIO 4:

		Scanner scanner = new Scanner(System.in);

		System.out.print("Indica il valore da verificare: ");

		int value = scanner.nextInt();
		boolean checknum = false;
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == value) {
				System.out.println("Si trova in posizione: " + i);
				checknum = true;
			}

		}
		if (!checknum) {
			System.out.println(-1);
		}

		scanner.close();

	}
}
