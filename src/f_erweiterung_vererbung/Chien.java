package f_erweiterung_vererbung;

public class Chien extends Animal{
	
	

	public Chien(String nom, String categorie, int age) {
		super(nom, categorie, age);
		
	}
	
	public void thisBewegtDich() {
		this.bewegtDich();
	}
	
	public void superBewegtDich() {
		super.bewegtDich();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chien: \n"+super.toString();
	}
	@Override
	public void bewegtDich() {
		System.out.println("ich bewege mich bei chien");
	}
	
	public void gibtLaut() {
		System.out.println("WOuhwOuh");
	}
	
	//this und super
	//Generalierung und Spezialisierung

}
