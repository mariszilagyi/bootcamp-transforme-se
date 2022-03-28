package playground.loops_e_arrays;

import java.util.Scanner;

public class Exercicio4 {
	
	/*
	 * Faça um programa que leia cinco pares de valores (a,b) todos inteiros e
	 * positivos, um de cada vez. Mostre os números inteiros pares de a até b
	 * (inclusive).
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Dígite dois números inteiros e positivos (" + i + "º par): ");
			a = scan.nextInt();
			b = scan.nextInt();
			int pares = 0;
			System.out.println("Números pares de " + a + " até " + b + ": ");
			if(b < a)System.out.println("Não há nenhum número par de " + a + " até " + b + ".");
			
			for(int j = a; j <= b; j++) {

				if(j % 2 ==0) System.out.println(j);
			}
			
		}
				
	}

}
