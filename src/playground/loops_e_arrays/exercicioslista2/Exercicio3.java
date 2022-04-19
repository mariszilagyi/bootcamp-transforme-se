package playground.loops_e_arrays.exercicioslista2;

public class Exercicio3 {
	
//	Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.
	
	
	public static void main(String[] args) {
		
		int somaNumero = 0;
		
		for(int i = 1; i <=100; i++) {
			somaNumero += i;
		}
		
		System.out.println(somaNumero);
	}

}
