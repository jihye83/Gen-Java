package Exer_POO_Heranca;

public class Cachorro extends Animal {

	private int velocidade;

	public Cachorro(String nome, int idade, String som, int velocidade) {
		super(nome, idade, som);
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void emitirSomDog(String som1) {

		System.out.println("Emite som: " + som1);
	}

	public void deveCorrerDog(int corre) {
		velocidade += corre;
		System.out.println("\nNova velocidade: " + velocidade + " km/h");
	}

	public void imprimirInfoDog() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade() + " anos"
				+ "\nEmite som: " + getSom() + "\nVelocidade atual: " + velocidade + "km/h");
	}
}
