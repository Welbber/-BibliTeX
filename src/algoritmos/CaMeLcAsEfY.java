package algoritmos;

/**
 * Classe que transforma o texto de modo que os caracteres nas posições pares
 * ficam em caixa alta (maiúsculas) e nas posições impares, em caixa baixa
 * (minúsculas)
 */
public class CaMeLcAsEfY implements AlgoritmoTransformacao {

	String nome;

	public CaMeLcAsEfY() {
		this.nome = "CaMeLcAsEfY";
	}

	public CaMeLcAsEfY(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {
		String resultado = "";
		int cont = 0;
		for (Character letra : campo.toCharArray()) {
			if (cont % 2 == 0) {
				resultado += letra.toString().toUpperCase();
			} else {
				resultado += letra.toString().toLowerCase();
			}
			cont++;
		}

		return resultado;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(AlgoritmoTransformacao o) {
		return this.nome.compareTo(o.getNome());
	}

}
