package br.com.mario.model;

public class Luigi extends Personagem{

	public Luigi(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	
	public void voar() {
		System.out.println("Luigi est? voando");
	}

}
