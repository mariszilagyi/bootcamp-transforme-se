package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade13 {

/*    Faça um Programa que obtenha o salário-base e o número de dependentes de um
    funcionário e informe o salário bruto (igual ao salário-base + R$ 100,00 por
    dependente), e o salário líquido, sabendo-se que o desconto para o INSS é de 10%
    sobre o salário-base.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        int dependentes = scan.nextInt();
        double valorPorDependente = 100;
        double salarioBruto = salarioBase + (dependentes * valorPorDependente);
        double inss = salarioBase * 0.10;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

    }
}
