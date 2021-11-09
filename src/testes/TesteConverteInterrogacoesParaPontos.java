package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algoritmos.ConverteInterrogacoesParaPontos;

class TesteConverteInterrogacoesParaPontos {

	ConverteInterrogacoesParaPontos algoritmo;

	@BeforeEach
	void setUp() {
		this.algoritmo = new ConverteInterrogacoesParaPontos("Interrogacoes Para Pontos");
	}

	@Test
	void testTransforma() {
		assertEquals("oi, como vc vai.", this.algoritmo.transforma("oi, como vc vai?"));
	}

	@Test
	void testGetNome() {
		assertEquals("Interrogacoes Para Pontos", this.algoritmo.getNome());
	}
}
