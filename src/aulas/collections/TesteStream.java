package aulas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream {
	
	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>(Arrays.asList("Maria", "João", "Antonio", "Ruy", "Pedro", "Ana"));
		
		//imprime todos os dados
		System.out.println("Lista de alunos");
		estudantes.stream().forEach(System.out::println);
		
		//contador
		System.out.println("Total de estudantes da lista: " + estudantes.stream().count());
		
		//saber qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		//saber todos os nomes que contem a letra R
		System.out.println("Menor nome: " + estudantes.stream()
				.filter((estudante) -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.toList())
				);
		
		//exibe os n primeiros valores da collection
		System.out.println("Os primeiros 3 itens " + estudantes.stream()
				.limit(3)
				.collect(Collectors.toList())
				);
		
		
		//retorna um valor booleano de acordo com o criterio de busca
		System.out.println("Possui  a letra q em todos os nomes? " + estudantes.stream()
				.allMatch((elemento) -> elemento.contains("q"))	
				);
		
		
		//retorna um valor booleano de acordo com o criterio de busca
		System.out.println("Possui  a letra q em algum dos nomes? " + estudantes.stream()
				.anyMatch((elemento) -> elemento.contains("a"))	
				);
		
		
		//retorna um valor booleano de acordo com o criterio de busca
		System.out.println("Ninguém possui a letra w no nome? " + estudantes.stream()
				.noneMatch((elemento) -> elemento.contains("w"))	
				);
		
		//retorna uma nova coleção com o tamanho de cada nome
		System.out.println("Nova coleção com tamanho: " + estudantes.stream()
				.map((estudante) -> estudante.concat("-").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList())
				);
		
		
			
			
			
		
	}

}
