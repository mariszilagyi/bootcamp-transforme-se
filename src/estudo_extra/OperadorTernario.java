package estudo_extra;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

/*      Sal�rio maior que 2000 = b�nus 10%
        Sal�rio menor ou igual 2000 = b�nus 15%*/


        System.out.println("Digite o seu Sal�rio: ");
        double salario = scan.nextDouble();
        double bonus = salario > 2000 ? salario * 0.10 : salario * 0.15;

        System.out.println("Sal�rio: " + salario);
        System.out.println("B�nus: " + bonus);







    }

}
