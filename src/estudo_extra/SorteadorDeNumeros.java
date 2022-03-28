package estudo_extra;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SorteadorDeNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random sorteador = new Random();
        Set<Integer> sorteadorMegaSena = new HashSet<>();
        System.out.println("Digite a quantidade de n�meros que deseja sortear: ");
        int qntdNumeros = scan.nextInt();

        System.out.println("Digite at� qual n�mero deseja incluir no sorteio: (Exemplo = Se deseja sortear n�meros de 1 a 20 digite 20) ");
        int limiteNumero = scan.nextInt();

        while (sorteadorMegaSena.size() < qntdNumeros) {
            sorteadorMegaSena.add(sorteador.nextInt(limiteNumero + 1));
        }

        System.out.println(sorteadorMegaSena);

    }

}
