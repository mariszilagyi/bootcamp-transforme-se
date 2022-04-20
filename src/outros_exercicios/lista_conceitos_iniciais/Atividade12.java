package outros_exercicios.lista_conceitos_iniciais;

public class Atividade12 {

/*    Considerando um Programa iniciado pelos atributos A = 1, B = 2, C = 3, complete-o de
    modo que ao final do Programa o conteúdo de A seja 3, de B seja 1 e de C seja 2. Use
    apenas atribuições entre variáveis.*/

    public static void main(String[] args) {

        int A = 1;
        int B = 2;
        int C = 3;
        int D = B;

        B = A;
        A = C;
        C = D;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

    }
}
