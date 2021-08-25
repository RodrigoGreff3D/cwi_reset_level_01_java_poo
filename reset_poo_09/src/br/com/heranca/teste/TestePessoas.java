package br.com.heranca.teste;

import br.com.heranca.model.Aluno;
import br.com.heranca.model.Funcionario;
import br.com.heranca.model.Pessoa;
import br.com.heranca.model.Professor;

public class TestePessoas {

	public static void main(String[] args) {

		Pessoa aluno = new Aluno();
		Pessoa funcionario = new Funcionario();
		Pessoa professor = new Professor();

		aluno.setSexo('M');
		aluno.setNome("Rodrigo");
		aluno.setIdade(32);

		System.out.println(aluno);
	}
}
