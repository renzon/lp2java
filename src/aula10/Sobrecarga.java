package aula10;

public class Sobrecarga {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(calcular(1,2));
		System.out.println(calcular(3));

	}

	private static double calcular(int i) {
		if (i<=0){
			return 1;
		}
		return calcular(i-1)*i;
	}

	private static double calcular(double i, double j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
	private static double calcular(Integer i, Integer j) {
		// TODO Auto-generated method stub
		return i-j;
	}
	
	private static double calcular(int ...i ) {
		// TODO Auto-generated method stub
		return i*j;
	}

}
