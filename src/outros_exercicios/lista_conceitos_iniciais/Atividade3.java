package outros_exercicios.lista_conceitos_iniciais;

public class Atividade3 {

/*    Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15%
    de desconto em uma venda à vista e exiba o valor a ser pago.*/

    public static void main(String[] args) {
        double valorDaMercadoria = 200;
        String totalComDesconto = String.format("%.2f", (valorDaMercadoria * 0.85));

        System.out.println("Valor total da conta: R$ " + totalComDesconto);

    }

}