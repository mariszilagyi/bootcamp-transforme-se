package playground.loops_e_arrays.exercicioslista1;

public class Exercicio7 {
	
	/*
	 * Faça um programa que monte os oito primeiros termos da sequência de
	 * Fibonacci.
	 */
	
	
	public static void main(String[] args) {
		
		int fibonacci = 0;
		int numero1 = 0;
		int numero2 = 1;
		

		for(int i = 1; i <= 20; i++) {
			
			System.out.println((i) + "º :" + fibonacci);			
			fibonacci = numero1 + numero2;
			numero2 = numero1;
			numero1 = fibonacci;			
		}
		
	}

}
