package edunova;

import java.util.Arrays;

public class Zadatak1 {

	// definirati niz od 5 logičkih vrijednosti 
	// na prvi i zadnji element niza postaviti true
	// ostalo false
	// ispisati vrijednosti cijelog niza
	
	public static void main(String[] args) {
		
		boolean[] niz= new boolean [5] ;
		
		niz[0]=true;
		niz[4]=true;
		
		System.out.println(Arrays.toString(niz));
	}
}
