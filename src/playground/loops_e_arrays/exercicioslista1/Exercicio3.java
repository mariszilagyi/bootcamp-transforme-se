package playground.loops_e_arrays.exercicioslista1;

import java.util.Scanner;

public class Exercicio3 {
	
	/*
	 * Faça um programa que leia um número N e que indique quantos valores inteiros
	 * e positivos devem ser lidos a seguir. Para cada número lido, mostre uma
	 * tabela contendo o valor lido e o fatorial desse valor.
	 */

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos núemeros serão lidos: ");
		int N = scan.nextInt();
		int numero = 0;
		
				
		for(int i = 1; i <= N; i++) {
			System.out.println("Digito um número inteiro e positivo: ");
			numero = scan.nextInt();
			int fatorial = 1;
			System.out.println("Valor lido\t|Fatorial (!)");
			for(int j = 1; j <= numero; j++) {
				fatorial  *= j;
				
			}
			System.out.println(numero + "\t\t|" + fatorial);
			
		}
		
	}
}
