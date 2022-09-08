package Lista1;

import java.util.Scanner;

public class Exer02 {
	/*
	 * 2. Faça um programa que leia a idade de uma pessoa expressa em dias e
	 * mostre-a expressa em anos, meses e dias (considere que: 1 ano = 365 dias / 1
	 * mês = 30 dias e 1 dia = 1 dia em todos os casos).
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num, ano, mes, dia;

		System.out.println("Digite os dias para saber em anos, mês e dias: ");
		num = leia.nextInt();

		ano = num / 365;
		mes = (num % 365) / 30;
		dia = (num % 365) % 30;

		System.out.println("Você tem " + ano + " anos " + mes + " mes(s) e " + dia + " dia(s)");
	}

}
