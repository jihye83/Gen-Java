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

		System.out.println("\nDigite a sua idade; ");
		idade = sc.nextInt();
		// coloquei o while dentro do if. Porque nao queria q por qualquer motivo
		// ele imprimisse o a saida com total zerado. Entao se o usuario digita
		// na primeira -99 ele imprimi "saiu do loop".
		if (idade != -99) {
			while (idade != -99) {
				// nao queria que contasse a idade zero.
				if (idade > 0 && idade < 21) {
					contMenor++;
				}
				if (idade > 50) {
					contMaior++;
				}
				System.out.println("\nDigite a sua idade; ");
				idade = sc.nextInt();
			}

			System.out.println("\nTotal de pessoas com idade menores de 21 anos foi de " + contMenor);
			System.out.println("\nTotal de psssoas com idade maiores de 50 anos foi de " + contMaior);
		} else {
			System.out.println("\nSaiu do Loop!");
		}
	}

}
