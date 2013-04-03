package aula10;

public class Wrappers {

	
	
	
	
	
	public static void main(String[] args) {
		int a=(int) retorneObj();
		Float f=new Float(2.6);
		
		Integer i=new Integer("2");
		Character c='c';
		char ch=c;
		System.out.println(f);
		System.out.println(i+f);
		System.out.println((i+f).);
		f=Float.valueOf("2.34345");
		System.out.println(f);
		int inteiro=i.intValue();
		System.out.println(inteiro);
		inteiro=Integer.parseInt("45");
		System.out.println(inteiro);
		inteiro=Integer.parseInt("10",16);
		System.out.println(inteiro);
		System.out.println(Integer.toString(inteiro, 8));
//		inteiro=Integer.parseInt("f");
		
	

	}

	private static Object retorneObj() {
		// TODO Auto-generated method stub
		return 0;
	}

}
