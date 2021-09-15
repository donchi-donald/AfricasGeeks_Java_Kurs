package e_klassen_und_objecte;

public class Person {
	private String nom;
	private String sexe;
	private int age;
	
	public Person(String nom, String sexe, int age) {
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.test();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void test() {
		System.out.println("Hallo");
	}
	
	

}
