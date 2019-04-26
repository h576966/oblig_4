package no.hvl.dat102;

import java.util.Random;

public class Klient {
	static Random terning = new Random();
	static final int TOTANTALL = 1024;
	static final int TOTTREES = 100;
	static int minHoyde = TOTANTALL + 1;
	static int maksHoyde = 0;
	static int[] hoydeArray = new int[TOTANTALL];

	/**
	 * @param args
	 */

	private static KjedetBSTre<Integer> setup(int n) {
		if (!(n >= 1)) {
			return null;
		}
		KjedetBSTre<Integer> bstre = new KjedetBSTre<Integer>();

		for (int i = 0; i < n; i++) {
			bstre.leggTil(terning.nextInt());
		}
		return bstre;
	}
	
	private static int minTeoHoyde(int n) {
		return (int) Math.ceil(Math.log(n));
	}
	
	
	private static void runBSTre(int k) {
		KjedetBSTre<Integer> bstre = setup(TOTANTALL);
		int hoyde = bstre.getHeight();
		if (hoyde < minHoyde) {
			minHoyde = hoyde;
		}
		if (hoyde > maksHoyde) {
			maksHoyde = hoyde;
		}
		hoydeArray[k] = hoyde;
	}
		
	private static int gjennSnittHoyde() {
		int totHoyde = 0;
		for (int i = 0; i < hoydeArray.length; i++) {
			totHoyde += hoydeArray[i];
		}
		return (int) Math.ceil((double) totHoyde/hoydeArray.length);
	}

	public static void main(String[] args) {
		terning.nextInt();
		System.out.println("Antall noder: " + TOTANTALL);
		System.out.println("Lager " + TOTTREES + " bstre med dette antallet noder.");
		for (int i = 0; i < TOTTREES; i++) {
			runBSTre(i);			
		}
		System.out.println("Teoretisk minimum hoyde: " + minTeoHoyde(TOTANTALL)
		+ "\nTeoretisk maks hoyde: " + TOTANTALL
		+ "\nMinste hoyde funnet: " + minHoyde
		+ "\nStorste hoyde funnet: " + maksHoyde
		+ "\nGjennomsnittlig hoyde funnet: " + gjennSnittHoyde());
		
	}

	

}
