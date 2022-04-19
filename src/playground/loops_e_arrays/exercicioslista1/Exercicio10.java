package playground.loops_e_arrays.exercicioslista1;

import java.util.Scanner;

public class Exercicio10 {
	
	/*
	 * Faça um programa que receba um número inteiro maior que 1 e verifique se o
	 * número é primo ou não. Mostrar mensagem de um número primo ou de um número
	 * não primo.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro maior que 1: ");
		int numero = scan.nextInt();
		boolean numeroEPrimo = true;
		
		
		for(int i = 2; i < numero; i++) {
			
			if (numero % i == 0) numeroEPrimo = false;
		}
		
		if(numeroEPrimo) System.out.println("Número " + numero + " é um número primo.");
		else System.out.println("Número " + numero + " não é um número primo.");
	}
}
