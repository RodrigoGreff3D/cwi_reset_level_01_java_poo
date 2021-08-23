package br.com.poo.conta.testes;

import br.com.poo.conta.model.ContaBanco;

public class TesteConta {

	public static void main(String[] args) {

		ContaBanco cc = new ContaBanco();

		cc.setNumConta(123456);
		cc.setDono("Rodrigo");
		cc.abrirConta("CC");

		ContaBanco cp = new ContaBanco();

		cp.setNumConta(123456);
		cp.setDono("Rodrigo");
		cp.abrirConta("CP");
		
		cc.sacar(25);
		cp.sacar(25);

		cc.estadoAtual();
		cp.estadoAtual();
	}
}
