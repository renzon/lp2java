package aula19;

public class SaqueDeConta extends Thread {
	private Conta conta;
	private  double valor=0;
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public SaqueDeConta(Conta conta) {
		super();
		this.conta = conta;
	}
	@Override
	public void run() {
		conta.sacar(valor);
	}

}
