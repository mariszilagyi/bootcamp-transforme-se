package playground.loops_e_arrays;

import java.util.Scanner;

public class Exercicio4 {
	
	/*
	 * Fa�a um programa que leia cinco pares de valores (a,b) todos inteiros e
	 * positivos, um de cada vez. Mostre os n�meros inteiros pares de a at� b
	 * (inclusive).
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("D�gite dois n�meros inteiros e positivos (" + i + "� par): ");
			a = scan.nextInt();
			b = scan.nextInt();
			int pares = 0;
			System.out.println("N�meros pares de " + a + " at� " + b + ": ");
			if(b < a)System.out.println("N�o h� nenhum n�mero par de " + a + " at� " + b + ".");
			
			for(int j = a; j <= b; j++) {

				if(j % 2 ==0) System.out.println(j);
			}
			
		}
				
	}

}
