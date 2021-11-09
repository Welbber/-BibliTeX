package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.CaMeLcAsEfY;

class TesteCaMeLcAsEfY {
	CaMeLcAsEfY algoritmo;

	@BeforeEach
	void setUp() throws Exception {
		this.algoritmo = new CaMeLcAsEfY("Camel");
	}

	@Test
	void testTransforma() {
		assertEquals("Oi, CoMo vC VaI?", algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("Camel", this.algoritmo.getNome());
	}

}
