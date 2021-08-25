package br.com.lutador.model;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas
				+ ", empates=" + empates + "]";
	}



	public void apresentar() {
		System.out.println("----------------------------------");
		System.out.println("Chegou a hora de apresentar o lutador: " + this.getNome());
		System.out.println("Nacionalidade " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura ");
		System.out.println("pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}

	public void status() {
		System.out.println("----------------------------------");
		System.out.println(this.getNome() + " tem um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " Vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
		System.out.println("Empatou " + this.getEmpates() + " Vezes");
	}

	public void ganharLuta() {
		this.vitorias += 1;
	}

	public void perderLuta() {
		this.derrotas += 1;
	}

	public void empatarLuta() {
		this.empates += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {

		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else{
			this.categoria = "Inválido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
