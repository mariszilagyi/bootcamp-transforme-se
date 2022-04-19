package playground.loops_e_arrays.exercicioslista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

//	Realize um programa que pe�a uma nota de 0 e 10. Mostre uma mensagem caso o
//	valor seja inv�lido e continue pedindo caso o valor seja v�lido.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> lista1 = new ArrayList<>();

		int n = 0;
		System.out.println("Digite n�meros de 0 a 10: ");
		while (n >= 0 && n <= 10) {
			n = scan.nextInt();
			
			if (n < 0 || n > 10) {
				System.out.println("N�mero inv�lido");
				break;
				
			} else lista1.add(n);		
		}

		System.out.println(lista1);

	}

}
