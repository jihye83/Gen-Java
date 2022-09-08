package Lista2_LacoDeDecisao;

import java.util.Scanner;

public class Exer04 {
	/*
	 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se
	 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
	 * se for ímpar exiba o número elevado ao quadrado.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		double  raiz, pot;
		System.out.println("Digite um numero: ");
		n = ler.nextInt();

		if (n % 2 == 0) {
			raiz = Math.sqrt(n);
			System.out.println("Numero Par; a raiz quadrada do numero é " + raiz);
		} else {
			pot = Math.pow(n, 2);
			System.out.println("Numero impar; a potencia quadrada do numero é " + pot);
		}
	}

}
