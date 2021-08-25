package br.com.poo.teste;

import br.com.poo.model.ControleRemoto;

public class TesteControle {

	public static void main(String[] args) {
		
		ControleRemoto cr = new ControleRemoto();
		
		cr.ligar();
		cr.play();
		cr.maisVolume();
		cr.ligarMudo();
		cr.abrirMenu();
		cr.fecharMenu();
	}
}
