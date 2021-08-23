package a_variableUndDatentyp;

import java.util.Scanner;

/*
 Schreiben Sie ein Java-Programm, das die x- und y-Koordinaten zweier Punkte einliest und den Abstand zwischen ihnen berechnet und ausgibt.

Tipp: Math.sqrt() berechnet eine Wurzel
 */
public class Uebung4 {

	public static void main(String[] args) {
		 Scanner clavier =new Scanner (System.in);
         System.out.println("geben sie xa");
         int xa= clavier.nextInt();
         System.out.println("geben sie ya");
         int ya= clavier.nextInt();
         System.out.println("geben sie xb");
         int xb= clavier.nextInt();
         System.out.println("geben sie yb");
         int yb= clavier.nextInt();
         int xbMinusXaQuadrat=(xb-xa)*(xb-xa);
         int ybMinusYaQuadrat=(yb-ya)*(yb-ya);
         System.out.println("Abstand=wuerzel(xbMinusXaQuadrat + ybMinusYaQuadrat): "+Math.sqrt(xbMinusXaQuadrat+ybMinusYaQuadrat));

	}

}
