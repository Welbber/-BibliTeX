package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.CaMeLcAsEfY;
import algoritmos.Clean;

class TesteClean {
	
	Clean algoritmo;
	
	@BeforeEach
	void setUp() {
		this.algoritmo = new Clean("Clean");
	}

	@Test
	void testTransforma() {
		assertEquals("oi como vc vai", algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("Clean", this.algoritmo.getNome());
	}

}
