package aula07;

import static org.junit.Assert.*;

import org.junit.Test;

import aula06.Adicao;

public class AdicaoTeste {

	
	
	
	@Test
	public void testSomaComInteiros() {
		Adicao adicao=new Adicao();
		int resultado=(int) adicao.calcular(1, 1);
		assertEquals(2, resultado);
		resultado=(int) adicao.calcular(10, 1);
		assertEquals(11, resultado);

	}
	
	@Test
	public void testSomaComPontoFlutuante() {
		Adicao adicao=new Adicao();
		double resultado=adicao.calcular(1.2, 1.3);
		assertEquals(2.5, resultado,0.05);
		
	}
	

}
