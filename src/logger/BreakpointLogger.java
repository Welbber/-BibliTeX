package logger;

/**
 * 
 * Metodo que informa quando um metodo é invocado atraves do nome informado no
 * construtor e recebido como parametro no metodo log
 *
 */
public class BreakpointLogger implements LogSystem {

	String nomeMetodo;

	public BreakpointLogger(String nomeMetodo) {
		this.nomeMetodo = nomeMetodo;
	}

	@Override
	public void log(Object... msg) {
		if (msg[0].equals(this.nomeMetodo)) {
			if (msg.length == 1)
				System.out.println(String.format("[%s - INVOCADO]", msg[0].toString()));
			else
				System.out.println(String.format("[%s - INVOCADO] %s", msg[0].toString(), msg[1].toString()));
		}
	}

}
