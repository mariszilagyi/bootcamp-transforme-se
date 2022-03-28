package estudo_extra;

import java.util.Random;
import java.util.Scanner;

public class ArraySimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random sorteador = new Random();

/*        String[] testes = {"teste1", "teste2", "teste3"};*/

        int[] testes2 = new int[scan.nextInt()];

        for(int i = 0; i < testes2.length; i++){
            testes2[i] = sorteador.nextInt(61);
        }


        for (int teste2:testes2) {
            System.out.println(teste2);
        }



    }

}
