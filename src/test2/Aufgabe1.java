package test2;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		String name = "";
		System.out.println("Entrez votre nom: ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		for(int i=0; i<name.length(); i++) {
			char a = name.charAt(i);
			int b = (int)a;
			System.out.println(a+ " : "+ b);
		}
		
	}

}
