package logger;

/**
 * Interface que define como os Logs devem ter de padrao
 *
 */
public interface LogSystem {
	/**
	 * metodo que registra a informacao passada pelo parametro
	 * 
	 * @param msg array de parametros que seram registrados de acordo com o
	 *            algoritmo
	 */
	public void log(Object... msg);

}