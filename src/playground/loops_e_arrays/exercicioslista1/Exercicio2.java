package playground.loops_e_arrays.exercicioslista1;

import java.util.Scanner;

public class Exercicio2 {
	
	/*
	 * Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o
	 * valor de E, conforme a fórmula a seguir: 
	 * 
	 * E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1 + N!
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e positivo: ");
		int N = scan.nextInt();
		int fatorial = 1;
		int E = 0;
		
		for(int i = 1; i <= N; i++) {
			
			fatorial *= i;
			E += 1 + fatorial; 
			System.out.println(i + ": " + fatorial);
			System.out.println(i + ": " + E);

		}
		
		System.out.println(E);
		
		
		
		
	}
	

}
