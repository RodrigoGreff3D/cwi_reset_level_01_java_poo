package br.com.mario.model;

public abstract class Personagem {

	protected String nome;
	protected int idade;
	protected double altura;
	protected int estamina;
	protected int moedas;
	protected int vidas;

	public Personagem(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
		this.moedas = 0;
		this.vidas = 1;
	}

	public void imprimeCaracteristicas() {
		System.out.println("{" + "nome= " + nome + ", " + "altura=" + altura + ", idade=" + idade + ", estamina="
				+ estamina + ", modedas= " + moedas + ", vidas= " + vidas + "}");
	}

	public void imprimePoderes() {
		System.out.println("Super força, Super salto, super velocidade e outros.");
	}

	public void perderEstamina() {
		this.estamina = this.estamina - 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}

	public void ganharEstamina() {
		this.estamina = this.estamina + 5;
		if (this.estamina >= 100) {
			this.estamina = 100;
		}
	}

	public abstract void crescer();

	public void revigorar() {
		this.estamina = 100;
	}

	public void morrer() {
		this.estamina = 0;
		this.vidas--;

		if (this.vidas < 0) {
			vidas = 0;
		} else {
			revigorar();
		}
	}

	public void coletarMoedas() {
		this.moedas++;
		if (this.moedas % 10 == 0) {
			this.vidas++;
		}
	}

	public void saltar() {
		System.out.println("Personagem " + this.nome + " Pula: " + this.altura * 0.5 + " metros");
	}
	
	public void saltar(double alturaObstaculos) {
		double alturaPulo = alturaObstaculos * 1.5;
		System.out.println("Personagem " + this.nome + " Pulou uma altura de " + alturaPulo);
	}

}
