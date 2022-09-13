package Exer01_POO;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
 *    esta classe, em seguida crie um objeto cliente, defina as instancias deste
 *    objeto e apresente as informações deste objeto no console.
 */
public class Cliente {
	private String nome;
	private int idade;
	private String cel;
	private String endereco;
	private String cidade;
	private String email;

	public Cliente(String nome, int idade, String cel, String endereco, String cidade, String email) {

		this.nome = nome;
		this.idade = idade;
		this.cel = cel;
		this.endereco = endereco;
		this.cidade = cidade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void imprimeInfo() {
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Cel: " + cel);
		System.out.println("Endereço: " + endereco + " | cidade: " + cidade);
		System.out.println("Email: " + email + "\n");
	}
}
