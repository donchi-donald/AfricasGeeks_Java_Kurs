package c_methoden;

import java.util.Scanner;

public class Methode1_4 {
	

	
	public static void testGerade() {
		Scanner clavier = new Scanner(System.in);
		  char antwort = 'N';
		  
		  do {
			  
			  System.out.println("Entrez un nombre:");
			  int x = clavier.nextInt();
			  
			  if(x%2==0) {
				  System.out.println("Le nbre est pair");
			  }else {
				  System.out.println("Le nbre est impair");
			  }
			  
			  System.out.println("Voulez vous continuez?(O/N)");
			  antwort = clavier.next().charAt(0);
			  
		  }while(antwort == 'O');
		  System.out.println("Tshüß");
	}
	
	/*
	 * Modifier *(Rückgabetyp | void ) Methodename ( Parameter){
	 * 		//le corp de la methode
	 * 
	 * }
	 * 1) Methode sans parametre et sans rückabewert
	 *  
	 * 2)  Methode avec parametre et sans rückabewert
	 * 
	 * 3) Methode avec parametre et avec rückabewert
	 * 
	 * 4) Methode sans parametre et avec rückabewert
	 */
	public static void main(String[] args) {
		hello();
		//bonjour();
		//testGerade();
		//methode2(15, 19);
		
		//int a = add(5, 9);
		//System.out.println("5+9="+a);
		
		//double mathrandom = mathRandom();
		//for(int i=0; i<100; i++) {
		//	System.out.print((int)mathRandom()+"\t");
		//}
		
		Methode1_4 methode = new Methode1_4();
		methode.methode6();
		
		
		
	
		
	}
	
	//1 Methode sans parametre et sans rückabewert
	public static void hello() {
		System.out.println("Hello Illona");
		bonjour();
	}
	
	public static void bonjour() {
		System.out.println("Bonjour Donald!");
		hello();
	}
	
	
	
	//2- Methode avec parametre et sans rückabewert
	public static void methode2(int a, int b) {
		System.out.println("a: "+a+", b: "+b);
	}
	
	
	//3- Methode avec parametre et avec rückabewert
	public static int add(int a, int b) {
		return a+b;
	}
	
	//3- Methode avec parametre et avec rückabewert(überladen)
		public static int add(int a, int b, int c) {
			return a+b+c;
		}
	
	//4- Methode sans parametre et avec rückabewert
	public static double mathRandom() {
		return Math.random()*10;
	}
	
	public void methode6() {
		System.out.println("Illona versteht sehr schnell!!");
	}
	
	
	
	

}
