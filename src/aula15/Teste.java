package aula15;

import aula03.Pessoa;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pai p=new Filha();
		System.out.println(p.getNome("Sr"));
		p=p.getNovoPai(new Filha());
		System.out.println(p.getNome("Sr"));

	}

}
