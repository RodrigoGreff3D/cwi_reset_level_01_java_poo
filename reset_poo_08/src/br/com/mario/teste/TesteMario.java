package br.com.mario.teste;

import br.com.mario.model.Personagem;

public class TesteMario {

	public static void main(String[] args) {

		System.out.println("Teste pulo Mario");

		Personagem mario = new Personagem("Mario", 50, 1.55);
		mario.imprimeCaracteristicas();
		mario.saltar();
		System.out.println("");

		System.out.println("Teste pulo Mario");

		Personagem luigi = new Personagem("Luigi", 45, 2.00);
		luigi.imprimeCaracteristicas();
		luigi.saltar();
		System.out.println("");

	}
}
