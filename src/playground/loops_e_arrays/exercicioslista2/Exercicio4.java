package playground.loops_e_arrays.exercicioslista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
	
//	Escreva um programa em Java que leia dois números inteiros e determine qual é o
//	menor. Escreva um algoritmo que determina o maior também.
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		System.out.println("Digite dois números inteiros: ");
		lista.add(scan.nextInt());
		lista.add(scan.nextInt());
		
		System.out.println("Menor número da lista:");
		System.out.println(Collections.min(lista));
		System.out.println("Maior número da lista:");
		System.out.println(Collections.max(lista));
		
	}

	
	
	

}
