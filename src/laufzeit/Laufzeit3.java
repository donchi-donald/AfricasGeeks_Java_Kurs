package laufzeit;

public class Laufzeit3 {
	
	public static void main(String[] args) {
		
	}
	
	public static int test1(int n) {

		int a = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a++;
			}
			for(int k=0; k<n; k++) {
				a++;
			}
			for(int k=0; k<n; k++) {
				a++;
			}
			for(int k=0; k<n; k++) {
				a++;
			}
			for(int k=0; k<n; k++) {
				a++;
			}
		}
		
		return a;
	}
	
	public static int test2(int n) {
		int a = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					for(int l=0; l<n; l++) {
						a++;
					}
				}
			}
			for(int k=0; k<n; k++) {
				a++;
			}
			for(int k=0; k<n; k++) {
				a++;
			}
		}
		
		return a;
	}

}
