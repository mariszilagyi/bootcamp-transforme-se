package outros_exercicios.lista1;

public class Atividade1 {

	/*    Faça um programa que, dado o valor da conta de uma refeição realizada em um
    restaurante, acrescente os 10% do garçom e exiba o valor total da conta.*/

    public static void main(String[] args) {
        double valorDaConta = 200;
        String totalComComissao = String.format("%.2f", (valorDaConta * 1.10));

        System.out.println("Valor total da conta: R$ " + totalComComissao);

    }

}