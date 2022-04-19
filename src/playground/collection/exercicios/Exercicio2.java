package playground.collection.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

	/*
	 * Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos
	 * à lista vazia: 1,5,5,6,7,8,8,8.
	 * 
	 * 
	 * Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos
	 * ao conjunto vazio: 1,5,5,6,7,8,8,8.
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(5);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(8);
		lista.add(8);
		
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(8);
		conjunto.add(8);

		System.out.println("IMPRESSÃO DA LISTA"); 
		System.out.println(lista);
		
		System.out.println("IMPRESSÃO DO CONJUNTO"); 
		System.out.println(conjunto);

	}

}