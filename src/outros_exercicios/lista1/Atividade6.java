package outros_exercicios.lista1;

import java.util.Scanner;

public class Atividade6 {

/*    Faça um Programa que leia as seguintes informações de um funcionário: matricula,
    nome, idade, sexo, endereço, bairro e estado civil. Escreva o nome do funcionário.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();
        System.out.println("Digite a matrícula do funcionário: ");
        String matricula = scan.nextLine();
        System.out.println("Digite a idade do funcionário: ");
        String idade = scan.nextLine();
        System.out.println("Digite o sexo do funcionário: ");
        String sexo = scan.nextLine();
        System.out.println("Digite o endereço do funcionário: ");
        String endereco = scan.nextLine();
        System.out.println("Digite o bairro do funcionário: ");
        String bairro = scan.nextLine();
        System.out.println("Digite o estado civil do funcionário: ");
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
                "\t\t  Funcionário " + "\n" +
                "\t\t " + nome + "\n" +
                "=============================== \n" +
                " Matrícula: " + matricula + "\n" +
                " Idade: " + idade + "\n" +
                " Sexo: " + sexo + "\n" +
                " Endereço: " + endereco + "\n" +
                " Bairro: " + bairro + "\n" +
                " Estado Civil: " + estadoCivil + "\n";

    }
}
