package playground.loops_e_arrays.exercicioslista2;

import java.util.Scanner;

public class Exercicio5 {

//	Implemente o programa da calculadora utilizando uma instru��o switch-case para
//	determinar a opera��o que deve ser executada, conforme o usu�rio escolhe no menu
//	de op��es. Conforme a op��o escolhida pelo usu�rio, um diferente m�todo da
//	calculadora � executado. Por exemplo: digamos que a op��o esteja associada ao
//	m�todo somar(op1, op2), ent�o ser� executado este m�todo da calculadora, e o
//	resultado obtido ser� a soma dos operandos 1 e 2.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;
		int opcao;

		System.out.println(
				"Escolha: \nPara Somar digite: 1\nPara Subtrair digite: 2\nPara Dividir digite: 3\nPara Multiplicar digite: 4");
		opcao = scan.nextInt();
		System.out.println("Escolha o primeiro n�mero:");
		numero1 = scan.nextInt();
		System.out.println("Escolha o segundo n�mero:");
		numero2 = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Resultado da soma = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("Resultado da subtra��o = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("Resultado da divis�o = " + (numero1 / numero2));
			break;
		case 4:
			System.out.println("Resultado da multiplica��o = " + (numero1 * numero2));
			break;

		}

	}

}
