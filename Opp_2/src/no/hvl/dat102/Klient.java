package no.hvl.dat102;
import java.util.*;

import java.util.Random;

public class Klient {

	/**
	 * @param args
	 */

	private void testRun() {

		Random terning = new Random();
		KjedetBSTre<Integer> bstre = new KjedetBSTre<Integer>();

		for (int i = 0; i < 1024; i++) {
			bstre.leggTil(terning.nextInt());
		}
		

	}

	public static void main(String[] args) {
		KjedetBSTre bstre = new KjedetBSTre();

		bstre.leggTil(7);
		bstre.leggTil(5);
		bstre.leggTil(6);
		bstre.leggTil(4);
		bstre.leggTil(9);
		bstre.leggTil(10);
		bstre.leggTil(8);
		bstre.leggTil(3);

		// Tester på sortert utskrift
		System.out.println("Skriver ut elementene sortert i bs-treet");
		bstre.visInorden();

		// Tester på om et bestemt element fins
		int element = 8;
		System.out.println("\nTester paa om elementet " + element + " fins");

		if (bstre.finn(element) != null) {
			System.out.println("Elementet " + element + " fins i bs-treet");
		} else {
			System.out.println("Elementet " + element + " fins ikke i bs-treet");
		}

		element = 1;
		System.out.println("\nTester paa om elementet " + element + " fins");

		if (bstre.finn(element) != null) {
			System.out.println("Elementet " + element + " fins i bs-treet");
		} else {
			System.out.println("Elementet " + element + " fins ikke i bs-treet");
		}
	}

}
