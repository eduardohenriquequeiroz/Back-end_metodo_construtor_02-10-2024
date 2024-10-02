package Construtor;

public class Consulta {

	int data;
	String nomePcnt;
	String nomeDents;

	public Consulta(int data, String nomePcnt, String nomeDents) {
		this.data = data;
		this.nomePcnt = nomePcnt;
		this.nomeDents = nomeDents;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getNomePcnt() {
		return nomePcnt;
	}
	public void setNomePcnt(String nomePcnt) {
		this.nomePcnt = nomePcnt;
	}
	public String getNomeDents() {
		return nomeDents;
	}
	public void setnomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}
}
