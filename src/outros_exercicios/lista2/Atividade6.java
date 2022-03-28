package outros_exercicios.lista2;

public class Atividade6 {

/*
    Escreva um array de números e devolve a posição onde se encontra o maior valor do
    array.
*/

    public static void main(String[] args) {

        int[] numeros = {-3, 3, -4, -5, 7, -10, 11, -13, -14};
        int posicaoMaiorNumero = 0;
        int maiorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaiorNumero = i;
            }
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nPosição do maior número: " + posicaoMaiorNumero);
        System.out.println("Maior número: " + maiorNumero);

    }
}
