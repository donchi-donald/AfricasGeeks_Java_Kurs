package test2;

public class Aufgabe6 {

	public static void main(String[] args) {
		

	}
	
	public static int summeIt(int n) {
		int summe = 0;
		for(int i=1; i<=n; i++) {
			summe += i;
		}
		return summe;
	}
	
	public static int summeR(int n) {
		if(n==0) {
			return 0;
		}else {
			return n+summeR(n-1);
		}
	}

}
