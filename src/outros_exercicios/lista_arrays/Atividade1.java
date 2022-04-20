package outros_exercicios.lista_arrays;

public class Atividade1 {

/*    Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
    preencha um array com os valores:
    a) 10 9 8 7 6 5 4 3 2 1
    b) 0 1 4 9 16 25 36 49 64 81 100
    c) 1 2 3 4 5 10 20 30 40 50*/

    public static void main(String[] args) {

        int[] numeros1 = new int[10];
        int[] numeros2 = new int[11];
        int[] numeros3 = new int[10];
        int x = 0;


        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = 10 - i;
            System.out.print(numeros1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = i * i;
            System.out.print(numeros2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numeros3.length; i++) {
            if (i >= 5) {
                x = x + 10;
                numeros3[i] = x;
            } else {
                numeros3[i] = i + 1;
            }

            System.out.print(numeros3[i] + " ");
        }

    }

}
