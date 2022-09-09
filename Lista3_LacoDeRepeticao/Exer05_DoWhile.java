package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer05_DoWhile {
	/*
	 * 5- Crie um programa que leia um número do teclado até que encontre um número
	 * igual a zero. No final, mostre a soma dos números digitados.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, soma = 0, num;

		System.out.println("\nDigite o número: ");
		num = sc.nextInt();

		do {
			if (num > 0) {
				soma += num;
			}

			System.out.println("\nDigite o número: ");
			num = sc.nextInt();
		} while (num != 0);

		System.out.println("\nA soma dos números é " + soma);
	}

}
