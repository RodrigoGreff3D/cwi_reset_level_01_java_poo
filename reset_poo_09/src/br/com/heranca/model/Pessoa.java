package br.com.heranca.model;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected char sexo;

	public void fazerAniversario() {
		this.idade++;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
