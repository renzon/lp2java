package aula09.pacote;

public class ClasseMesmoPacote{
	public void chamarMetodos(){
		ClasseTeste classeTeste=new ClasseTeste();
		classeTeste.metodoPublico();
//		classeTeste.metodoPrivado();
		classeTeste.metodoProtegido();
		classeTeste.metodoDefault();
	}

}
