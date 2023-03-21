package exercicio3;

import java.util.Scanner;

public class exVetor {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int loc,x;
		
		Scanner read = new Scanner(System.in);
		
		for (x=0; x<10; x++);{
		System.out.println("Digite um número: ");
		numeros[x] = read.nextInt();
		}
		
		System.out.println("Digite o número que deseja saber a psoição: ");
		loc = read.nextInt();
		
		for(x=0; x<10; x++);{
			if(loc == numeros[x]) {
				System.out.println("O número "+loc+" está na posição: "+(x+1));
			}
		}
		
		
		
		
		
		
		
	}

}
