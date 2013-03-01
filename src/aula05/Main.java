package aula05;

import aula03.Pessoa;

public class Main {
	public static void main(String[] args) {
		Homem homem=new Homem("Renzo", 30);
		Mulher mulher=new Mulher("Jéssica", 20);
		
		System.out.println(mulher.fazerMaquiagem());
		cumprimentarEMostrarIdade(mulher);
		System.out.println(homem.jogarFutebol());
		Pessoa pessoa=homem;
		cumprimentarEMostrarIdade(pessoa);
		cumprimentarEJogarFutebol((Homem)pessoa);
		Homem h=(Homem) pessoa;
		
	}

	private static void cumprimentarEMostrarIdade(Pessoa pessoa) {
		System.out.println(pessoa.cumprimentar());
		System.out.println("a idade dessa pessoa é "+pessoa.getIdade());	
	}
	
	private static void cumprimentarEJogarFutebol(Homem homem) {
		System.out.println(homem.cumprimentar());
		System.out.println(homem.jogarFutebol());	
	}
	
	
	

}
