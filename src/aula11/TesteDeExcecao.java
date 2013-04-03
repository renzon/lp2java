package aula11;

public class TesteDeExcecao {

	
	
	
	
	public static void main(String[] args) {
		String s=null;
		boolean b=finnallyTest();
		System.out.println(b);
		
		
		String[] vetor=new String [2];
		try{
			System.out.println("Dentro do Try");
//			s=vetor[2];
//			s.split("-");
			System.out.println("Final do Try");
			
		}catch (NullPointerException e){
			System.out.println("Bloco Catch");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Array Index");
		}finally{
			System.out.println("bloco finally");
		}
		
		System.out.println("finalizando main");

	}

	private static boolean finnallyTest() {
		try{
			return false;
		}finally{
			return true;
		}
	}

}

