package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade18 {

/*    Elabore um programa que, dada a idade de um nadador, classifique-o em uma das
    seguintes categorias:
            • Infantil A = 5 – 7 anos
            • Infantil B = 8 – 10 anos
            • Juvenil A = 11 – 13 anos
            • Juvenil B = 14 – 17 anos
            • Sênior = maiores de 18 anos*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scan.nextInt();

        String categoria = null;

        if (idade >= 5 && idade <= 7) categoria = "Infantil A";
        else if (idade >= 8 && idade <= 10)categoria = "Infantil B";
        else if (idade >= 11 && idade <= 13) categoria = "Juvenil A";
        else if (idade >= 14 && idade <= 17) categoria = "Juvenil B";
        else if (idade >= 18) categoria = "Sênior";
        else categoria = "Sem categoria";

        System.out.println("Categoria: " + categoria);

    }




}