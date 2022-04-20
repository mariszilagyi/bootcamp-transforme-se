package outros_exercicios.lista_conceitos_iniciais;	

import java.util.Scanner;

public class Atividade9 {

/*    Faça um programa para ler o nome, departamento e o salário de um funcionário.
    Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo
    salário acrescido do abono.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scan.nextLine();
        System.out.println("Informe o departamento do funcionário:");
        String departamento = scan.nextLine();
        System.out.println("Informe o salário do funcionário:");
        double salario = scan.nextDouble();

        double abono = salario * 0.10;
        double salarioComAbono = salario + abono;

        System.out.println("Funcionário: " + nome + "\nAbono: " + abono + "\nSalário Total: " + salarioComAbono);

    }
}
