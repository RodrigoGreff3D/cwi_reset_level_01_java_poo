package br.com.mario.teste;

import br.com.mario.model.Mario;

public class MarioTeste {

	public static void main(String[] args) {
	
		Mario mario = new Mario();
		
		mario.pegaCogumelo();
		System.out.println(mario);
		mario.pegaPena();
		System.out.println(mario);
		

		
	}
}
