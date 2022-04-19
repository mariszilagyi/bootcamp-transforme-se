package playground.loops_e_arrays.exercicioslista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

//	Realize um programa que peça uma nota de 0 e 10. Mostre uma mensagem caso o
//	valor seja inválido e continue pedindo caso o valor seja válido.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> lista1 = new ArrayList<>();

		int n = 0;
		System.out.println("Digite números de 0 a 10: ");
		while (n >= 0 && n <= 10) {
			n = scan.nextInt();
			
			if (n < 0 || n > 10) {
				System.out.println("Número inválido");
				break;
				
			} else lista1.add(n);		
		}

		System.out.println(lista1);

	}

}
