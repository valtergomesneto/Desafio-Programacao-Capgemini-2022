package br.com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.capgemini.Questao1;
import br.com.capgemini.Questao3;

class Questao1Test {

	
	@Test
	void testeComSeisDegraus() {
		Questao1 q1 = new Questao1();
		int entrada = 6;
		assertEquals(q1.getEscadas(entrada).toString(), """      
											                     *
											                    **
											                   ***
											                  ****
											                 *****
											                ******""");
	}

}
