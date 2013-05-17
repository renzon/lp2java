package aula19;

public class Conta {
	private double saldo=20;

	public synchronized double sacar(double valor){
		System.out.println("Inicio de Thread");
		if(valor>0&& valor<saldo){
			System.out.println("Fazendo retirada: "+ valor);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Voltando do yield");
			saldo-=valor;
			return valor;
		}
		return 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
