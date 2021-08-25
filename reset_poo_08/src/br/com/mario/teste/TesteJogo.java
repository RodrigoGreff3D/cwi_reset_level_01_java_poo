package br.com.mario.teste;

import br.com.mario.model.Jogo;
import br.com.mario.model.Personagem;

public class TesteJogo {

	public static void main(String[] args) {

		Personagem p1 = new Personagem("Mario", 50, 1.65);
		Personagem p2 = new Personagem("Luigi", 49, 2.00);
		
		Jogo jogo1 = new Jogo(p1, p2);
		
		jogo1.jogar();
	}
}
