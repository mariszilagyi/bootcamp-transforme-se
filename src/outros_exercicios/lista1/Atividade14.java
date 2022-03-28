package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade14 {

/*    Fa�a um Programa que calcule a quantidade necess�ria de tinta e o n�mero de latas,
    para pintar uma parede de Xm de largura por Ym de altura. Considere que o consumo
    de tinta � de 3 litros por metro quadrado e a quantidade de tinta por lata � de 2
    litros.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Largura da Parede: ");
        double largura = scan.nextDouble();
        System.out.println("Altura da Parede: ");
        double altura = scan.nextDouble();
        int consumo = 3;
        int litrosPorLata = 2;
        double quantidadeDeTintaNecessaria = (largura * altura) * consumo;
        int latasDeTinta = (int) quantidadeDeTintaNecessaria / litrosPorLata;

        if(quantidadeDeTintaNecessaria % litrosPorLata != 0){
            latasDeTinta += 1;
        }

        System.out.println("Quantidade de tinta necess�ria: " + quantidadeDeTintaNecessaria + " litros");
        System.out.println("Quantidade de latas necess�rias: " + latasDeTinta + " latas.");

    }

}