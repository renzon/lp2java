package aula06;

import java.util.HashMap;
import java.util.Map;

public abstract class Calculadora {
	private double arg;
	public void setArg(double arg) {
		this.arg = arg;
	}

	public void setArg2(double arg2) {
		this.arg2 = arg2;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}

	private double arg2;
	private String sinal;
	private Map<String,Operacao> mapaDeOperacoes= new HashMap<String, Operacao>();
	
	public void adicionarOperacao(Operacao operacao){
		mapaDeOperacoes.put(operacao.getSinal(), operacao);
	}
	
	public abstract void obterInputs();
	
	public double calcular(){
		Operacao operacaoEscolhida=mapaDeOperacoes.get(sinal);
		return operacaoEscolhida.calcular(arg, arg2);
	}

}
