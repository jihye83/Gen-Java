package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer03_While {
	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
	 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, idade, contMenor = 0, contMaior = 0;

		System.out.println("\nDigite a dua idade; ");
		idade = sc.nextInt();

		while (idade != 0) {
			if (idade < 21) {
				contMenor++;
			}
			if (idade > 50) {
				contMaior++;
			}
			System.out.println("\nDigite a dua idade; ");
			idade = sc.nextInt();
		}

		System.out.println("\nTotal de pessoas com idade menores de 21 anos foi de " + contMenor);
		System.out.println("\nTotal de psssoas com idade maiores de 50 anos foi de " + contMaior);
	}

}
