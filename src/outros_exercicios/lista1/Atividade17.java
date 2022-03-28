package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade17 {

/*    Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
      programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
            • Para homens: (72.7 * altura) – 58;
            • Para mulheres: (62.1 * altura) – 44.7;*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura do paciente: ");
        double altura = scan.nextDouble();

        String sexo = null;

        do {
            System.out.println("Digite o sexo do paciente (F/M): (F = feminimo e M = Masculino)");
            sexo = scan.next();
        } while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        double pesoIdeal = sexo.equalsIgnoreCase("f") ? (62.1 * altura) - 44.7 : (72.1 * altura) - 58;

        System.out.println("Peso ideal: " + String.format("%.3f", pesoIdeal) + "kg.");
    }
}