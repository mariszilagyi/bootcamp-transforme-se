package playground.loops_e_arrays.exercicioslista1;

import java.util.Scanner;

public class Exercicio10 {
	
	/*
	 * Fa�a um programa que receba um n�mero inteiro maior que 1 e verifique se o
	 * n�mero � primo ou n�o. Mostrar mensagem de um n�mero primo ou de um n�mero
	 * n�o primo.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro maior que 1: ");
		int numero = scan.nextInt();
		boolean numeroEPrimo = true;
		
		
		for(int i = 2; i < numero; i++) {
			
			if (numero % i == 0) numeroEPrimo = false;
		}
		
		if(numeroEPrimo) System.out.println("N�mero " + numero + " � um n�mero primo.");
		else System.out.println("N�mero " + numero + " n�o � um n�mero primo.");
	}
}
