package c_methoden;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		char antwort = 'N';
		
		Scanner clavier = new Scanner(System.in);
		do {
			System.out.println("Voulez vous continuez?(O/N)");
			 antwort = clavier.next().charAt(0);
		}while(antwort == 'O');
		

	}

}
