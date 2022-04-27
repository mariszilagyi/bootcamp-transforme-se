package estudo_extra;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SorteadorMegaSena {
    public static void main(String[] args) {
        Random sorteador = new Random();
        Set<Integer> sorteadorMegaSena = new HashSet<>();
        int qntdNumeros = 6;

        while (sorteadorMegaSena.size() < qntdNumeros) {
            sorteadorMegaSena.add((sorteador.nextInt(60))+1);
        }

        System.out.println(sorteadorMegaSena);

    }

}
