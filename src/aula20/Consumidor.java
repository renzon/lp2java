package aula20;

public class Consumidor extends Thread {
	private Produto produto;

	public Consumidor(Produto produto,String name) {
		super(name);
		this.produto = produto;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (produto) {
				String msg = produto.processarMsg();
				if (msg != null) {
					System.out.println(getName()+" Consumindo " + msg);
				} else {
					try {
						System.out.println(getName()+" Aguardando");
						produto.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}
}
