package traveauxDirige;

public class Uebung19 {

	public static void main(String[] args) {
		for(int i = 1; i<=3; i++) {
			for(int j=i; j<i+3; j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	
	//i=1 -> j=1   j=2  j=3
	
	
	
	
	
//output: 	1   2	3
//			2   3   4
//			3   4   5
	
	// 1  2  3
	// 2  3  4
	// 3  4  5

}
