package atividadeLacosdeRepeticoes;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
//		// Escreva um algoritmo em Java, que leia números inteiros via teclado, 
//		até que o número zero seja digitado. Ao final, 
//		mostre na tela a soma de todos os números digitados, que sejam positivos.
		
		
		Scanner leia = new Scanner(System.in);
		int numero ;
		
	
		int soma = 0;
		
		
		 
		 do {
			 System.out.println("Digite números inteiros ");
			 numero = leia.nextInt();
			
			 if(numero > 0) {
				 soma+=numero; 
				 
			 } 
			 
		 }while( numero != 0);
		 
		
		 
		 System.out.println("a soma é "+ soma) ;
		 leia.nextLine();
		 

	}
	

}
