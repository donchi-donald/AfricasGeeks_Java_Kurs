package j_ausnahme_exceptions;

import java.util.Scanner;

public class ErrorCreate {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quelle age as tu?");
		int age = clavier.nextInt();
		
		try {
			if(age < 18) {
				throw new IllegalArgumentException("Tu es mineur");
			}else {
				System.out.println("youpi youpi");
			}
		}catch(Exception e) {
			
		}
		
		
		System.out.println("video privee");

	}

}
