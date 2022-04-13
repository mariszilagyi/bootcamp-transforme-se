package aulas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteLista {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Audi X1", 2022, "branco", "2.2");
		Carro carro2 = new Carro("Gol", 2010, "vermelho", "1.0");
		Carro carro3 = new Carro("Corolla", 2018, "cinza", "2.0");

		
		List<Carro> meusCarros = new ArrayList<>(Arrays.asList(carro1, carro2));
		
		meusCarros.add(carro3);
		meusCarros.add(new Carro("Fusca", 1975, "azul", "1.0"));
		
		for(Carro carro : meusCarros) {
			System.out.println("_________________\n\n" + carro.toString());
			
		}
		
		System.out.println(meusCarros.contains(new Carro("Fusca", 1975, "azul", "1.0")));
		
		//sort() => Comparable => compareTo() => somente Strings
		
		Collections.sort(meusCarros);
		System.out.println("\n\nOrdenado por modelo");
		System.out.println(meusCarros.toString());
		
		//Collections.sort(meusCarros, new ComparadorPorAnos());
		meusCarros.sort(new ComparadorPorAnos());
		System.out.println("\n\nOrdenado por ano");
		System.out.println(meusCarros.toString());
		
		
	}
	

}
