package aula09.pacote;

public class ClasseTeste {
	
	void metodoDefault(){
		
	}
	
	protected void metodoProtegido(){
		
	}
	
	public void metodoPublico(){
		
	}
	
	private void metodoPrivado(){
		
	}
	
	private void metodoQueChamaOutrosMetodos(){
		metodoPublico();
		metodoPrivado();
		metodoProtegido();
		metodoDefault();
	}

}
