package aula06;

import java.io.Serializable;

public class Adicao implements Operacao,Serializable {

	@Override
	public double calcular(double arg, double arg2) {
		
		return arg+arg2;
	}

	@Override
	public String getSinal() {
		return "+";
	}

}
