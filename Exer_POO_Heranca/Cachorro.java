package Exer_POO_Heranca;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom(String frase) {
		System.out.println("Cachorro: Au AUUUUUUU");
	}

	public void deveCorrerDog() {
		System.out.println("O cachorro corre 20 km/h");
	}

	public void imprimirInfoDog() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos");
	}
}
