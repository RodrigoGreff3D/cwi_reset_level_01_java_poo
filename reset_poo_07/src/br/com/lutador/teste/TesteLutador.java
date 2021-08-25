package br.com.lutador.teste;

import br.com.lutador.model.Lutador;

public class TesteLutador {

	public static void main(String[] args) {
		
		Lutador[] lutadores = new Lutador[3];
		
		lutadores[0] = new Lutador("Rodrigo", "Brasileiro", 32, 1.76, 76, 10, 2, 3);
		lutadores[1] = new Lutador("Rodrigo2", "Brasileiro", 32, 1.76, 76, 10, 2, 3);
		lutadores[2] = new Lutador("Rodrigo3", "Brasileiro", 32, 1.76, 76, 10, 2, 3);
		
		for (Lutador lutador : lutadores) {
			System.out.println(lutador);
		}
		
	}
}
