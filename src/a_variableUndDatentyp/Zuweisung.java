package a_variableUndDatentyp;

/*
 Gegeben seien folgende Variablendeklarationen in Java:
long a = 3;
int b = 4;
short c = 5;
byte d = 6;
Welche der folgenden Zuweisungen sind in Java erlaubt?
a = b + 3 * (d + 1);
b = c * c;
c = b / 3;
d = (byte)a + b;
d = (byte) ( a + b);
 */
public class Zuweisung {

	public static void main(String[] args) {
		long a = 3;
		int b = 4;
		short c = 5;
		byte d = 6;
		a = b + 3 * (d + 1); //implizite
		b =(int)( c * c); //implizite -> b = c * c;
		c =(short) ( b / 3); //explizites Casting
		d = (byte)((byte)a + b);
		
		d = (byte) ( a + b);

	}

}
