package aula12;

public class If {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int i=1 | 2;
		System.out.println(i);
		if (cond1() & cond2()) {
			System.out.println("Imprimindo if");
		}
		System.out.println("Terminando Main");

	}

	private static boolean cond2() {
		System.out.println("Imprimindo cond 2");
		return false;
	}

	private static boolean cond1() {
		System.out.println("Imprimindo cond 1");
		return false;
	}

}
