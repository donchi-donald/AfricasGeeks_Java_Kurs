package e_klassen_und_objecte;

import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {
	static int count = 0;
	ArrayList<String> l;

	public static void main(String[] args) {
		String [][] addressbuch = new String[20][7];
		String anrede, vorname,  nachname, straße, hausnummer, plz,  ort;
		Scanner clavier = new Scanner(System.in);
		int antwort=0, index=0;
		
		
		do {
			menu();
			antwort = clavier.nextInt();
			switch(antwort){
				case 1 :{
					System.out.println("1: Neue Adresse eintragen");
					System.out.println("Geben Sie bitte  die Anrede: ");
					anrede = clavier.next();
					System.out.println("Geben Sie bitte  den Vornamen: ");
					vorname = clavier.next();
					System.out.println("Geben Sie bitte  den Nachnamen: ");
					nachname = clavier.next();
					System.out.println("Geben Sie bitte  die Straße: ");
					straße = clavier.next();
					System.out.println("Geben Sie bitte  die Hausnummer: ");
					hausnummer = clavier.next();
					System.out.println("Geben Sie bitte  die Plz: ");
					plz = clavier.next();
					System.out.println("Geben Sie bitte  den Ort: ");
					ort = clavier.next();
					adresseEintragen(addressbuch, anrede,  vorname,  nachname, straße,  hausnummer, plz, ort);
					break;
				}
				case 2 :{
					System.out.println("2: Bestehende Adresse bearbeiten");
					ausgabe(addressbuch);
					System.out.println("wählen Sie bitte eine Adresse: ");
					index = clavier.nextInt();
					System.out.println("Geben Sie bitte  die Anrede: ");
					anrede = clavier.next();
					System.out.println("Geben Sie bitte  den Vornamen: ");
					vorname = clavier.next();
					System.out.println("Geben Sie bitte  den Nachnamen: ");
					nachname = clavier.next();
					System.out.println("Geben Sie bitte  die Straße: ");
					straße = clavier.next();
					System.out.println("Geben Sie bitte  die Hausnummer: ");
					hausnummer = clavier.next();
					System.out.println("Geben Sie bitte  die Plz: ");
					plz = clavier.next();
					System.out.println("Geben Sie bitte  den Ort: ");
					ort = clavier.next();
					adresseBearbeiten(addressbuch, index, anrede,vorname,  nachname,straße,  hausnummer,  plz, ort);
					
					break;
				}
				case 3 :{
					System.out.println("3: Adressbuch ausgeben");
					ausgabe(addressbuch);
					
					break;
				}
				case 4 :{
					System.out.println("4: Bestehenden Adresse löschen");
					System.out.println("Welche Adresse möchten Sie löscchen (1-"+count+")");
					index = clavier.nextInt();
					adresseLoeschen(addressbuch, index);
					
					break;
				}
				case 5 :{
					System.out.println("Tschüßßßßß!!! ");
					break;
				}
				default:{
					System.out.println("Geben Sie bitte  eine Zahl zwischen 1 und 4 ein");
				}
			
			}
			
		}while(antwort != 4);
		
		
		
	}
	
	public static void ausgabe(String [][] adressbuch) {
		
		for(int i=0; i< count ; i++) {
			System.out.println("Adresse "+(i+1)+": ");
			System.out.print(adressbuch[i][0]+" "+adressbuch[i][1]+" "+adressbuch[i][2]+"\n"
							+adressbuch[i][3]+" "+adressbuch[i][4]+"\n"
							+adressbuch[i][5]+" "+adressbuch[i][6]+"\n");
			
		}
	}
	
	public static void menu() {
		System.out.println("**********************************************");
		System.out.println("1: Neue Adresse eintragen");
		System.out.println("2: Bestehende Adresse bearbeiten");
		System.out.println("3: Adressbuch ausgeben");
		System.out.println("4: Bestehenden Adresse löschen");
		System.out.println("5: Programm beenden");
		System.out.println("***********************************************");
		System.out.println("Geben Sie bitte eine Zahl zwichen 1 und 5 ein: ");
		
	}
	
	public static void adresseEintragen(String [][] addressbuch, String anrede, String vorname,  String nachname, String straße, String hausnummer, String plz, String ort) {
		addressbuch[count][0]=anrede;
		addressbuch[count][1]=vorname;
		addressbuch[count][2]=nachname;
		addressbuch[count][3]=straße;
		addressbuch[count][4]=hausnummer;
		addressbuch[count][5]=plz;
		addressbuch[count][6]=ort;
		count++;
		
	}
	
	public static void adresseBearbeiten(String [][] addressbuch, int index, String anrede, String vorname,  String nachname, String straße, String hausnummer, String plz, String ort) {
		if(index>0 && index < count) {
			addressbuch[index-1][0]=anrede;
			addressbuch[index-1][1]=vorname;
			addressbuch[index-1][2]=nachname;
			addressbuch[index-1][3]=straße;
			addressbuch[index-1][4]=hausnummer;
			addressbuch[index-1][5]=plz;
			addressbuch[index-1][6]=ort;
		}else {
			System.out.println("Geben Sie bitte  eine Zahl zwischen 0 und "+(count-1));
		}
		
	}
	
	public static void adresseLoeschen(String [][] addressbuch, int index) {
		if((count > 0) && (index <= count)){
			addressbuch[index-1][0]=null;
			addressbuch[index-1][1]=null;
			addressbuch[index-1][2]=null;
			addressbuch[index-1][3]=null;
			addressbuch[index-1][4]=null;
			addressbuch[index-1][5]=null;
			addressbuch[index-1][6]=null;
		}
	}
	
	
	
	

}
