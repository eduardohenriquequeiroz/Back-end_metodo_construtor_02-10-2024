package Construtor;

public class ConstrutorAnimal {

	public static void main(String[] args) {

		Animal cachorro = new Animal(1.09f, "Branco");
		Animal coelho = new Animal(2.0f, "Branco");
		Animal gato = new Animal(1.0f, "Preto");

		System.out.println(cachorro.getTamanho());
		System.out.println(cachorro.getCor());
		
		System.out.println("---------------------");
		
		System.out.println(coelho.getTamanho());
		System.out.println(coelho.getCor());
		
		System.out.println("---------------------");

		System.out.println(gato.getTamanho());
		System.out.println(gato.getCor());
	}
}
