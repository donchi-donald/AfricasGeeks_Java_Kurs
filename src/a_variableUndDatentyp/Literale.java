package a_variableUndDatentyp;

/*
Warum �bersetzt das folgende Programm nicht?

package block2;
public class Literale {
    public static void main(String[] args) {
        long i1 = 4000000000;
        long i2 = 4000000000L;
        System.out.println(i1);
        System.out.println(i2);
    }
}
 */

public class Literale {

	public static void main(String[] args) {
		long i1 = 4000000000L;//Wenn ein Long-Wert gr��er als int-wert muss ein L dahinter stehen.
        long i2 = 4000000000L;
        System.out.println(i1);
        System.out.println(i2);

	}

}
