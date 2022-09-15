package Exer_POO_Heranca;

public class AnimalTest {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Cheetos", 2);
		Cavalo horse = new Cavalo("max", 10);
		Preguica pre = new Preguica("Lady", 8);

		Animal animal = null;

		int n = (int) (Math.random() * 3.0);
		System.out.println("\nO numero escolhido foi: " + n);

		switch (n) {
		case 0:
			animal = dog;
			dog.imprimirInfoDog();
			animal.emitirSom("");;
			break;
		case 1:
			animal = horse;
			horse.imprimirInfoHorse();
			animal.emitirSom("");
			break;
		case 2:
			animal = pre;
			pre.imprimirInfoPreguica();
			animal.emitirSom("");
			break;
		default:
			System.out.println("Opcao Invalida");
		}
		
	}

}
