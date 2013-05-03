package aula15;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	}
	
	
	
	public static Singleton getInstante(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}
	
	

}
