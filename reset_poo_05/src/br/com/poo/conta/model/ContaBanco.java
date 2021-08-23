package br.com.poo.conta.model;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco() {
		this.saldo = saldo;
		this.status = status;
	}

	public void estadoAtual() {
		System.out.println("-----------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}

	public void abrirConta(String t) {

		this.setTipo(t);
		this.setStatus(true);

		if (t.equals("CC")) {

			this.setSaldo(50);

		} else if (t.equals("CP")) {

			this.setSaldo(150);
		}

		System.out.println("Conta aberta com sucesso");

	}

	public void fecharConta() {

		if (this.getSaldo() > 0) {

			System.out.println("Conta não pode ser fechada pois ainda tem credito");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois possui débitos");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(double valor) {
		if (this.isStatus()) {
			// this.saldo += valor;
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso na conta de  " + this.getDono());
		} else {
			System.out.println("Conta não é válida");
		}

	}

	public void sacar(double valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado  na conta de  " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Conta inativa");
		}
	}

	public void pagarMensalidade() {
		int valor = 0;
		if (this.getTipo().equals("CC")) {
			valor = 12;
		} else if (this.getTipo().equals("CP")) {
			valor = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga por " + this.getDono());
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
