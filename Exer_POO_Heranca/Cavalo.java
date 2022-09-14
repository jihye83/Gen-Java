package Exer_POO_Heranca;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSomHorse() {
		System.out.println("O cavalo emite som de blu bluuu");
	}

	public void deveCorrerHorse() {
		System.out.println("O cavalo corre a 50km/h");
	}

	public void imprimirInfoHorse() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos");
	}

}
