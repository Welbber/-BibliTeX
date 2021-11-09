package algoritmos;

/**
 * 
 * transforma o texto substituindo o caractere de interrogação (?) pelo
 * caractere de ponto
 *
 */
public class ConverteInterrogacoesParaPontos implements AlgoritmoTransformacao {

	String nome;

	public ConverteInterrogacoesParaPontos() {
		this.nome = "Interrogacoes Para Pontos";
	}

	public ConverteInterrogacoesParaPontos(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {
		return campo.replace("?", ".");
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
