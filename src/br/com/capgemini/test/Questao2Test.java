package br.com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.capgemini.Questao2;

class Questao2Test {


	@Test
	public void testeComTresLetras() {
		Questao2 q2 = new Questao2();

		try {
			assertEquals(3, q2.checkPass("Ya3"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testeComSeisLetras() {
		Questao2 q2 = new Questao2();

		try {
			assertEquals(0, q2.checkPass("Ya3&ab"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
