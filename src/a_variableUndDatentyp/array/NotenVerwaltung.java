package a_variableUndDatentyp.array;

import java.util.Scanner;

public class NotenVerwaltung {
	
	/*
	 * 1- initialiser l array de 5 element de type int
	 * 2- einlesen les valeurs (Notes des eleves) (Scanner)
	 * 2.1 prüfen si une valeurs est negatives ou > a 20.
	 * 2.2 si 2.1 est vrai alors mettre la note 0
	 * 
	 * 2.3 calculer et afficher la moyenne generale de la classe 
	 * 
	 * new features:
	 * 2.1 et 2.2 Si la note est negativ ou > 20 le user doit reentrer la note jusqu a ce que la note enter es compris entre  0 et 20.
	 */
	public static void main(String[] args) {
		int notes[] = new int[5];
		int nbrEleves = notes.length;
		int summe = 0;
		double moyenne = 0.0;
		Scanner clavier = new Scanner(System.in);
		
		for(int i=0; i<nbrEleves; i++) {
			System.out.print("Geben Sie die Notes der " +(i+1)+"te . Student: ");
			notes[i] = clavier.nextInt();
			if(notes[i]<0 || notes[i] > 20) {
				notes[i] = 0;
			}
		}
		//summe = notes[0] +  notes[1] +  notes[2] + notes[3] + notes[4];
		//notes { 20, 20, 20, 20, 20}
		//summe = 0 +  20 = 20 -> 1. for
		//summe = 20 +  20 = 40 -> 2. for
		//summe = 40 +  20 = 60 -> 3. for
		//summe = 60 +  20 = 80 -> 4. for
		//summe = 80 +  20 = 100 -> 5. for
		for(int i=0; i<nbrEleves; i++) {
			summe = summe + notes[i];
		}
		
		moyenne = summe / nbrEleves;
		System.out.println("la moyenne generale de la classe est de: "+ moyenne);
		
	
		
		
		
	

	}

}
