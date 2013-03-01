package aula05;

import aula03.Pessoa;

public class Homem  extends Pessoa{
	public String jogarFutebol(){
		return getNome()+" jogando futebol";
	}

	public Homem(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String cumprimentar() {
		return getNome()+" Apertando as mãos";
	}

}
