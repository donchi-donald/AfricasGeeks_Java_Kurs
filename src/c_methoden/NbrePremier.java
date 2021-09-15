package c_methoden;

import java.util.Scanner;

/**
 * 1- 
 * @author donchi-fofack
 *
 */
public class NbrePremier {

	public static void main(String[] args) {
		  Scanner clavier = new Scanner(System.in);
		  char antwort = 'N';
		  boolean isPrim = true;
		  
		  do {
			  
			  System.out.println("Entrez un nombre:");
			  int x = clavier.nextInt();
			  
			  if(x==1 || x==0) {
				  System.out.println("Le nbre n est pas premier");
			  }else {
				  
				  for(int i=4; i<x; i++) {
					  if(x%i ==0) {
						  isPrim = false;
						  System.out.println("Le nbre n est pas premier");
						  break;
					  }
				  }
				  if(isPrim==true) {
					  System.out.println("Le nbre  est premier");
				  }
				  
			  }
			  
			  
			  
			  System.out.println("Voulez vous continuez?(O/N)");
			  antwort = clavier.next().charAt(0);
			  
		  }while(antwort == 'O');

	}
}
