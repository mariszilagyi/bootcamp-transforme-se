package outros_exercicios.lista_conceitos_iniciais;

import java.util.Scanner;

public class Atividade8 {

/*    Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e
    escrever o nome e a m�dia. Vari�veis utilizadas: NOME, N1, N2, N3, MEDIA.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();
/*        System.out.print("\n");*/
        System.out.println("Digite a nota 1: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = scan.nextDouble();
        System.out.println("Digite a nota 3: ");
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3)/3;
        System.out.println("Aluno: " + nome + "\nM�dia: " +String.format("%.2f", media ));
    }

}
