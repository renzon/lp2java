package aula15;

import java.io.IOException;
import java.util.Date;

public class Filha extends Pai {
	@Override
	public String getNome(String tratamento) {
		System.out.println(new Date());
		String resultado =super.getNome(tratamento);
		System.out.println(new Date());
		return resultado;
	}
	
	@Override
	public Filha getNovoPai(Pai pai) {
		privado();
		return new Filha();
	}
	
	
	private String privado(){
		return "private";
	}
	
	public String getNome(){
		return "Filha";
	}
}
