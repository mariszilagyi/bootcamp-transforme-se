package outros_exercicios.lista_conceitos_iniciais;	

import java.util.Scanner;

public class Atividade9 {

/*    Fa�a um programa para ler o nome, departamento e o sal�rio de um funcion�rio.
    Calcular e informar um abono de 10% (dez por cento) sobre o sal�rio e, ainda, o novo
    sal�rio acrescido do abono.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do funcion�rio:");
        String nome = scan.nextLine();
        System.out.println("Informe o departamento do funcion�rio:");
        String departamento = scan.nextLine();
        System.out.println("Informe o sal�rio do funcion�rio:");
        double salario = scan.nextDouble();

        double abono = salario * 0.10;
        double salarioComAbono = salario + abono;

        System.out.println("Funcion�rio: " + nome + "\nAbono: " + abono + "\nSal�rio Total: " + salarioComAbono);

    }
}
