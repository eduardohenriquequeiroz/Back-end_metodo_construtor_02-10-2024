package Construtor;

public class ConstrutorConsulta {

	public static void main(String[] args) {

		Consulta consulta1 = new Consulta(19, "João", "Fernando");
		Consulta consulta2 = new Consulta(21, "Fabrício", "José");
		Consulta consulta3 = new Consulta(02, "Carlos", "Matheus");

		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnt());
		System.out.println(consulta1.getNomeDents());

		System.out.println("---------------------");

		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomePcnt());
		System.out.println(consulta2.getNomeDents());

		System.out.println("---------------------");

		System.out.println(consulta3.getData());
		System.out.println(consulta3.getNomePcnt());
		System.out.println(consulta3.getNomeDents());
	}
}
