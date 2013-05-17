package aula18;

public class Contador implements Runnable {
	

	@Override
	public void run() {
		for (int i=0;i<100;i++){
//			Thread.yield();
			String threadName=Thread.currentThread().getName();
			System.out.println("Thread: "+threadName);
			System.out.println(i);
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	

}
