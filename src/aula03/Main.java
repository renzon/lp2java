package aula03;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa renzo=new Pessoa("Renzo",30);
		
		System.out.println(renzo.cumprimentar());
		
		Pessoa juliana=new Pessoa("Juliana",20);
		System.out.println(juliana.cumprimentar());
		System.out.println(juliana.getClass());
		//juliana.segundoNome="Blah";
		if (juliana instanceof Pessoa){
			System.out.println("É do tipo Pessoa");
		}else{
			System.out.println("Não é do tipo Pessoa");
		}

	}
	
		
	

}
