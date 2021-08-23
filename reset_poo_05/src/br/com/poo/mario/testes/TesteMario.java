package br.com.poo.mario.testes;

import br.com.poo.mario.model.Mario;

public class TesteMario {

	public static void main(String[] args) {

		Mario m1 = new Mario();
		Mario m2 = new Mario("Mario Bros", 40, 1.50, 100);

		m1.imprimeCaracteristicas();
		
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
//		m1.perderEstamina();
		m1.perderEstamina();
		
		m1.imprimeCaracteristicas();
		
		m1.ganharEstamina();
		
		m1.imprimeCaracteristicas();
		
		m1.crescer();
		
		m1.imprimeCaracteristicas();
	
		
	}
}
