package aula19;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Conta conta=new Conta();
		SaqueDeConta[] saques={new SaqueDeConta(conta),new SaqueDeConta(conta)};
		for(SaqueDeConta saque: saques){
			saque.setValor(15);
			saque.start();			
		}
		
		for(SaqueDeConta saque: saques){
			saque.join();			
		}
		System.out.println("Saldo: "+conta.getSaldo());

	}

}
