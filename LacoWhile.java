package atividadeLacosdeRepeticoes;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
//		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
//		via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o
//		total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

		
		
		 Scanner leia = new Scanner(System.in);
		 
		
		 int pessoas21=0;
		 int pessoas50=0;
		 
	        System.out.println("Digite as idades das pessoas ");
	        int idade = leia.nextInt();

		 while(idade >=0) {
			 
			 if(idade<21 && idade >0) {
				 pessoas21++; 
				 
			 }else if(idade>50) {
				 pessoas50++;
			 }

			
			idade = leia.nextInt(); 
			
		 }
		 
		  System.out.println("Total de pessoas com idade menor que 21 anos: " + pessoas21);
	        System.out.println("Total de pessoas com idade maior que 50 anos: " + pessoas50);
	        
		 leia.nextLine();
	}

}
