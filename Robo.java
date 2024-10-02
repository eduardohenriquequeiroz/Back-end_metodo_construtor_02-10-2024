package Construtor;

public class Robo {

	private String nome;
	private int complexidadeMovimento;
	private int velocidadeExecucao;
	private String danca;

	public Robo (String nome, int complexidadeMovimento, int velocidadeExecucao, String danca) {
		this.nome = nome;
		this.complexidadeMovimento = complexidadeMovimento;
		this.velocidadeExecucao = velocidadeExecucao;
		this.danca = danca;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComplexidadeMovimento() {
		return complexidadeMovimento;
	}
	public void setComplexidadeMovimento(int complexidadeMovimento) {
		this.complexidadeMovimento = complexidadeMovimento;
	}
	public int getVelocidadeExecucao() {
		return velocidadeExecucao;
	}
	public void setVelocidadeExecucao(int velocidadeExecucao) {
		this.velocidadeExecucao = velocidadeExecucao;
	}
	public String getDanca() {
		return danca;
	}
	public void setDanca(String danca) {
		this.danca = danca;
	}
}
