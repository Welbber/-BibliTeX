package algoritmos;

/**
 * 
 * Algoritmo que transforma um texto separando as letras com um espaco caso elas
 * estejam juntas
 *
 */
public class InsertSpaces implements AlgoritmoTransformacao {

	private String nome;

	public InsertSpaces() {
		this.nome = "Insert Spaces";
	}

	public InsertSpaces(String nome) {
		this.nome = nome;
	}

	@Override
	public String transforma(String campo) {
		String resultado = "";
		if (!campo.substring(0, 1).equals(" "))
			resultado = campo.substring(0, 1);

		for (int i = 1; i < campo.length(); i++) {
			if (!campo.substring(i, i + 1).equals(" ")) {
				resultado += " ";
				resultado += campo.substring(i, i + 1);
			}

		}
		campo.substring(campo.length() - 1);
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
