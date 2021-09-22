package test2;

public class Aufgabe5 {

	public static void main(String[] args) {
		System.out.println("Potenz: "+potenzRechnung(5.5, 3));

	}
	
	public static double potenzRechnung(double basis, int exp) {
		//10^2 = (10*10)
		double result = 1.0;
		for(int i=1; i<=exp; i++) {
			result *= basis;
		}
		return result;
	}

}
