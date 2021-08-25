package br.com.lutador.model;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rouns;
	private boolean aprovado;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (aprovado == true) {
			System.out.println("------Desafiado-----");
			this.desafiado.apresentar();

			System.out.println("------Desafiado-----");
			this.desafiado.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);

			switch (vencedor) {
			case 0:
				
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				
				break;
			case 1:
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiado.ganharLuta();
				this.desafiado.perderLuta();
				
				break;
			case 2:
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.perderLuta();
				this.desafiado.ganharLuta();
				
				break;

			}

		} else {
			System.out.println("Luta não pode acontecer");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiador() {
		return desafiante;
	}

	public void setDesafiador(Lutador desafiador) {
		this.desafiante = desafiador;
	}

	public int getRouns() {
		return rouns;
	}

	public void setRouns(int rouns) {
		this.rouns = rouns;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
