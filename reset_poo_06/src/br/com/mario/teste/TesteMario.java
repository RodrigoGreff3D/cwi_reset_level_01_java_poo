package br.com.mario.teste;

import br.com.mario.model.Mario;

public class TesteMario {

	public static void main(String[] args) {

		Mario m1 = new Mario();

		m1.imprimeCaracteristicas();

		m1.perderEstamina();

		m1.imprimeCaracteristicas();

		m1.revigorar();

		m1.imprimeCaracteristicas();

		m1.morrer();

		m1.imprimeCaracteristicas();
		
		m1.revigorar();

		m1.imprimeCaracteristicas();

		m1.coletarMoedas();
		
		

		m1.imprimeCaracteristicas();

	}
}
