package j_ausnahme_exceptions;

import java.util.Scanner;

public class ExceptionByMethode {

	public static void main(String[] args) throws ArithmeticException {
		
		ExceptionByMethode e = new ExceptionByMethode();
		System.out.println(e.divisionbynull(2, 0));
		System.out.println("hallo");
	}
	
	public static void test() throws IllegalArgumentException  {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quelle age as tu?");
		int age = clavier.nextInt();
		
		if(age < 18) {
			throw new IllegalArgumentException("Tu es mineur");
		}else {
			System.out.println("youpi youpi");
		}
		System.out.println("video privee");
	}
	
	public  int divisionbynull(int a, int b) throws ArithmeticException {
		return a/b;
	}

}
