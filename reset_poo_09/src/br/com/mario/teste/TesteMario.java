package br.com.mario.teste;

import br.com.mario.model.Luigi;
import br.com.mario.model.Mario;
import br.com.mario.model.Yoshi;

public class TesteMario {

	public static void main(String[] args) {

		Mario mario = new Mario("Mario", 50, 1.50);

		Luigi luigi = new Luigi("Luigi", 45, 2.00);

		Yoshi yoshi = new Yoshi("Yoshi", 90, 1.00);

		mario.imprimirMontadoNoYoshi();
		
		mario.montarNoYoshi(yoshi);
		
		mario.imprimirMontadoNoYoshi();

		luigi.voar();

		System.out.println("Velocidade: " + yoshi.getVelocidade());
		
		yoshi.comerFruta();
		System.out.println("Velocidade: " + yoshi.getVelocidade());
		
		yoshi.comerFruta();
		System.out.println("Velocidade: " + yoshi.getVelocidade());
		
		yoshi.comerFruta();
		yoshi.comerFruta();
		System.out.println("Velocidade: " + yoshi.getVelocidade());

	}
}