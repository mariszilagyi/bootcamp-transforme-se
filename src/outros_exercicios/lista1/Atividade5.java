package outros_exercicios.lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atividade5 {

    /* Escreva um programa que, dados três números, informe o maior e o menor.*/

    public static void main(String[] args) {

        int[] numeros = {1, 100, 35};

        int maiorNumero = 0;
        for (int numero : numeros) if (numero > maiorNumero) maiorNumero = numero;

        int menorNumero = maiorNumero;
        for (int numero : numeros) if (numero < menorNumero) menorNumero = numero;

        System.out.println(maiorNumero);
        System.out.println(menorNumero);


        List<Integer> numeros2 = new ArrayList<Integer>();

        numeros2.add(1);
        numeros2.add(100);
        numeros2.add(35);

        System.out.println(Collections.max(numeros2));
        System.out.println(Collections.min(numeros2));

    }
}
