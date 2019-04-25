package no.hvl.dat102;
import java.util.*;

import java.util.Random;

public class Klient {
	static Random terning = new Random();

	/**
	 * @param args
	 */

	private static KjedetBSTre<Integer> setup() {
		KjedetBSTre<Integer> bstre = new KjedetBSTre<Integer>();

		for (int i = 0; i < 1024; i++) {
			bstre.leggTil(terning.nextInt());
		}
		return bstre;
	}

	public static void main(String[] args) {
		terning.nextInt();
		KjedetBSTre<Integer> bstre = setup();
		System.out.println(bstre.antall());
		
	}

}
