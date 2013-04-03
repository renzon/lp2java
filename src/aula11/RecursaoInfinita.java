package aula11;

public class RecursaoInfinita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		rec(0);

	}

	private static void rec(int i) {
		i++;
System.out.println(i);
		rec(i);
	}

}
