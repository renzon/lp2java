package aula11;

import aula03.Pessoa;
import aula05.Homem;
import aula05.Mulher;

public class ProblemaDeClasse {

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa p=new Mulher("Jessica", 20);
		Mulher m=(Mulher) p;
		Homem h=(Homem) p;

	}

}
