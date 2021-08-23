package a_variableUndDatentyp;

import java.util.Scanner;

/*
 Schreiben Sie ein Javaprogramm, das die Koeffizienten a, b, c, d sowie den Wert x des Polynoms
y = a * x3  + b * x2  + c * x + d
einliest und das Ergebnis y ausgibt.
 */
public class Uebung3 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
        System.out.println("geben sie a");
        int a=clavier.nextInt();
        System.out.println("geben sie b");
        int b=clavier.nextInt();
        System.out.println("geben sie c");
        int c=clavier.nextInt();
        System.out.println("geben sie d");
        int d=clavier.nextInt();
        System.out.println("geben sie x");
        int x=clavier.nextInt();
        int y= a*(x*x*x)+b*(x*x)+c*(x)+d;
        System.out.println("y=a(x*x*x)+b(x*x)+c*(x)+d: " +y);

	}

}
