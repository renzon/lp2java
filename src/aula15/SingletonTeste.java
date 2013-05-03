package aula15;

public class SingletonTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstante();
		singleton=singleton.getInstante();

	}

}
