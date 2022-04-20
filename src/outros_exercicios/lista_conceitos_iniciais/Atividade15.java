package outros_exercicios.lista_conceitos_iniciais;

public class Atividade15 {

/*    Considerando que A = 5, B = 8 e C = 10, calcule e imprima o valor das seguintes
    expressões:
            • Y = X * A
            • X = A + (2 * B) / (C - 6)*/

    public static void main(String[] args) {

        int A = 5;
        int B = 8;
        int C = 10;

        int X = A + (2 * B) / (C - 6);
        int Y = X * A;

        System.out.println(" X = A + (2 * B) / (C - 6) = " + X);
        System.out.println(" Y = X * A = " + Y);

    }



}