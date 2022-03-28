package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade13 {

/*    Fa�a um Programa que obtenha o sal�rio-base e o n�mero de dependentes de um
    funcion�rio e informe o sal�rio bruto (igual ao sal�rio-base + R$ 100,00 por
    dependente), e o sal�rio l�quido, sabendo-se que o desconto para o INSS � de 10%
    sobre o sal�rio-base.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o sal�rio base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("Informe o n�mero de dependentes: ");
        int dependentes = scan.nextInt();
        double valorPorDependente = 100;
        double salarioBruto = salarioBase + (dependentes * valorPorDependente);
        double inss = salarioBase * 0.10;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("Sal�rio Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Sal�rio L�quido: R$ " + String.format("%.2f", salarioLiquido));

    }
}
