package br.com.mario.model;

import java.util.Random;

public class Jogo {

	private Personagem jogador1;
	private Personagem jogador2;

	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	public void jogar() {

		Random aleatorio = new Random();

		int moedasColetadas1 = aleatorio.nextInt(30);

		for (int i = 0; i < moedasColetadas1; i++) {
			jogador1.coletarMoedas();
		}

		int moedasColetadas2 = aleatorio.nextInt(30);

		for (int i = 0; i < moedasColetadas2; i++) {
			jogador2.coletarMoedas();
		}
		
		System.out.println("Moedas coletadas pelo jogador 1: " + moedasColetadas1);
		System.out.println("");
		jogador1.imprimeCaracteristicas();
		
		System.out.println("");
		System.out.println("Moedas coletadas pelo jogador 2: " + moedasColetadas2);
		System.out.println("");
		jogador2.imprimeCaracteristicas();
	}

}
