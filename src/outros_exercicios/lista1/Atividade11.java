package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade11 {

/*    Faça um programa para ler o nome e o ano, mês e dia de nascimento de um cidadão.
    Calcular e informar sua idade.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o ano do seu nascimento formato AAAA (exemplo 1988): ");
        int ano = scan.nextInt();
        System.out.println("Digite o mês do seu nascimento formato MM (exemplo 02): ");
        int mes = scan.nextInt();
        System.out.println("Digite o dia do seu nascimento formato DD (exemplo 08): ");
        int dia = scan.nextInt();
        Idade idade = new Idade();

        System.out.println(nome + ", você tem " + idade.calcularIdade(dia, mes, ano) + " anos.");

    }
}

class Idade {

    public int calcularIdade(int dia, int mes, int ano) {

        int diaAtual = 16;
        int mesAtual = 3;
        int anoAtual = 2022;
        int idade = 0;

        if(mesAtual > mes || mesAtual == mes && diaAtual >= dia) idade = anoAtual - ano;
        else idade = anoAtual - ano -1;

        return idade;
    }

}

