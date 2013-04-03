package aula09.pacote;

public class SubclasseMesmoPacote extends ClasseTeste {
	public void chamarMetodos(){
		ClasseTeste classeTeste=new ClasseTeste();
		classeTeste.metodoPublico();
//		classeTeste.metodoPrivado();
		classeTeste.metodoProtegido();
		super.metodoProtegido();
		classeTeste.metodoDefault();
	}

}
