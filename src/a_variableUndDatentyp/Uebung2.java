package a_variableUndDatentyp;

import java.util.Scanner;

/*
 Schreiben Sie ein Java-Programm, das eine Anzahl von Sekunden einliest und in
die Anzahl von Stunden, Minuten und Sekunden umrechnet.
Testen Sie Ihr Programm mit vernünftigen Eingabewerten, z. B. mit 0, 59, 60,
100, 3600 und 4000.
 
Beispiel: Die Eingabe 1234 soll zur Ausgabe von 0 : 20 : 34 führen.
 */
public class Uebung2 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Geben Sie die Anzahl von Sekunden: ");
		int seconde = clavier.nextInt();
		
		int h = seconde / 3600;
		int m = (seconde - h*3600)/ 60;
		int s = seconde - h*3600 - m*60;
		System.out.println(h+" : "+ m + " : "+s);

	}

}
