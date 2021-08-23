package b_kontrollstrukturen.auswahl;

public class Auswahl {

	public static void main(String[] args) {
		int arrayEins[] = new int [6];
		//Typ []variablename = new Typ[größe]
		arrayEins[1] = 2;
		arrayEins[3] = 18;
		arrayEins[0] = 22;
		arrayEins[2] = 21;
		arrayEins[4] = 7;
		arrayEins[5] = 8;
		//a ist ein Teiler von b b%a==0
		/**
		 * if(bedingung){
		 * 	Anweisung
		 * }else{
		 * 	Anweisung
		 * }
		 * 
		 * if(bedingung){
		 * 	Anweisung
		 * }else if(bedingung){
		 * 	Anweisung
		 * }else{
		 * Anweisung
		 * }
		 */
		
		if((arrayEins[2] % arrayEins[4])==0 ) {
			System.out.println("5. Element ist teiler vom 3. Element.");
		}else {
			System.out.println("5. Element ist kein Teiler vom 3. Element.");
		}
		

	}

}
