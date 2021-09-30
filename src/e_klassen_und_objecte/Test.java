package e_klassen_und_objecte;

public class Test {

	public static void main(String[] args) {
		Person donald = new Person("Donchi Donald", "M", 29);
		donald.setNom("Loic");
		System.out.println(donald.getNom());

	}
	/*
	public void ausgabe(String [][] adressbuch) {
		if(counter==0) {
			//Adresse ist leer
		}else {
			for(int i=0; i<counter; i++) {
				System.out.println("Adresse "+(i+1)+": ");
				for(int j=0; j<adressbuch[i].length; j++) {
					System.out.print(adressbuch[i][j]+"\t");
				}
				System.out.println("");
			}
		}
	}*/

}
