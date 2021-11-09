package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.UpperCase;

class TesteUpperCase {
	
	UpperCase algoritmo;
	
	@BeforeEach
	void setUp() {
		this.algoritmo = new UpperCase("UpperCase");
	}


	@Test
	void testTransforma() {
		assertEquals("OI, COMO VC VAI?", this.algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("UpperCase", this.algoritmo.getNome());
	}

}
