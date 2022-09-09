package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer02_for {
	/*
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, num, contPar = 0, contImpar = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("\nDigite o Numero: ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}

		System.out.println("\nContagem dos numeros Pares: " + contPar);
		System.out.println("\nContagem dos numeros Impares: " + contImpar);
	}

}
