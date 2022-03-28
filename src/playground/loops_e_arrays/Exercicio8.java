package playground.loops_e_arrays;

import java.util.Scanner;

public class Exercicio8 {
	
	/*
	 * Faça um programa que leia o número de termos, determine e mostre os valores
	 * de acordo com a série abaixo: Série: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189,
	 * 192, 32, 567, 768, 64, ...
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1 = 2;
		int numero2 = 7;
		int numero3 = 3;
		System.out.println("Digite o números de termos a exibir: ");
		int termos = scan.nextInt();
		int contador = 1;
		
		while(contador <= termos) {
			System.out.println("Termo nº " + contador + ": " + numero1);
			numero1 *= 2;
			contador ++;
			
			if(contador <= termos) {
				System.out.println("Termo nº " + contador + ": " + numero2);
				numero2 *= 3;
				contador ++;	
			}
			
			if(contador <= termos) {
				System.out.println("Termo nº " + contador + ": " + numero3);
				numero3 *= 4;
				contador ++;	
			}	
		}
		
	}

}
