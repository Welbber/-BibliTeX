package algoritmos;

/**
 * 
 * transforma o texto removendo os sinais de pontuação
 *
 */
public class Clean implements AlgoritmoTransformacao {

	private String nome;

	public Clean() {
		this.nome = "Cleans";
	}

	public Clean(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {
		return campo.replaceAll("\\p{Punct}", "");
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
