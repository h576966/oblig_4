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
		KjedetBSTre<Integer> bstre = new KjedetBSTre<Integer>();
		
	}

}
