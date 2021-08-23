package br.com.poo.teste;

import br.com.poo.model.Mario;

public class TesteMario {

	public static void main(String[] args) {

		Mario m1 = new Mario();
		Mario m2 = new Mario("Mario Bros", 40, 1.50, 100);

		m1.imprimeCaracteristicas();
		m2.imprimeCaracteristicas();
	}

}
