package Exer_POO_Heranca;

public class Preguica extends Animal{
	private int passos;

	public Preguica(String nome, int idade, String som, int passos) {
		super(nome, idade, som);
		this.passos = passos;
	}

	public int getPassos() {
		return passos;
	}

	public void setPassos(int passos) {
		this.passos = passos;
	}

	public void emitirSomPreguica(String som1) {

		System.out.println("Emite som: " + som1);
	}

	public void deveSubirPreguica(int subida) {
		passos += subida;
		System.out.println("\nNovo passos: " + passos + " km/h");
	}

	public void imprimirInfoPreguica() {
		System.out.println("\nNome do Animal: " + getNome() + "\nIdade do Animal: " + getIdade()+" anos" + "\nEmite som: "
				+ getSom() + "\nPasso atual: " + passos + "km/h");
	}
}
