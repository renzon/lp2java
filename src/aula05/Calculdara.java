package aula05;

import java.util.Scanner;

public class Calculdara {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		double n=scanner.nextDouble();
		System.out.println("Digite a operacao");
		String sinal=scanner.next();
		System.out.println("Digite o segundto numero");
		double n2=scanner.nextDouble();
		System.out.println(n+sinal+n2);
	}

}
