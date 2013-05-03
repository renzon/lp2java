package aula05;

import aula03.Pessoa;

public class Homem  extends Pessoa{
	public String jogarFutebol(){
		return getNome()+" jogando futebol";
	}

	public Homem(String nome, int idade) {
		super(nome, idade);
		System.out.println("Construtor 2 args de homem");
	}
	
	
	
	public Homem() {
		this("Rafael",29);
		System.out.println("Construtor vazio de homem");
	}

	@Override
	public String cumprimentar() {
		return getNome()+" Apertando as mãos";
	}

}
