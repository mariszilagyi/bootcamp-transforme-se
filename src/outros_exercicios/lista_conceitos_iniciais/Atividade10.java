package outros_exercicios.lista_conceitos_iniciais;

import java.util.Scanner;

public class Atividade10 {

/*    Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e
    o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no
    percentual de lucro e, ainda, calcular o preço total em “R$�? entre o preço da venda e
    a quantidade. Ao final, escrever o preço de compra, o percentual de lucro, o preço da
    venda, a quantidade e o preço total.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as informações do produto: ");
        System.out.println("Código: ");
        String codigo = scan.nextLine();
        System.out.println("Descrição: ");
        String descricao = scan.nextLine();
        System.out.println("Quantidade: ");
        int quantidade = scan.nextInt();
        System.out.println("Preço de compra: ");
        double precoDeCompra = scan.nextDouble();
        System.out.println("Margem de lucro: ");
        double margemDeLucro = scan.nextDouble()/100;
        double precoDeVenda = precoDeCompra * (1 + margemDeLucro);
        double lucroPorProduto = precoDeVenda - precoDeCompra;
        double totalDeVendas = precoDeVenda * quantidade;


        String impressao = "=============================== \n" +
                    "\t\t\t Produto \n" +
                    "=============================== \n" +
                    " Código: " + codigo + "\n" +
                    " Descrição: " + descricao + "\n" +
                    " Quantidade: " + quantidade + "\n" +
                    " Preço de compra: " + String.format("%.2f",precoDeCompra) + "\n" +
                    " Margem de lucro: " + (margemDeLucro * 100) + "%" + "\n" +
                    " Preço de venda: " + String.format("%.2f",precoDeVenda)+ "\n" +
                    " Lucro por produto: " + String.format("%.2f",lucroPorProduto) + "\n" +
                    " Total de vendas: " + String.format("%.2f",totalDeVendas) + "\n";


        System.out.println(impressao);

    }




}


