package outros_exercicios.lista_arrays;

public class Atividade7 {

/*    Crie um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os
    pares por +1.*/

    public static void main(String[] args) {

        int[] inteirosPositivos = {1, 2, 6, 4, 5, 1, 10, 3, 4, 7, 8, 9};
        System.out.println("Array original:");
        for (int inteiroPositivo: inteirosPositivos){
            System.out.print(inteiroPositivo + " ");
        }
        System.out.println("\nArray alterado:");
        for (int inteiroPositivo: inteirosPositivos){
            if(inteiroPositivo % 2 == 0) inteiroPositivo = 1;
            else inteiroPositivo = -1;

            System.out.print(inteiroPositivo + " ");
        }

    }
}