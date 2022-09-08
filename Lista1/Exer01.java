package Lista1;

import java.util.Scanner;

public class Exer01 {
	/*
	 * 1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e
	 * dias e mostre-a expressa apenas em dias.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int anos, mes, dia, total;

		System.out.println("digite a sua idade: ");
		anos = leia.nextInt();
		System.out.println("digite o mes de hoje: ");
		mes = leia.nextInt();
		System.out.println("digite o dia de hoje: ");
		dia = leia.nextInt();

		anos = anos * 365;
		mes = mes * 30;
		total = anos + mes + dia;
		
		System.out.println("total de dias vividos é de " + total);

	}

}
