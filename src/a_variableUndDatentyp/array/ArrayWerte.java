package a_variableUndDatentyp.array;

public class ArrayWerte {

	public static void main(String[] args) {
		int arrayEins[] = new int [5];
		//Typ []variablename = new Typ[größe]
		
		int a[] = {1,2,5,8,9};//a est un array de 5 elements
		String output = "Größe der Arrays: "+a.length;
		String ersteElement = "Erstes Element: "+a[0];
		String letztesElement = "Letztes Element: "+a[4];
		
		System.out.println(output);
		System.out.println(ersteElement);
		System.out.println(letztesElement);

	}

}
