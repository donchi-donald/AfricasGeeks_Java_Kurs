package a_variableUndDatentyp;

/*
Erstellen Sie folgende Java-Applikation (Name "Calc"):
	*Deklarieren Sie in der main() Routine Variablen mit unterschiedlichen Datentypen (z.B. int, long, short, float).
	*Initialisieren Sie die Variablen mit geeigneten Werten.
	*
F¸hren Sie mit den Variablen folgende arithmetischen Operationen aus:
 ->Addition einer Konstanten zu einer int-Variablen,
 ->Multiplikation einer int-Variablen mit einer Konstanten,
 ->Subtraktion zweier Variablen unterschiedlichen Datentyps (int, short),
 ->Division einer int-Variablen durch eine Konstante,
 ->Multiplikation zweier Variablen (davon eine vom Typ "float").
 
 Geben Sie die Variablenwerte jeweils aus.
 
 Zu beantworten:
Wie groﬂ sind die Wertebereiche der einzelnen Typen?
Was geschieht wenn man zwei Ganzzahlen (int) dividiert und das Ergebnis ist keine ganze Zahl?
Was geschieht wenn Sie einen ‹berlauf in einem Wertebereich einer Variablen provozieren?
 
 
 */
public class ZuweisungUndTypen {

	public static void main(String[] args) {
		
		 final int ANZAHL=10;
	        int a;
	        long b;
	        short c;
	        float d;
	        a=1;
	        b=2;
	        c=3;
	        d=4.0f;
	        a=a+ANZAHL;//a=11
	        System.out.println(a);
	        a=a*ANZAHL;
	        System.out.println(a);
	        b=a-c;
	        System.out.println(b);
	        a=a/ANZAHL;
	        System.out.println(a);
	        b=(long)(b*c);
	        System.out.println(b);
		

	}

}
