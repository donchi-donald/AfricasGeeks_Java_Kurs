package test2;

public class Aufgabe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Illona"));

	}
	
	public static String reverse(String s) {
		String result ="";
		for(int i=s.length()-1; i>=0; i--) {
			result += s.charAt(i);
		}
		
		return result;
	}

}
