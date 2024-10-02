package Construtor;

public class ConstrutorRobo {

	public static void main(String[] args) {
		
		Robo robo1 = new Robo("Isabella", 3, 4, "Bomba");
		Robo robo2 = new Robo("Gabriel", 3, 4, "Bomba");
		Robo robo3 = new Robo("Maria", 3, 4, "Bomba");
		
		
		System.out.println(robo1.getNome());
		System.out.println(robo1.getComplexidadeMovimento());
		System.out.println(robo1.getVelocidadeExecucao());
		System.out.println(robo1.getDanca());
		System.out.println(robo2.getNome());
		System.out.println(robo2.getComplexidadeMovimento());
		System.out.println(robo2.getVelocidadeExecucao());
		System.out.println(robo2.getDanca());
		System.out.println(robo3.getNome());
		System.out.println(robo3.getComplexidadeMovimento());
		System.out.println(robo3.getVelocidadeExecucao());
		System.out.println(robo3.getDanca());
	}
}


