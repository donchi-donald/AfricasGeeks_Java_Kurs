package c_methoden;

import java.util.Scanner;

public class Test {
	
	
  public static void main(String[] args) {
	
	  
	  Scanner clavier = new Scanner(System.in);
	  char antwort = 'N';
	  
	  do {
		  
		  System.out.println("Entrez un nombre:");
		  int x = clavier.nextInt();
		  
		  if(x<0) {
			  System.out.println("le nombre: "+x+" est negatif.");
		  }else if(x>0) {
			  System.out.println("le nombre: "+x+" est positif.");
		  }else {
			  System.out.println("le nombre: "+x+" est neutre.");
		  }
		  
		  System.out.println("Voulez vous continuez?(O/N)");
		  antwort = clavier.next().charAt(0);
		  
	  }while(antwort == 'O');
	  
	 
		
  }
  
}
