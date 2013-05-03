package aula14;

public class StringBuilderTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("");
		s.append("R");
		s.append("e");
		s.append("n");
		s.append("z");
		s.append("o");
		System.out.println(s.toString());
		s.insert(3, "BLAH");
		System.out.println(s.toString());
		s.delete(3, 8);
		System.out.println(s.toString());
		s.reverse();
		System.out.println(s.toString());

	}

}
