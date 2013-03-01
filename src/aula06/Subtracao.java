package aula06;

public class Subtracao implements Operacao {

	@Override
	public double calcular(double arg, double arg2) {
		// TODO Auto-generated method stub
		return arg-arg2;
	}

	@Override
	public String getSinal() {
		
		return "-";
	}

}
