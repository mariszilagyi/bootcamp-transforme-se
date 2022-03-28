package outros_exercicios.lista2;

public class Atividade3 {

/*    Crie um array de inteiros e retorna a quantidade de elementos do array que são
    números negativos*/

    public static void main(String[] args) {
        int[] inteiros = {-3, 3, -4, -5, 7, -10, 11, -13, -14};
        int contador = 0;

        for(int inteiro: inteiros){
            if(inteiro < 0){
                contador++;
            }
        }
        System.out.println(contador);
    }

}