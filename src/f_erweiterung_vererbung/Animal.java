package f_erweiterung_vererbung;

public class Animal {
	static int count;
	public String nom;
	public String categorie;
	public int age;
	
	public Animal(String nom, String categorie, int age) {
		this.nom = nom;
		this.categorie=categorie;
		this.age = age;
	}
	
	public void bewegtDich() {
		System.out.println("Ich bewege mich bei Animal");
	}
	
	@Override
	public String toString() {
		
		return "Votre Nom: "+this.nom+"\nVotre Categories: "+this.categorie+"\nVotre age: "+this.age+"\n";
	}
	
	

}
