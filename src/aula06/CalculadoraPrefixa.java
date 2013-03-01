package aula06;

import java.util.Scanner;

public class CalculadoraPrefixa extends Calculadora {

	@Override
	public void obterInputs() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Digite o sinal da operação");
		String sinal=scanner.next();
		setSinal(sinal);
		System.out.println("Digite o primeiro argumento");
		double arg=scanner.nextDouble();
		setArg(arg);
		
		
		
		System.out.println("Digite o segundo argumento");
		arg=scanner.nextDouble();
		setArg2(arg);

	}

}
