package br.com.polimorfismo.teste;

import br.com.polimorfismo.model.Ave;
import br.com.polimorfismo.model.Mamifero;
import br.com.polimorfismo.model.Peixe;
import br.com.polimorfismo.model.Reptil;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(50);
		m.setCorPelo("Preto");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.setPeso(50);
		a.alimentar();
		a.locomover();
		a.emitirSom();
		
		
	}
}
