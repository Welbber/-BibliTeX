package algoritmos;

import java.util.Comparator;

public class ComparatorAlgoritmo implements Comparator<AlgoritmoTransformacao> {

	@Override
	public int compare(AlgoritmoTransformacao o1, AlgoritmoTransformacao o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
