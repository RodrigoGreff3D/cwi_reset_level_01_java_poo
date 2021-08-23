package br.com.poo.model;

public class Mario {

	private String nome;
	private int idade;
	private double altura;
	private int estamina;

	public Mario() {
		this.nome = "Mario Bros";
		this.idade = 40;
		this.altura = 1.50;
		this.estamina = 100;
	}

	public Mario(String nome, int idade, double altura, int estamina) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
	}

	public void imprimeCaracteristicas() {
		System.out.println("Mario{" + "nome='" + nome + '\'' + ", altura=" + altura + ", idade=" + idade + ", estamina="
				+ estamina + '}');
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

}
