package logger;

/**
 * metodo que informa o tempo que ele foi instanciado para a execucao do metodo
 * log
 * 
 * 
 *
 */
public class TimeConsoleLogger implements LogSystem {

	private long tempoInicio;

	public TimeConsoleLogger() {
		this.tempoInicio = System.currentTimeMillis();
	}

	@Override
	public void log(Object... msg) {
		System.out.println(String.format("[%s - %dms]", msg[0].toString(), tempoInicio - System.currentTimeMillis()));
	}

}
