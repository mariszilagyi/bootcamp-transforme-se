package outros_exercicios.lista2;

public class Atividade6 {

/*
    Escreva um array de n�meros e devolve a posi��o onde se encontra o maior valor do
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
        System.out.println("\nPosi��o do maior n�mero: " + posicaoMaiorNumero);
        System.out.println("Maior n�mero: " + maiorNumero);

    }
}
