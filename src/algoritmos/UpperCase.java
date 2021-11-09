package algoritmos;

/**
 * 
 * Algoritmo que transforma texto para que todas as letras sejam maiusculas
 *
 */
public class UpperCase implements AlgoritmoTransformacao {

	private String nome;

	public UpperCase() {
		this.nome = "UPPER CASE";
	}

	public UpperCase(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {
		return campo.toUpperCase();
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