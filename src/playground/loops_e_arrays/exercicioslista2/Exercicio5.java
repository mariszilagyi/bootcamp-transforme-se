package playground.loops_e_arrays.exercicioslista2;

import java.util.Scanner;

public class Exercicio5 {

//	Implemente o programa da calculadora utilizando uma instrução switch-case para
//	determinar a operação que deve ser executada, conforme o usuário escolhe no menu
//	de opções. Conforme a opção escolhida pelo usuário, um diferente método da
//	calculadora é executado. Por exemplo: digamos que a opção esteja associada ao
//	método somar(op1, op2), então será executado este método da calculadora, e o
//	resultado obtido será a soma dos operandos 1 e 2.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;
		int opcao;

		System.out.println(
				"Escolha: \nPara Somar digite: 1\nPara Subtrair digite: 2\nPara Dividir digite: 3\nPara Multiplicar digite: 4");
		opcao = scan.nextInt();
		System.out.println("Escolha o primeiro número:");
		numero1 = scan.nextInt();
		System.out.println("Escolha o segundo número:");
		numero2 = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Resultado da soma = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("Resultado da subtração = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("Resultado da divisão = " + (numero1 / numero2));
			break;
		case 4:
			System.out.println("Resultado da multiplicação = " + (numero1 * numero2));
			break;

		}

	}

}
