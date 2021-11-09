package algoritmos;

/**
 * 
 * transforma o texto removendo os espacos
 *
 */
public class CleanSpaces implements AlgoritmoTransformacao {

	String nome;

	public CleanSpaces() {
		this.nome = "Clean Spaces";
	}

	public CleanSpaces(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {

		return campo.replace(" ", "");
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
