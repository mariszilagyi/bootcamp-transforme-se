package outros_exercicios.lista1;

public class Atividade2 {

/*    Fa�a um programa que calcule o resto da divis�o inteira entre dois n�meros dados.
    Exemplo: se dividirmos 25 por 4, temos resto=1*/

    public static void main(String[] args) {
        int numeroA = 25;
        int numeroB = 4;

        int resto = numeroA % numeroB;

        System.out.println("O resto da divis�o de " + numeroA + " por " + numeroB + " = " + resto);
    }

}