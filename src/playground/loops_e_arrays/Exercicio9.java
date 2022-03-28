package playground.loops_e_arrays;

public class Exercicio9 {
	
	/*
	 * Fa�a um programa que calcule a soma dos primeiros 50 n�meros pares. Esse
	 * programa n�o recebe valor. Os primeiros n�meros pares s�o 2, 4, 6, ...
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
		
		System.out.println("Soma dos n�meros pares at� 50: " + somaDosNumerosPares);
	}
}
