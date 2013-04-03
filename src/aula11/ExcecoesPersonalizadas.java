package aula11;

public class ExcecoesPersonalizadas {

	
	public static void main(String[] args) {
		try {
			metodoComExcecaoChecada();
		} catch (LP2Checada e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		metodoComExcecaoNaoChecada();

	}

	
	
	
	private static void metodoComExcecaoNaoChecada() throws LP2NaoChecada,NullPointerException {
		throw new LP2NaoChecada();
		
	}




	private static void metodoComExcecaoChecada() throws LP2Checada {
		throw new LP2Checada();
		
	}

}
