package Exer_POO_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer_Collections {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;

		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println("\n----------Menu de opções do Estoque------------");
			System.out.println("| (1) Deseja adicionar produtos?              |");
			System.out.println("| (2) Deseja remover produtos?                |");
			System.out.println("| (3) Deseja atualizar produtos?              |");
			System.out.println("| (4) Deseja mostrar todos os produtos?       |");
			System.out.println("| (0) Deseja sair?                            |");
			System.out.println("-----------------------------------------------");
			System.out.println("Por favor, digite a sua opção: ");
			op = sc.nextInt();

			if (op == 1) {
				sc.nextLine();// limpando o cash
				System.out.println("Digite o produto para adicionar no estoque: ");
				String produto = sc.nextLine();
				estoque.add(produto);
			} else if (op == 2) {
				sc.nextLine();// limpando o cash
				System.out.println("Digite o produto para remover no estoque: ");
				String produto1 = sc.nextLine();
				if (estoque.contains(produto1)) {
					estoque.remove(produto1);
				} else {
					System.out.println("\nProduto nao existe no estoque.");
				}
				System.out.println(estoque);
			} else if (op == 3) {
				sc.nextLine();// limpando o cash
				System.out.println("Digite o produto que quer atualizar no estoque: ");
				String verifica = sc.nextLine();
				System.out.println("\nDigite o nome do produto que entrara no lugar do" + verifica);
				String novo = sc.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto não existe no estoque.");
				}
				System.out.println(estoque);
			} else if (op == 4) {
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
			} else if (op == 0) {
				System.out.println("\nSair do sistema");
			} else {
				System.out.println("\nOpção invalida!!!");
			}

		} while (op != 0);
	}

}
