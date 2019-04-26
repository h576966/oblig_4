package no.hvl.dat102;

import java.util.Iterator;

//********************************************************************
// KjedetBinærSøkeTre.java        
//
//********************************************************************

public class KjedetBSTre<T extends Comparable<T>> implements BSTreADT<T>, Iterable<T> {

	private int antall;
	private BinaerTreNode<T> root;

	/******************************************************************
	 * Oppretter et tomt binært søketre.
	 ******************************************************************/
	public KjedetBSTre() {
		antall = 0;
		root = null;
	}

	/******************************************************************
	 * Oppretter et binært søketre med en node..
	 ******************************************************************/
	public KjedetBSTre(T element) {
		root = new BinaerTreNode<T>(element);
		antall = 1;
	}

	/*****************************************************************
	 * Returnerer sann hvis dette binære trett er tomt og usann ellers.
	 *****************************************************************/
	public int antall() {
		return antall;
	}

	/*****************************************************************
	 * Returnerer sann hvis dette binære treet er tom og usann ellers.
	 *****************************************************************/
	public boolean erTom() {
		return (antall == 0);
	}

	/**********************************************************************
	 * Legger det spesifiserte elementet på passende plass i BS-treet. Like
	 * elementer blir lagt til VENSTRE. Bruk av rekursiv hjelpemetode.
	 ********************************************************************/
	public void leggTil(T element) {
		root = leggTilRek(root, element);
		antall++;
	}

	private BinaerTreNode<T> leggTilRek(BinaerTreNode<T> p, T element) {
		if (root == null) {
			return new BinaerTreNode<T>(element);
		} else if (p.getElement().compareTo(element) <= 0) {
			if (p.getVenstre() == null) {
				BinaerTreNode<T> ny = new BinaerTreNode<T>(element);
				p.setVenstre(ny);
			} else {
				leggTilRek(p.getVenstre(), element);
			}
		} else {
			if (p.getHoyre() == null) {
				BinaerTreNode<T> ny = new BinaerTreNode<T>(element);
				p.setHoyre(ny);
				return p;
			} else {
				leggTilRek(p.getHoyre(), element);
			}
		}
		return p;
	}

	/******************************************************************
	 * Legger det spesifiserte elementet på passende plass i dette binære
	 * søketreet. Like elementer blir lagt til høyre.
	 ******************************************************************/

	public void leggTil2(T element) {
		// TODO Blir skriven i forelesing
	}

	/******************************************************************
	 * Fjerner noden med minste verdi fra dette binære søketreet.
	 *********************************************************************/
	public T fjernMin() {
		// TODO Blir skriven i forelesing
		return null;
	}//

	/******************************************************************
	 * Fjerner noden med største verdi fra dette binære søketreet.
	 ******************************************************************/
	public T fjernMaks() {
		// TODO Blir skriven i forelesing
		return null;
	}//

	/******************************************************************
	 * Returnerer det minste elementet i dette binære søketreet.
	 ******************************************************************/
	public T finnMin() {
		// TODO Blir skriven i forelesing
		return null;
	}//

	/******************************************************************
	 * Returnerer det største elementet i dette binære søketreet.
	 ******************************************************************/
	public T finnMaks() {
		// TODO Blir skriven i forelesing
		return null;
	}//

	/*******************************************************************************
	 * Returnerer en referanse til det spesifiserte elementet hvis det finst i dette
	 * BS-treet, null ellers. Bruk av rekursjon /
	 ******************************************************************************/
	public T finn(T element) {
		// Søk med rekursiv hjelpemetode

		// return finnRek(element, rot);
		return null;
	}

	// Den rekursive hjelpemetoden for søking

	// TODO Blir skriven i forelesing

	/************************************************************************
	 * Returnerer en referanse til det spesifiserte elementet hvis det fins i dette
	 * BS-treet, null ellers. Uten bruk av rekursjon. /
	 ************************************************************************/
	public T finn2(T element) {
		// TODO Blir skriven i forelesing
		return null;
	}

	public void visInorden() {
		visInordenRec(root);
		System.out.println();
	}

	private void visInordenRec(BinaerTreNode<T> p) {
		if (p != null) {
			visInordenRec(p.getVenstre());
			System.out.print(" " + p.getElement());
			visInordenRec(p.getHoyre());
		} // else bass: gjer ingenting
	}

	private int heightRec(BinaerTreNode<T> node, int hoyde) {
		if ((node.getVenstre() == null) && (node.getHoyre() == null)) {
			return hoyde;
		}
		int hoydeVenstre = 0;
		int hoydeHoyre = 0;
		if (node.getVenstre() != null) {
			hoydeVenstre = heightRec(node.getVenstre(), hoyde + 1);
		}
		if (node.getHoyre() != null) {
			hoydeHoyre = heightRec(node.getHoyre(), hoyde + 1);
		}
		if (hoydeVenstre >= hoydeHoyre) {
			return hoydeVenstre;
		} else {
			return hoydeHoyre;
		}
	}

	public int getHeight() {
		int hoyde = -1;
		if (erTom()) {
			return hoyde;
		}

		BinaerTreNode<T> iter = root;
		hoyde = heightRec(iter, hoyde + 1);

		return hoyde;
	}

	/*
	 * private Iterator<T> iteratorRec(BinaerTreNode<T> node) { Iterable<T> denne =
	 * new Iterable<T>(node.getElement()); if (node.getVenstre() != null) {
	 * iteratorRec(node.getVenstre()) } return null; }
	 */

	@Override
	public Iterator<T> iterator() {
		return null; // iteratorRec(root);
	}
}// class