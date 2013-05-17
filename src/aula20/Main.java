package aula20;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Produto produto=new Produto();
		Consumidor[] consumidores=new Consumidor[3];
		for(int i=0;i<consumidores.length;++i){
			consumidores[i]=new Consumidor(produto,"C"+i);
		}
				
		
		Produtor[] produtores=new Produtor[3];
		for(int i =0;i<produtores.length;++i){
			produtores[i]=new Produtor(produto,"P"+i);
		}
		
		for(Consumidor c:consumidores){
			c.start();
		}
		for(Produtor p: produtores){
			p.start();
		}

	}

}
