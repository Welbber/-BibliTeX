package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.InsertSpaces;

class TestesInsertSpaces {
	
	InsertSpaces algoritmo;
	
	@BeforeEach
	void setUp() {
		this.algoritmo = new InsertSpaces("InsertSpaces");
	}

	@Test
	void testTransforma() {
		assertEquals("o i , c o m o v c v a i ?", this.algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("InsertSpaces", this.algoritmo.getNome());
	}

}
