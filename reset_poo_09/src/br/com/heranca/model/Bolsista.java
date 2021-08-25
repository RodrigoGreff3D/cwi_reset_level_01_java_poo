package br.com.heranca.model;

public class Bolsista extends Aluno{

	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista, pagamento facilitado");
	}
	
}
