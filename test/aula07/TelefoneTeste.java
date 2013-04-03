package aula07;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelefoneTeste {

	@Test
	public void testeTelefonarComNumeroValido() {
		Telefone telefone=new TelefonerReal();
		String resultado =telefone.telefonar("9999-9999");
		assertEquals("Ligando de verdade para o numero 9999-9999", resultado);
		resultado =telefone.telefonar("8888-9999");
		assertEquals("Ligando de verdade para o numero 8888-9999", resultado);
	}
	
	@Test
	public void testeTelefonarComNumeroInvalidos() {
		TelefonerReal telefone=new TelefonerReal();
		String resultado =telefone.telefonar(null);
		assertNull(resultado);
		try{
			telefone.telefonar("888-9999");
			fail("Deveria ter lançado TelefoneErradoException");
		}catch(TelefoneErradoException e){
			System.out.println("Telefone Errado");
		}
		
	}

}
