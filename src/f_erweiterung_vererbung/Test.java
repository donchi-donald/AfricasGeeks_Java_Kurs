package f_erweiterung_vererbung;

public class Test {

	public static void main(String[] args) {
		Chien chien = new Chien("Medor", "Berger allemand", 7);//speza
		chien.thisBewegtDich();
		chien.superBewegtDich();
		System.out.println(chien.toString());
		chien.gibtLaut();
		
		Animal chien2 = new Chien("Medor2", "Berger chinoir", 7);//gener
		System.out.println(chien2);
		

	}

}
