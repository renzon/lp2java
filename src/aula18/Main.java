package aula18;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread[] contadores= new Thread[8];
		for(int i=0; i<contadores.length;++i){
			contadores[i]=new Thread(new Contador(), "Contador "+i);
		}
		
		for(Thread c: contadores){
			System.out.println("Startando "+c.getName());
			c.start();
		}
		for(Thread c: contadores){	
			c.join();
		}
		
		System.out.println(Thread.currentThread().getName());

	}

}
