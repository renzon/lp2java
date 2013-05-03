package aula13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import aula03.Pessoa;

public class Ordenacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> pessoas= new LinkedList<Pessoa>();
		pessoas.add(new Pessoa("Jessica",22));
		pessoas.add(new Pessoa("Higor",26));
		pessoas.add(new Pessoa("Lucas",21));
		pessoas.add(new Pessoa("Lucas",24));
		System.out.println("Ordenando por nome e idade");
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		System.out.println("Ordenando idade");
		Collections.sort(pessoas,new  PessoaComparator());
		System.out.println(pessoas);

	}

}
