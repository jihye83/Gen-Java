package Lista3_LacoDeRepeticao;

import java.util.Scanner;

public class Exer04_While {
	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
	 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
	 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
	 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
	 * 150 pessoas, calcule e mostre: (WHILE)  o número de pessoas calmas;  o
	 * número de mulheres nervosas;  o número de homens agressivos;  o número de
	 * outros calmos;  o número de pessoas nervosas com mais de 40 anos;  o número
	 * de pessoas calmas com menos de 18 anos.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade, count = 0, op1, op2, pc = 0, mn = 0, ha = 0, oc = 0, nM = 0, cM = 0;

		while (count < 150) {
			System.out.println("\nDigite a sua idade: ");
			idade = sc.nextInt();
			System.out.println("\n(1) - feminino \n(2) - Masculino \n(3) - Outros");
			op1 = sc.nextInt();
			System.out.println("\n(1) - Calma \n(2) - Nervosa \n(3) - Agressiva");
			op2 = sc.nextInt();

			if (op1 == 1) {
				pc++;
			}
			if (op1 == 1 && op2 == 2) {
				mn++;
			}
			if (op1 == 2 && op2 == 3) {
				ha++;
			}
			if (op1 == 3 && op2 == 1) {
				oc++;
			}
			if (op2 == 2 && idade > 40) {
				nM++;
			}
			if (op2 == 1 && idade < 18) {
				cM++;
			}
			count++;
		}

		System.out.println("\nNumeros de pessoas calmas: " + pc);
		System.out.println("\nNúmero de mulheres nervosas: " + mn);
		System.out.println("\nNúmero de homens agressivos: " + ha);
		System.out.println("\nNúmero de outros calmos: " + oc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: " + nM);
		System.out.println("\nnúmero de pessoas calmas com menos de 18 anos: " + cM);

	}
}
