package aula07;

import java.util.ArrayList;
import java.util.List;

import aula04.ListaTeste;

public class Telefonista {
	private Telefone telefone;
	
	

	


	public Telefonista(Telefone telefone) {
		super();
		this.telefone = telefone;
	}






	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}






	public List<String> telefonar(String[] numeros) {
		List<String>msgs=new ArrayList<String>();
		for(String n:numeros){
			n=n.substring(4)+"-"+n.substring(4,8);
			msgs.add(telefone.telefonar(n));
		}
		return msgs;
	}

}
