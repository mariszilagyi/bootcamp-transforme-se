package playground.collection.exercicios.exercicio4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GuardaVolumes {
	
	private Map<Integer, List<Peca>> dicionarioDePecas = new HashMap<>();
	private static int contador = 1;
	
	public Integer guardarPecas(List<Peca> listaDePeca) {
		
		this.dicionarioDePecas.put(contador++, listaDePeca);
		return contador;
	}
	
	public void mostrarPecas() {
		for (Entry<Integer, List<Peca>> peca : dicionarioDePecas.entrySet()) {
			System.out.println("Código: " + peca.getKey() + " - "+ peca.getValue().toString());
		}
	}
	
	public void mostrarPecas(Integer numero) {
		System.out.println("Código: " + numero + " - "+ dicionarioDePecas.get(numero));
	}
	
	public void devolverPecas(Integer numero) {
		dicionarioDePecas.remove(numero);
	}

	

}
