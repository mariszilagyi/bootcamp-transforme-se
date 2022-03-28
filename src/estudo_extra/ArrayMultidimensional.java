package estudo_extra;

import java.util.Arrays;
import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        Random numAleatorio = new Random();

        int linhas = 3;
        int colunas = 5;
        int[][] arrayMultidimensional = new int[linhas][colunas];



        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                arrayMultidimensional[i][j] = numAleatorio.nextInt(1001);
            }
        }

        System.out.println(arrayMultidimensional.length);
        System.out.println(Arrays.deepToString(arrayMultidimensional));
        for (int[] arraysimples: arrayMultidimensional) {
            for (int array: arraysimples){
                System.out.println(array);
            }

        }



    }
}
