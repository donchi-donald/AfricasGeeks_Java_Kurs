package laufzeit;

public class Laufzeit {

	
	public static void main(String[] args) {
		int n = 100;
		int a = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					a++;
				}
			}
		}
		System.out.println(a);
			
	}
}
