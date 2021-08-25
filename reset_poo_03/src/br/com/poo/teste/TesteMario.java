package br.com.poo.teste;

import br.com.poo.model.Mario;

public class TesteMario {

	public static void main(String[] args) {

		Mario mario = new Mario();
		Mario mario2 = new Mario();
		
		mario.pegaPena();
		System.out.println(mario);

		mario2.pegaCogumelo();
		System.out.println(mario2);
		
	

	}
}
