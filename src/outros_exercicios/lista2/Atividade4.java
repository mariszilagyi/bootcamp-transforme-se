package outros_exercicios.lista2;

public class Atividade4 {

/*    Crie um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x
    aparece no array a.*/

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5, 5};
        int x = 5;
        int contador = 0;

        for (int aa: a){
            if(aa == 5) contador++;
        }

        System.out.println(contador);
    }
}
