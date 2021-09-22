package test2;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		//1- Scanner: Abgefragte Anzahl ist die Länge der Arrays.
		System.out.println("Geben Sie bitte ein n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		//2-Meine Empfehlung: eine Methode zu nutzen
		int fib[] = fibbonacci(n);
		
		//3- 0, 1, 1, 2, 3, 5, 8, 13, ...
		for(int i=0; i<n; i++) {
			if(i==n-1) {
				System.out.print(fib[i]);
				continue;
			}
			System.out.print(fib[i]+", ");
		}
		System.out.println();
		System.out.println("Fibbonacci REcursive von "+n+" :"+fibbR(n));
		System.out.println("Fibbonacci Dynamische von "+n+" :"+fibbDynamique(n));

	}
	
	public static int[] fibbonacci(int n) {
		int fib[] = new int[n];
		if(n == 1) {
			fib[0] = 0;
			return fib;
		}else if(n==2) {
			fib[0] = 0;
			fib[1] = 1;
			return fib;
		}else {
			fib[0] = 0;
			fib[1] = 1;
			for(int i=2; i<n; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			return fib;
			
		}
	}
	
	public static int fibbR(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			return fibbR(n-1) + fibbR(n-2);
		}
	}
	
	public static int fibbDynamique(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			int fibb1 = 0;
			int fibb2 = 1;
			for(int i=2; i<n; i++) {
				int fibb3 = fibb1 + fibb2;
				fibb1 = fibb2;
				fibb2 = fibb3;
			}
			return fibb2;
		}
	}
	
	

}
