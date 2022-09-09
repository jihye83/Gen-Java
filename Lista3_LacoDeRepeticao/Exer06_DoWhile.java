package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer06_DoWhile {
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, soma = 0, count = 0;
		double media = 0;

		do {
			System.out.println("\nDigite um numero: ");
			num = sc.nextInt();
			
			if (num == 0) {
				System.out.println("\nSair do Loop");
			} else {

				if (num % 3 == 0) {
					soma += num;
					count++;
				}
				System.out.println("\nDigite um numero: ");
				num = sc.nextInt();
			}
		} while (num != 0);

		if (count == 0) {
			System.out.println("\nNao podemos dividir por zero");
		} else {
			media = soma / count;
			System.out.printf("\nA media dos numeros somados é %.2f" + media);

		}
	}
}
