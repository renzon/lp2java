package aula13;

import java.util.HashSet;
import java.util.Set;

import aula03.Pessoa;

public class SetTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Pessoa> turmaBd=new HashSet<Pessoa>();
		Pessoa renzo=new Pessoa("Renzo",30);
		Pessoa renzoClone=new Pessoa("Renzo",30);
		Pessoa joao=new Pessoa("Joao",22);
		turmaBd.add(renzo);
		turmaBd.add(renzoClone);
		turmaBd.add(joao);
		
		Set<Pessoa> turmaRede=new HashSet<Pessoa>();
		turmaRede.add(joao);
		turmaRede.add(new Pessoa("Jessica", 22));
		System.out.println("Turma BD");
		System.out.println(turmaBd);
		
		System.out.println("Turma Rede");
		System.out.println(turmaRede);
		
		System.out.println("Está nas duas turmas ao mesmo tempo");
		Set<Pessoa> intersecao=new HashSet<Pessoa>(turmaBd);
		intersecao.retainAll(turmaRede);
		System.out.println(intersecao);
		
		System.out.println("Está em Bd ou Rede");
		Set<Pessoa> uniao=new HashSet<Pessoa>(turmaBd);
		uniao.addAll(turmaRede);
		System.out.println(uniao);

	}

	private static void imprimirConjunto(Set<Pessoa> turma) {
		for(Pessoa p: turma){
			System.out.println(p);
		}
		
	}
	
	

}
