package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade6 {

/*    Fa�a um Programa que leia as seguintes informa��es de um funcion�rio: matricula,
    nome, idade, sexo, endere�o, bairro e estado civil. Escreva o nome do funcion�rio.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcion�rio: ");
        String nome = scan.nextLine();
        System.out.println("Digite a matr�cula do funcion�rio: ");
        String matricula = scan.nextLine();
        System.out.println("Digite a idade do funcion�rio: ");
        String idade = scan.nextLine();
        System.out.println("Digite o sexo do funcion�rio: ");
        String sexo = scan.nextLine();
        System.out.println("Digite o endere�o do funcion�rio: ");
        String endereco = scan.nextLine();
        System.out.println("Digite o bairro do funcion�rio: ");
        String bairro = scan.nextLine();
        System.out.println("Digite o estado civil do funcion�rio: ");
        String estadoCivil = scan.nextLine();

        Funcionario func = new Funcionario(matricula, nome, idade, sexo, endereco, bairro, estadoCivil);

        System.out.println(func.toString());
    }
}

class Funcionario{

    String matricula;
    String nome;
    String idade;
    String sexo;
    String endereco;
    String bairro;
    String estadoCivil;

    public Funcionario(String matricula, String nome, String idade, String sexo, String endereco, String bairro,
                       String estadoCivil) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.bairro = bairro;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return  "=============================== \n" +
                "\t\t  Funcion�rio " + "\n" +
                "\t\t " + nome + "\n" +
                "=============================== \n" +
                " Matr�cula: " + matricula + "\n" +
                " Idade: " + idade + "\n" +
                " Sexo: " + sexo + "\n" +
                " Endere�o: " + endereco + "\n" +
                " Bairro: " + bairro + "\n" +
                " Estado Civil: " + estadoCivil + "\n";

    }
}
