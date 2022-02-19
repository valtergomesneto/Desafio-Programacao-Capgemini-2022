package br.com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.capgemini.Questao3;

class Questao3Test {


	@Test
	public void testeComTresLetras() {
		Questao3 anagrama = new Questao3();

		try {
			assertEquals(2, anagrama.getAnagramas("ovo"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testeComQuatroLetras() {
		Questao3 anagrama = new Questao3();

		try {
			assertEquals(3, anagrama.getAnagramas("ifailuhkqq"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
