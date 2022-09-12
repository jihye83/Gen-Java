package Lista4_ArrayVetorMatriz;

import java.util.Scanner;

public class Exer01_vetor {
	/*
	 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números
	 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
	 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
	 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
	 * atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
	 * A, um em cada linha.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[6];
		int i, soma = 0;

		for (i = 0; i < 6; i++) {
			System.out.println("\nEntre com o numero: ");
			vetor[i] = sc.nextInt();
			soma = vetor[0] + vetor[1] + vetor[5];
			vetor[4] = 100;

		}
		System.out.println("\nCada valor do vetor: ");
		for (i = 0; i < 6; i++) {
			System.out.println("[" + i + "] = " + vetor[i]);
		}
		System.out.println("\nA soma das posicoes do vetores [0], [1] e [5] = " + soma);

	}
}
