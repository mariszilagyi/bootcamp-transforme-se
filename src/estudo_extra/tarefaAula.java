package estudo_extra;

public class tarefaAula {

    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 5;

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;
        int divisao = valor1 / valor2;
        int modulo = valor1 % valor2;

        System.out.println("Resultado soma: " + soma);
        System.out.println("Resultado subtra��o: " + subtracao);
        System.out.println("Resultado multiplica��o: " + multiplicacao);
        System.out.println("Resultado divis�o: " + divisao);
        System.out.println("Resultado m�dulo: " + modulo);


        float nota = 8.5f;
        float frequencia = 74.0f;

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Passouuuu!!!");
        } else {
            System.out.println("N�o foi dessa vez :( ");
        }

        if (nota >= 7 || frequencia >= 75) {
            System.out.println("Passouuuu!!!");
        } else {
            System.out.println("N�o foi dessa vez :( ");
        }


    }
}
