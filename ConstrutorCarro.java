package Construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {

		Carro ferrari1 = new Carro("FLE-9248", 123456789);
		Carro ferrari2 = new Carro("ELU-1360", 924696783);
		Carro ferrari3 = new Carro("ACU-4091", 623928373);

		System.out.println(ferrari1.getPlaca());
		System.out.println(ferrari1.getNumChassi());
		
		System.out.println("---------------------");
		
		System.out.println(ferrari2.getPlaca());
		System.out.println(ferrari2.getNumChassi());
		
		System.out.println("---------------------");
		
		System.out.println(ferrari3.getPlaca());
		System.out.println(ferrari3.getNumChassi());

	}
}
