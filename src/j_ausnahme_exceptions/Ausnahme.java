package j_ausnahme_exceptions;

public class Ausnahme {

	public static void main(String[] args) {
		
	
		int a = 7, b = 0, c = 18;
		int i[] = {1,2,3,4};
		System.out.println(a);
		try {
			
			i[12]=12;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println(c);

	}

}
