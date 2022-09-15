package Exer_POO_Heranca;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom(String frase) {
		if (getNome() != null) {
			System.out.println("Cavalo: Shiiiiiiiiii...");
		} else {
			System.out.println("animal sem nome.");
		}
	}

	public void deveCorrerHorse() {
		System.out.println("O cavalo corre a 50km/h");
	}

	public void imprimirInfoHorse() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos");
	}

}
