package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.CleanSpaces;

class TesteCleanSapces {
	
	CleanSpaces algoritmo;
	
	@BeforeEach
	void setUp() {
		this.algoritmo = new CleanSpaces("CleanSpaces");
	}

	@Test
	void testTransforma() {
		assertEquals("oi,comovcvai?", algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("CleanSpaces", this.algoritmo.getNome());
	}
}
