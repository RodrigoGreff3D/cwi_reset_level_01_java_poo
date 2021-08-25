package br.com.mario.teste;

import br.com.mario.model.Luigi;
import br.com.mario.model.Mario;
import br.com.mario.model.Yoshi;

public class TesteMario {

	public static void main(String[] args) {

		Mario mario = new Mario("Mario", 40, 1.60);

		Luigi luigi = new Luigi("Luigi", 37, 1.80);

		Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

		mario.imprimeCaracteristicas();
		mario.crescer();
		mario.imprimeCaracteristicas();

		luigi.imprimeCaracteristicas();
		luigi.crescer();
		luigi.imprimeCaracteristicas();

		yoshi.imprimeCaracteristicas();
		yoshi.crescer();
		yoshi.imprimeCaracteristicas();

		luigi.saltar();
		mario.saltar();
		yoshi.saltar();

		luigi.saltar(2);
		mario.saltar(3);
		yoshi.saltar(10);

	}
}