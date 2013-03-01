package aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aula03.Pessoa;

public class ListaTeste {

	
	public static void main(String[] args) {
		Pessoa[] vetor={new Pessoa("Renzo",30),new Pessoa("Lucas",20)};
		List<Pessoa> pessoas=new ArrayList<Pessoa>(Arrays.asList(vetor));
		pessoas.remove(0);
//		for(Pessoa p: vetor){
//			pessoas.add(p);
//		}
		
		
		for(int i=0;i<pessoas.size();i++){
			Pessoa p=pessoas.get(i);
			System.out.println(p.cumprimentar());
		}

	}

}
