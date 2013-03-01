package aula02;

public class Caracter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c='a';
		System.out.println(c);
		c=64;
		System.out.println(c);
		
		//Tabela ascii
		for(int i=0;i<256;++i){
			c=(char) i;
			System.out.println(c+":"+i);
		}

	}

}
