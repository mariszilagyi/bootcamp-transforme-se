package aulas.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaSets {
	
	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7.5,8.9,10.0,5.5,3.1));
		notas.add(7.5);
		System.out.println(notas);
		
		System.out.println(Collections.max(notas));
		System.out.println(Collections.min(notas));
		
		double soma = 0;
		for(Double nota : notas) {
			soma += nota;
		}
		
		
		System.out.println("Média das notas: " + (soma/notas.size()));
	}

}
