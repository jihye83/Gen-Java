package Exer01_POO;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente= new Cliente("Ji hye koo", 39, "(11) 97244-8882", "Rua Brasil, 123", "São Paulo", "jihye@gmail.com");
		cliente.imprimeInfo();
		System.out.println("*******TROCA DE EMAIL*******");
		cliente.setEmail("jihye83@hotmail.com");
		cliente.imprimeInfo();
	}

}
