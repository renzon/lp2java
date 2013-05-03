package aula13;

import java.util.Comparator;

import aula03.Pessoa;

public class PessoaComparator implements Comparator<Pessoa> {

	@Override
	public  int compare(Pessoa o1, Pessoa o2) {
		Integer idade1=o1.getIdade();
		Integer idade2=o2.getIdade();
		return idade1.compareTo(idade2);
	}

}
