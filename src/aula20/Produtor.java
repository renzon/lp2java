package aula20;

public class Produtor extends Thread {
	private Produto produto;
	

	public Produtor(Produto produto,String name) {
		super(name);
		this.produto = produto;
	}

	@Override
	public void run() {
		
		for(int i=0;i<50;++i){
			synchronized(produto){
				System.out.println("Produtor "+getName()+" produzindo "+i);
				produto.addMsg("Mensagem "+i);
				produto.notifyAll();
			}
		}
	}
}
