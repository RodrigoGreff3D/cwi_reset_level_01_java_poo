package br.com.mario.model;

public class Yoshi extends Personagem {

	private int frutas;
	private int velocidade;

	public Yoshi(String nome, int idade, double altura) {
		super(nome, idade, altura);
		this.frutas = 0;
		this.velocidade = 10;

	}

	public void comerFruta() {
		frutas++;
		if (this.frutas % 2 == 0) {
			velocidade *= 2;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	@Override
	public void crescer() {
		this.altura = this.altura * 1.1;
	}

}
