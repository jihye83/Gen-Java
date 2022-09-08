package Lista2_LacoDeDecisao;

import java.util.Scanner;

public class Exer02 {
	/*
	 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
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

		if (n1 <= n2 && n1 <= n3) {
			if (n2 <= n3) {
				System.out.println(n1 + " " + n2 + " " + n3);
			} else {
				System.out.println(n1 + " " + n3 + " " + n2);
			}
		} else if (n2 <= n1 && n2 <= n3) {
			if (n1 <= n3) {
				System.out.println(n2 + " " + n1 + " " + n3);
			} else {
				System.out.println(n2 + " " + n3 + " " + n1);
			}
		} else if (n3 <= n1 && n3 <= n2) {
			if (n1 <= n2) {
				System.out.println(n3 + " " + n1 + " " + n2);
			} else {
				System.out.println(n3 + " " + n2 + " " + n1);
			}
		}

	}

}
