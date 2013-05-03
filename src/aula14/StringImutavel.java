package aula14;

public class StringImutavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="renzo";
		String s2="renzo";
		String s3=new String("renzo");
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println("--------    ==");
		System.out.println("s==s2: "+(s==s2));
		System.out.println("s==s3: "+(s==s3));
		
		System.out.println("--------    equals");
		System.out.println("s.equals(s2): "+s.equals(s2));
		System.out.println("s.equals(s3): "+s.equals(s3));

	}

}
