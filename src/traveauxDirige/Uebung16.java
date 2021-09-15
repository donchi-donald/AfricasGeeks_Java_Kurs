package traveauxDirige;

public class Uebung16 {

	public static void main(String[] args) {
		int i=20;
		
		while(i>0) {
			System.out.println(i);
			i -=2;
		}
		System.out.println("while -> for");
		
		for (int j=20; j>0; j=j-2) { //j
			System.out.println(j);
		}

	}

}
