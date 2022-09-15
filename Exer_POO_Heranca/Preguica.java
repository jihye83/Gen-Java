package Exer_POO_Heranca;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom(String frase) {
		System.out.println("Preguica: Bahhhhhh");
	}

	public void deveSubirPreguica() {
		System.out.println("O bicho preguiça sobe nas arvores a 2 passos em 2 minutos");
	}

	public void imprimirInfoPreguica() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos");
	}
}
