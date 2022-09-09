package Lista1;

import java.util.Scanner;

public class Exer03 {
	/*
	 * 3. Faça um programa que leia o tempo de duração de um evento em uma fábrica
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int d, h, m, s;
		System.out.println("Digite os segundos trabalhos: ");
		d = ler.nextInt();

		h = d / 3600;
		m = (d % 3600) / 60;
		s = (d % 3600) % 60;

		System.out.println("A duração é: " + h + " hora " + m + " minutos " + s + " segundos");
	}

}
