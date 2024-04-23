package atividadeLacosdeRepeticoes;

import java.util.Scanner;

public class LacoFor02 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado
//		, onde o primeiro número deve ser menor do que o segundo número. 
//		Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
//		No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5

		Scanner leia = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Digite o primeiro número do intervalo ");
		numero1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo ");
		numero2 = leia.nextInt();

		//no loop , ele está percorrendo todos os números do intevalo
		//enquanto o numero1 for menor que o numero2
		
		for (; numero1 < numero2; numero1++) { // esse ; está separando os parametros , já que a primeira variavel eu não vou precisar eu deixei ela vazia

			if (numero1 < numero2) { // validei se o numero 1 é menor que o numero 2

				if (numero1 % 3 == 0 && numero1 % 5 == 0) { // validei se o numero 1 é multiplo de 3 e 5

					System.out.println("o número " + numero1 + " é " + " multiplo de 3 e 5\n");//printei na tela

				}
			}
		}

		if (numero1 > numero2) {// sai do loop quando o numero 1 for maior que o numero 2
			System.out.println(" intervalo inválido");
		}

	}

}
