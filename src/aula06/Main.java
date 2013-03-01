package aula06;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Construindo Calculadora
		Calculadora calculadora=new CalculadoraPrefixa();
		//Adicionando opercações na calculadora
		calculadora.adicionarOperacao(new Adicao());
		calculadora.adicionarOperacao(new Subtracao());
		
		//Obtendo inputs, depende do tipo da calculadora
		calculadora.obterInputs();
		
		//Mostrar o resultado
		System.out.println("O Resultado é "+calculadora.calcular());

	}

}
