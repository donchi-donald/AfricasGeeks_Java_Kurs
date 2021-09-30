package test2;

import java.util.Scanner;

public class Bankkonto {
	private String vorname;
	private String nachname;
	private String iban;
	protected String nameDerBank;
	private double kontoStand;
	private double kreditlimit;
	private int pin;
	
	public Bankkonto(String vorname, String nachname, String iban, String nameDerBank, double kontoStand, double kreditlimit, int pin) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.iban = iban;
		this.nameDerBank = nameDerBank;
		this.kontoStand = kontoStand;
		this.kreditlimit = kreditlimit;
		this.pin = pin;
	}
	public void betragEinzahlen(double betrag) {
		this.kontoStand = this.kontoStand + betrag;	
	}
	
	public void betragAuszahlen(double betrag) {
		System.out.println(this.nachname+" Geben Sie bitte das Pin: ");
		Scanner sc = new Scanner(System.in);
		int pin2 = sc.nextInt();
		if(pin2 != this.pin) {
			System.out.println("pin ist falsch!!!");
		}else if(betrag > this.kreditlimit) {
			System.out.println("Sie können nicht mehr als "+this.kreditlimit+" auszahlen!!!!");
		}else if( betrag > this.kontoStand) {
			System.out.println("Sie haben nicht so viel Geld!!!");
		}else {
			this.kontoStand = this.kontoStand - betrag;
		}
		
	}
	
	public void kontostand() {
		System.out.println(this.nachname+" Geben Sie bitte das Pin: ");
		Scanner sc = new Scanner(System.in);
		int pin2 = sc.nextInt();
		if(pin2 != this.pin) {
			System.out.println("pin ist falsch!!!");
		}else {
			System.out.println("Der KontoStand von "+this.nachname+" ist: "+this.kontoStand);
		}
	}

}
