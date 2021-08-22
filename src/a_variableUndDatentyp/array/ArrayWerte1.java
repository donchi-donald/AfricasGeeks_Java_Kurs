package a_variableUndDatentyp.array;

public class ArrayWerte1 {

	public static void main(String[] args) {
		int arrayEins[] = new int [6];
		//Typ []variablename = new Typ[größe]
		arrayEins[1] = 2;
		arrayEins[3] = 18;
		arrayEins[0] = 22;
		arrayEins[2] = 21;
		arrayEins[4] = 7;
		arrayEins[5] = 8;
		
		//1
		System.out.println("Aufgabe 1: ");
		System.out.println(arrayEins[0]);
		System.out.println(arrayEins[1]);
		System.out.println(arrayEins[2]);
		System.out.println(arrayEins[3]);
		System.out.println(arrayEins[4]);
		System.out.println(arrayEins[5]);
		//2
		System.out.println("Aufgabe 2: ");
		System.out.println(arrayEins[2] * arrayEins[1]);
		//2
		System.out.println("Aufgabe 3: ");
		System.out.println((double)arrayEins[0] / (double)arrayEins[3]);
		//System.out.println((double)(arrayEins[0]) / arrayEins[3]));
		System.out.println("Aufgabe 4: ");
		if((arrayEins[2] % arrayEins[4])==0 ) {
			System.out.println("5. Element ist teiler vom 3. Element.");
		}else {
			System.out.println("5. Element ist kein Teiler vom 3. Element.");
		}
		
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
		//5
		System.out.println("Aufgabe 5: ");
		arrayEins[0] = 127;
		System.out.println(arrayEins[0]);
		
		int b = 8;
		b = 12;
		b = 9;
		System.out.println(b);
		
	

	}

}
