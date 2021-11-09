package logger;

import java.util.HashMap;
import java.util.Map;

import algoritmos.Clean;

/**
 * 
 * Log que registra as execucoes de metodos e salva em um Map
 *
 */
public class ContagemLogger implements LogSystem {

	private Map<String, Integer> contagemExecucoes;

	Object joao = new Clean();

	public ContagemLogger() {
		this.contagemExecucoes = new HashMap<>();
	}

	@Override
	public void log(Object... msg) {
		int cont = 1;
		if (contagemExecucoes.containsKey(msg[0].toString())) {
			cont = this.contagemExecucoes.get(msg[0].toString()) + 1;
		}
		this.contagemExecucoes.put(msg[0].toString(), cont);

	}

	public String toString() {
		String resultado = "";

		for (var contagem : contagemExecucoes.entrySet()) {
			resultado += String.format("%s - %d\n", contagem.getKey(), contagem.getValue());
		}

		return resultado;
	}
}
