package playground.loops_e_arrays.exercicioslista1;

import java.util.Scanner;

public class Exercicio3 {
	
	/*
	 * Fa�a um programa que leia um n�mero N e que indique quantos valores inteiros
	 * e positivos devem ser lidos a seguir. Para cada n�mero lido, mostre uma
	 * tabela contendo o valor lido e o fatorial desse valor.
	 */

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos n�emeros ser�o lidos: ");
		int N = scan.nextInt();
		int numero = 0;
		
				
		for(int i = 1; i <= N; i++) {
			System.out.println("Digito um n�mero inteiro e positivo: ");
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
