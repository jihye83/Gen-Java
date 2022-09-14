package Exer_POO_Heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Cheetos", 2);
		Cavalo horse = new Cavalo("max", 10);
		Preguica pre =new Preguica("Lady", 8);
		
		dog.imprimirInfoDog();
		dog.deveCorrerDog();
		dog.emitirSomDog();
		
		horse.imprimirInfoHorse();
		horse.deveCorrerHorse();
		horse.emitirSomHorse();
		
		pre.imprimirInfoPreguica();
		pre.deveSubirPreguica();
		pre.emitirSomPreguica();
	}

}
