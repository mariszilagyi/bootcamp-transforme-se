package playground.loops_e_arrays;

public class Exercicio9 {
	
	/*
	 * Faça um programa que calcule a soma dos primeiros 50 números pares. Esse
	 * programa não recebe valor. Os primeiros números pares são 2, 4, 6, ...
	 */
	
	public static void main(String[] args) {
		
		int somaDosNumerosPares = 0;
		int contadorDePares = 0;
		int sequencial = 1;
		
		while(contadorDePares < 50) {
			
			if(sequencial % 2 == 0) {
				somaDosNumerosPares += sequencial;
				contadorDePares++;
			}
			
			sequencial++;
		}
		
		System.out.println("Soma dos números pares até 50: " + somaDosNumerosPares);
	}
}
