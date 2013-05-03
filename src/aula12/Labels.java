package aula12;

public class Labels {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		outter:
			for (int j = 0; j < 4; ++j) {
			for (int i = 0; i < 8; i++) {
				System.out.println(i);
				continue outter;
			}
		}
	}

}
