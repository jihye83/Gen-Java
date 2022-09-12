package Lista4_ArrayVetorMatriz;

import java.util.Scanner;

public class Exer04_matriz {
	/*
	 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
	 * ao usuário um menu de opções: (1) somar as duas matrizes (2) subtrair a
	 * primeira matriz da segunda (3) adicionar uma constante as duas matrizes (4)
	 * imprimir as matrizes Nas duas primeiras opções uma terceira matriz 2 x 2 deve
	 * ser criada. Na terceira opção o valor da constante deve ser lido e o
	 * resultado da adição da constante deve ser armazenado na própria matriz.
	 */
	public static float[][] imprime(float[][] matrizC) {
		float m[][] = matrizC;
		int i, j;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(m[i][j] + " ");
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[][] matrizA = new float[2][2];
		float[][] matrizB = new float[2][2];
		float[][] matrizC = new float[2][2];
		int i, j, op;

		System.out.println("\nMatrizA:");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Entre com o numero: ");
				matrizA[i][j] = sc.nextFloat();
			}
		}
		System.out.println("\nMatrizB:");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Entre com o numero: ");
				matrizB[i][j] = sc.nextFloat();
			}
		}
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		op = sc.nextInt();

		switch (op) {
		case 1:
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
			System.out.println("\n");
			imprime(matrizC);
			break;

		case 2:
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
				}
			}
			imprime(matrizC);
			break;

		case 3:
			float c;
			System.out.println("\nDigite um constante: ");
			c = sc.nextFloat();
			System.out.println("\nMatrizA com a constante: ");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					matrizC[i][j] = matrizA[i][j] + c;
				}
			}
			imprime(matrizC);
			System.out.println();
			System.out.println("\nMatrizB com a constante: ");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					matrizC[i][j] = matrizB[i][j] + c;
				}
			}
			imprime(matrizC);
			break;

		case 4:
			System.out.println("\nMatrizA: ");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.print(matrizA[i][j] + " ");
				}
			}
			System.out.println();
			System.out.println("\nMatrizB: ");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.print(matrizB[i][j] + " ");
				}
			}
			break;
			default:
				System.out.println("Opção Invalida!");
		}

	}
}