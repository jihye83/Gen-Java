package Exer03_POO;

/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
 *    referentes esta classe, em seguida crie um objeto produto eletrônico,
 *    defina as instancias deste objeto e apresente as informações deste objeto
 *    no console.
 */

public class Produto {
	private int codProduto;
	private String nome;
	private double preco;
	private String descricao;

	public Produto(int codProduto, String nome, double preco, String descricao) {
		this.codProduto = codProduto;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void imprimeInfo() {
		System.out.println("Codigo do produto: " + codProduto);
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Descrição: " + descricao);
		System.out.println();
	}
}
