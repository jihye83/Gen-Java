package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer06_DoWhile {
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, media = 0, soma = 0, count = 0;

		do {
			System.out.println("\nDigite um numero: ");
			num = sc.nextInt();
			//esse if é para ele nao contar o zero.
			if (num != 0) {
				if (num % 3 == 0) {
					soma += num;
					count++;
				}
			}
		} while (num != 0);

		media = soma / count;
		System.out.println("\nA media dos numeros somados é " + media);
	}
}
