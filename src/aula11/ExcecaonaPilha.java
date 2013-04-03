package aula11;

public class ExcecaonaPilha {

	public static void main(String[] args) {
		try {
			f1();
		} catch (NullPointerException e) {
			System.out.println("Catch da main");
		}
		System.out.println("Terminando main");
	}

	private static void f1() {
		System.out.println("Chamandno f1");
		try {
			f2();
		} catch (NullPointerException e) {
			System.out.println("Catch de f1");
		}
		System.out.println("Terminando f1");

	}

	private static void f2() {
		System.out.println("Chamando f2");
		try{
		String s = null;
		s.split(" ");
		} catch (NullPointerException e) {
			System.out.println("Catch de f2");
		}
		System.out.println("Terminando f2");

	}

}
