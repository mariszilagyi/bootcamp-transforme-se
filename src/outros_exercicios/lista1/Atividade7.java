package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade7 {

/*    Faça um programa que leia dois números inteiros e escreva a soma entre eles.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroA = scan.nextInt();
        int numeroB = scan.nextInt();

        int soma = numeroA + numeroB;

        System.out.println(soma);
    }
}