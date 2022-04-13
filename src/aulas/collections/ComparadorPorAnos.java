package aulas.collections;

import java.util.Comparator;

public class ComparadorPorAnos implements Comparator<Carro> {

	@Override
	public int compare(Carro carro1, Carro carro2) {
		return Integer.compare(carro1.getAno(), carro2.getAno());
	}

}
