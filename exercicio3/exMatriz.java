package exercicio3;

import java.util.Scanner;

public class exMatriz {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int [][] numeros = new int[3][3];
	
		int [] elementosP = new int[3];
		int [] elementosS = new int[3];
		
		int somaTotalP = 0, somaTotalS = 0;
		
		
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				System.out.println("\nDigite os numeros: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		
		
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				System.out.println(numeros[linha][coluna]);
				
			}
		}
		
		
		System.out.println("Elementos da Diagonal Principal: ");

		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				// LINHA == COLUNA
				if (linha == coluna) {
					elementosP [linha] = numeros[linha][coluna];
					somaTotalP += numeros[linha][coluna];
				}
				
			}
		
			System.out.println(elementosP[linha]);

		}
		
		System.out.println("Soma de todos os elementos da Diagonal Principal: "+somaTotalP);
				
		
		System.out.println("\nElementos da diagonal secundária: ");
		
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				if (linha + coluna == numeros.length - 1) {
					elementosS [linha] = numeros[linha][coluna];
					somaTotalS += numeros[linha][coluna];
				}
				
			}
		
			System.out.println(elementosS[linha]);

		}
		System.out.println("Soma de todos os elementos da Diagonal Secundária: "+somaTotalS);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
