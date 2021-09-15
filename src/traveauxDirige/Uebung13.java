package traveauxDirige;

public class Uebung13 {

	public static void main(String[] args) {
		int x=1, y=2, z=3;
		System.out.println(++x);//aus: 2  , x=2
		System.out.println(x); //aus: 2,  x=2
		System.out.println(y++);//aus: 2  , y=3
		System.out.println(y); //aus: 3,  y=3
		System.out.println((++z) + (++z));//++z = (4) //z=4  ++z (5) //z=5 => aus: 9
		System.out.println(z); //aus: 5,  z=5
		System.out.println((y++)+ (++y) + (--x)+ (x++)+(++z) + (++z));
		//(3 y=4) + (5 y=5) + (1 x=1) + (2 x=2) + (6 z=6 ) + (7) 
		//3 + 5 + 1+ 2+ 6 + 8 = 25
		
		//I:16  J:19
	}

}
