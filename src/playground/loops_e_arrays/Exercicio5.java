package playground.loops_e_arrays;

import java.util.Scanner;

public class Exercicio5 {
	
	/*
	 * Fa�a um programa que leia dez conjuntos de dois valores, o primeiro
	 * representando o n�mero do aluno e o segundo representando a sua altura em
	 * cent�metros. Encontre o aluno mais alto e o mais baixo. Mostre o n�mero do
	 * aluno mais baixo, junto com suas alturas.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int alturaMaisBaixo = 300;
		int alturaMaisAlto = 0;
		int numeroMaisBaixo = 0;
		int numeroMaisAlto = 0;
		
		System.out.println("DIgite as informa��es de 10 alunos: ");
		for(int i = 1; i <= 10; i++) {
			System.out.println("N�mero do aluno " + i + ": ");
			int numeroAluno = scan.nextInt();
			System.out.println("Altura do aluno " + i + "(em cent�metros: ");
			int alturaAluno = scan.nextInt();
			
			
			if(alturaAluno > alturaMaisAlto) {
				alturaMaisAlto = alturaAluno;
				numeroMaisAlto = numeroAluno;
			}
			
			if(alturaAluno < alturaMaisBaixo) {
				alturaMaisBaixo = alturaAluno;
				numeroMaisBaixo = numeroAluno;
			}
			
		}
		
		System.out.println("O Aluno mais alto � o n�mero " + numeroMaisAlto + " e ele tem " + alturaMaisAlto + " cent�metros.");
		System.out.println("O Aluno mais baixo � o n�mero " + numeroMaisBaixo + " e ele tem " + alturaMaisBaixo + " cent�metros.");
		
	}
	
}
	
	
	
	
