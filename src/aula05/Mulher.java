package aula05;

import aula03.Pessoa;

public class Mulher extends Pessoa {
	public String fazerMaquiagem(){
		return getNome()+" está se maquiando";
	}
	
	

	public Mulher(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

}
