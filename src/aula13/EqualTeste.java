package aula13;

import aula03.Pessoa;

public class EqualTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa renzo=new Pessoa("Renzo",30);
		Pessoa r=renzo;
		Pessoa renzo2=new Pessoa("Renzo",30);
		Pessoa nulo=null;
		 System.out.println("==");
		System.out.println(renzo==r);
		System.out.println(renzo==renzo2);
		System.out.println(renzo==null);
		 System.out.println("equals");
			System.out.println(renzo.equals(r));
			System.out.println(renzo.equals(renzo2));
			System.out.println(renzo.equals(null));
		

	}

}
