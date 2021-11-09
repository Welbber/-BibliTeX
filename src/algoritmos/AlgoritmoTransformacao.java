package algoritmos;

/**
 * Interface que extende da interface Comparable, garantindo a implemtentacao
 * dos metodos compareTo
 * 
 * @author Welbber
 *
 */
public interface AlgoritmoTransformacao extends Comparable<AlgoritmoTransformacao> {
	/**
	 * metodo que realizara a transformacao do texto informado no parametro String
	 * 
	 * @param - campo texto a ser transformado
	 * @return - texto formatado
	 */
	public String transforma(String campo);

	/**
	 * retorna Nome do algortimo
	 * 
	 * @return nome algoritmo
	 */
	public String getNome();
}
