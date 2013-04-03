package aula09.coffee;

public class EnumMail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoffeeSize size;
		size=CoffeeSize.BIG;
		System.out.println(CoffeeSize.MEDIUM);
		for(CoffeeSize s:CoffeeSize.values()){
			System.out.println(s);
		}
		
	

	}

}
