package outros_exercicios.lista1;

public class Atividade2 {

/*    Faça um programa que calcule o resto da divisão inteira entre dois números dados.
    Exemplo: se dividirmos 25 por 4, temos resto=1*/

    public static void main(String[] args) {
        int numeroA = 25;
        int numeroB = 4;

        int resto = numeroA % numeroB;

        System.out.println("O resto da divisão de " + numeroA + " por " + numeroB + " = " + resto);
    }

}