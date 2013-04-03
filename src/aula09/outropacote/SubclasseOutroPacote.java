package aula09.outropacote;

import aula09.pacote.ClasseTeste;

public class SubclasseOutroPacote extends ClasseTeste {
	public void chamarMetodos(){
		ClasseTeste classeTeste=new ClasseTeste();
		classeTeste.metodoPublico();
//		classeTeste.metodoPrivado();
//		classeTeste.metodoProtegido();
		super.metodoProtegido();
//		classeTeste.metodoDefault();
	}

}
