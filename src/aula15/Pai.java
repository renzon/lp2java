package aula15;

import java.io.IOException;

public class Pai {
	public String getNome(String tratamento){
		return tratamento+" Pai";
	}
	
	private String privado(){
		return "Privado";
	}
	
	Pai getNovoPai(Pai pai) throws NullPointerException{
		return new Pai();
	}

}
