package aula12;

public class While {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int i=0;
		while(i<2){
			System.out.println(i);
			i++;
		}
		
		do{
			System.out.println(i);
			i++;
		}while(i<2);

	}

}
