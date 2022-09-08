package Lista2_LacoDeDecisao;

import java.util.Scanner;

public class Exer01 {
	/*
	 * Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextInt();

		if ((n1 >= n2) && (n1 >= n3)) {
			System.out.println("o primeiro numero é maior. " + n1);
		} else if ((n2 >= n1) && (n2 >= n3)) {
			System.out.println("o segundo numero é maior. " + n2);
		} else {
			System.out.println("o terceiro numero é maior." + n3);
		}
	}

}
