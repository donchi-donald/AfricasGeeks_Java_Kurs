package traveauxDirige;

import java.util.Scanner;

public class MatheUebung {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Zahl ein: ");
		int zahl = clavier.nextInt();
		System.out.println("Fakultaet("+zahl+"): "+fakultaet(zahl));
		System.out.println("Ist ("+zahl+") durch 7 teilbar:  "+isDurch7Teilbar(zahl));

	}
	
	/**
	 * zahl = 3;
	 * result=3
	 * for i=2, 
	 * 
	 * @param zahl
	 * @return
	 */
	public static int fakultaet(int zahl) {
		//fakultat(4) = 4 * 3 * 2* 1, 
		//fakultat(4) = 1 * 2 *3 *4 
		int result = zahl;
		for(int i=zahl-1; i>1; i--) {
			result = result * i;
		}
		return result;
		
	}
	
	public static boolean  isDurch7Teilbar(int zahl) {
		return (zahl%7==0);
	}

}
