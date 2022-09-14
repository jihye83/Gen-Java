package Exer_POO_Heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Cheetos", 2, "auau", 2);
		Cavalo horse = new Cavalo("max", 10, "bluuu", 10);
		Preguica pre =new Preguica("Lady", 8, "bahhhhhh", 3);
		
		dog.imprimirInfoDog();
		dog.deveCorrerDog(12);
		dog.emitirSomDog("auauau");
		
		horse.imprimirInfoHorse();
		horse.deveCorrerHorse(45);
		horse.emitirSomHorse("bluu bluuu");
		
		pre.imprimirInfoPreguica();
		pre.deveSubirPreguica(20);
		pre.emitirSomPreguica("buhhhhhhh");
	}

}
