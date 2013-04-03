package aula07;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TelefonistaTeste {

	@Test
	public void testTelefonar() {
		Telefone tel=new TelefoneDeBrinquedo();
		Telefonista telefonista=new Telefonista(tel);
		
//		telefonista.setTelefone(tel);
		String[] numeros={"99999999","88888888"};
		List<String> mensagens=telefonista.telefonar(numeros);
		String expected="Ligando de verdade para o numero 9999-9999";
		String msg1=mensagens.get(0);		
		assertEquals(expected,msg1);
		
		expected="Ligando de verdade para o numero 8888-8888";
		String msg2=mensagens.get(1);		
		assertEquals(expected,msg2);
		
		assertEquals(2, mensagens.size())
;	}

}
