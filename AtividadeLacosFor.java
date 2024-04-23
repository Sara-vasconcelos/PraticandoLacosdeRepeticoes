package atividadeLacosdeRepeticoes;

import java.util.Scanner;

public class AtividadeLacosFor {

	public static void main(String[] args) {
		// loop for
		
//		Escreva um algoritmo em Java, 
//		que leia 10 números inteiros via teclado 
//		e mostre na tela quantos números são pares e
//		quantos número são ímpares.
		
		
	
		 Scanner leia = new Scanner(System.in);
	        
	        int numerosPares = 0;
	        int numerosImpares = 0;
	        
	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 0; i < 10; i++) {
	            int numero = leia.nextInt();
	            
	            if (numero % 2 == 0) {
	                numerosPares++;
	            } else {
	                numerosImpares++;
	            }
	        }
	        
	        System.out.println("Quantidade de números pares: " + numerosPares);
	        System.out.println("Quantidade de números ímpares: " + numerosImpares);
	        
	        leia.close();
		
	


		

	}

}
