package aula09;

public class SomaComVarargs {
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(soma(1,2));
		System.out.println(soma(1,2,1));
		System.out.println(soma(1,2,1,2));

	}

	private static char[] soma(int i, int j,int ... n ) {
		int s=i+j;
		for(int ele:n){
			s+=ele;
		}
		return s;
	}

}
