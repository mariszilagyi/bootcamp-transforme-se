package outros_exercicios.lista_conceitos_iniciais;

import java.util.Scanner;

public class Atividade16 {

/*    Em um aeroporto, a balança de bagagem envia a informação de peso da bagagem
    desacompanhada para um computador que calcula o valor do excesso de peso com
    os seguintes parâmetros:
    Faixa de Peso da bagagem Valor a pagar por quilo em excesso
    Até 20 Kg (inclusive) 0,00
    De 20 Kg a 40 Kg (inclusive) 5.000,00
    De 40 Kg para cima ... 10.000,00*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso da bagagem (kg): ");
        double pesoDaBagagem = scan.nextDouble();
        double valorExcessoDePeso = 0;

        if(pesoDaBagagem > 20 && pesoDaBagagem <= 40){
            valorExcessoDePeso = ((int)pesoDaBagagem - 20) * 5000;
        } else if(pesoDaBagagem > 40){
            valorExcessoDePeso = ((int)pesoDaBagagem - 20) * 10000;
        }

        System.out.println("Valor do excesso da bagagem: R$ " + String.format("%.2f", valorExcessoDePeso));


    }


}