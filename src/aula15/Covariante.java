package aula15;

import aula03.Pessoa;
import aula05.Homem;

public class Covariante {

	
	public static void main(String[] args) {
		Pessoa p=novaPessoa();

	}

	private static Pessoa novaPessoa() {
		return new Homem("Renzo",30);
	}

}
