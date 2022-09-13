package Exer03_POO;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto = new Produto(2, "impressora HP", 203.00, "modelo Hp 2000");
		produto.imprimeInfo();
		Produto produto1 = new Produto(30, "Galazy S", 3203.00, "modelo Samsung");
		produto1.imprimeInfo();
		
		System.out.println("*********TROCANDO VALOR DO PRODUTO 1*********");
		produto1.setPreco(2569.99);
		produto1.imprimeInfo();
	}

}
