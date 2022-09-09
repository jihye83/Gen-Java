package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer01_for {
	/*
	 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
	 * obtemos resto = 5.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;

		for (i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
				System.out.println("numeros: " + i);
			}
		}
	}

}
