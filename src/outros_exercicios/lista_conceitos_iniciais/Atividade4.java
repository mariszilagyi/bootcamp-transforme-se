package outros_exercicios.lista_conceitos_iniciais;

public class Atividade4 {

/*    Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba
    o troco a ser devolvido.*/

    public static void main(String[] args) {
        double valorDaMercadoria = 240;
        double valorPago = 220;
        double troco = valorPago - valorDaMercadoria;

        if(troco >= 0){
            System.out.println("O troco do cliente é: R$ " + String.format("%.2f", (troco)));
        }else if(troco < 0){
            System.out.println("O cliente ainda deve pagar: R$" + String.format("%.2f", (troco * -1)));
        }


    }




}