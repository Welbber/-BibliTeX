package logger;

public class ConsoleLogger implements LogSystem {

	@Override
	public void log(Object... msg) {
		if (msg.length == 1)
			System.out.println(String.format("[%s]", msg[0].toString()));
		else
			System.out.println(String.format("[%s] %s", msg[0].toString(), msg[1].toString()));
	}

}
