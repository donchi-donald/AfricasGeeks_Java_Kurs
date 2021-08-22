package b_kontrollstrukturen.schleifen;

public class Schleife {

	public static void main(String[] args) {
		int arrayEins[] = new int [6];
		//Typ []variablename = new Typ[größe]
		arrayEins[1] = 2;
		arrayEins[3] = 18;
		arrayEins[0] = 22;
		arrayEins[2] = 21;
		arrayEins[4] = 7;
		arrayEins[5] = 8;
		int laenge = arrayEins.length;
		
		System.out.println("for: ");
		//for
		//i ->0 ... 5 
		for(int i=0; i<laenge; i++) {
			System.out.println(arrayEins[i]);
		}
		/*
		System.out.println(arrayEins[0]);
		System.out.println(arrayEins[1]);
		System.out.println(arrayEins[2]);
		System.out.println(arrayEins[3]);
		System.out.println(arrayEins[4]);
		System.out.println(arrayEins[5]);*/
		
		
		System.out.println("while: ");
		//while
		int count =0;
		while(count < laenge) {
			System.out.println(arrayEins[count]);
			count++;//Achtung auf Endlosschleife
		}
		
		
		System.out.println("do-while: ");
		//do-while
		int count1 =0;
		
		do {
			System.out.println(arrayEins[count1]);
			count1++;//Achtung auf Endlosschleife
		}while(count1<laenge);
		
		
	}

}
