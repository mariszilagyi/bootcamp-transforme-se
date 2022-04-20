package outros_exercicios.lista_arrays;

public class Atividade5 {

/*    Escreva um array de inteiros a e devolve um array de boolean onde, cada posição
    indique true se o elemento da posição correspondente de a é positivo e false caso seja
    negativo ou zero.*/

    public static void main(String[] args) {

        int[] inteiros = {-3, 3, -4, -5, 7, -10, 11, -13, -14};
        boolean[] booleanos = new boolean[inteiros.length];

        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] <= 0) booleanos[i] = false;
            else booleanos[i] = true;

            System.out.println("Posição " + i + ": " + inteiros[i] + "\t" + booleanos[i]);
        }
    }
}