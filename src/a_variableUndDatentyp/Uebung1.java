package a_variableUndDatentyp;

import java.util.Scanner;

/*
 Schreiben Sie einen Java-Ausdruck, der eine ganze Zahl x auf das nächstliegende Vielfache von 100 rundet.

Beispiel:

der Wert 149 soll auf 100 abgerundet werden
der Wert 150 auf 200 aufgerundet werden.
 */
public class Uebung1 {
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("wie alt bist du?: ");
		
		int alt = clavier.nextInt();
		if(alt < 5) {
			System.out.println("Tu es un bebe");
		}else if(alt<15) {
			System.out.println("Tu es adolescent");
		}else if (alt==18) {
			System.out.println("Tu viens d etre majeur");
		}else {
			System.out.println("tu es vieux/vielle");
		}
		
		
		System.out.println("Entre un nombre: ");
		int nbr = clavier.nextInt();
		int result = ((nbr+50)/100) * 100;
		System.out.println("Nombre arrondi: "+result);
		
	}
	

}
