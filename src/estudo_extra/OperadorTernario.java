package estudo_extra;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

/*      Salário maior que 2000 = bônus 10%
        Salário menor ou igual 2000 = bônus 15%*/


        System.out.println("Digite o seu Salário: ");
        double salario = scan.nextDouble();
        double bonus = salario > 2000 ? salario * 0.10 : salario * 0.15;

        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + bonus);







    }

}
