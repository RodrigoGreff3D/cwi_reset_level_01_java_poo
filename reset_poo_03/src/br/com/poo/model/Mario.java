package br.com.poo.model;

public class Mario {
	
	private String nome;
	private double altura;
	private double peso;
	public double alturaPulo;
	protected String voar;

	public Mario() {
		super();
		this.nome = "Mario";
		this.altura = 1.55;
		this.peso = 89.8;
		this.alturaPulo = 3.875;
		this.voar = "Não pode voar";
	}

	public void pegaCogumelo() {
		this.nome = "Super Mario";
		this.altura = 2.00;
		this.peso = 100;
		this.alturaPulo = 4.00;
	}

	public void pegaPena() {
		this.voar = "Pode voar";
	}

	@Override
	public String toString() {
		return "[Nome do personagem = " + nome + ", Altura do personagem = " + altura + "," + " Peso do personagem: = "
				+ peso + ", Altura do pulo = " + alturaPulo + ", Pode voar? " + voar + "]";
	}

}
