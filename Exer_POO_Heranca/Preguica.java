package Exer_POO_Heranca;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSomPreguica() {
		System.out.println("O bicho preguiça emite som de buhhhhhhh");
	}

	public void deveSubirPreguica() {
		System.out.println("O bicho preguiça sobe nas arvores a 2 passos em 2 minutos");
	}

	public void imprimirInfoPreguica() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos");
	}
}
