package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import algoritmos.UpperCase;
import controller.TransformaTexto;

class TesteTransformaTexto {

	TransformaTexto tt;

	@BeforeEach
	void setUp() throws Exception {
		tt = new TransformaTexto();
	}

	@Test
	void testCadastraTransformacao() {
		tt = new TransformaTexto();
		tt.cadastraTransformacao("Teste", new UpperCase("Teste"));
		assertEquals("TESTE", tt.transforma("Teste", "teste"));
	}

	@Test
	void testTransforma() {
		assertEquals("como vai voce", tt.transforma("Clean", "como, vai. voce?"));
		assertEquals("comovaivoce?", tt.transforma("CleanSpaces", "como vai voce?"));
	}

	@Test
	void testListaTransformacoes() {

		assertEquals("CaMeLcAsEfY", tt.listaTransformacoes().get(0));
		assertEquals("Clean Spaces", tt.listaTransformacoes().get(1));
	}

	@Test
	void testContaTransformacoes() {

	}

	@Test
	void testHistorico() {
		tt.transforma("Clean", "como, vai. voce?");
		tt.transforma("CleanSpaces", "como vai voce?");

		assertEquals("como, vai. voce? -> Cleans -> como vai voce", tt.historico(0));
		assertEquals("como vai voce? -> Clean Spaces -> comovaivoce?", tt.historico(1));
	}

	@Test
	void testListaOriginais() {
		tt.transforma("Clean", "Ola, tudo bem?");
		tt.transforma("CleanSpaces", "como vai voce?");

		assertEquals(true, tt.listaOriginais().contains("Ola, tudo bem?"));
		assertEquals(true, tt.listaOriginais().contains("como vai voce?"));
	}

}
