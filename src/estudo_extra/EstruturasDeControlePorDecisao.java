package estudo_extra;

public class EstruturasDeControlePorDecisao {

    public static void main(String[] args) {

        double salario = 2758.33;


        if(salario < 5000) System.out.println("Pobre");

        if(salario >= 2758.33) System.out.println("Não tão pobre");



        String opcao = "teste";

        switch (opcao){
            case "teste":
                System.out.println("teste");
                break;
            default:
                System.out.println("teste2");
                break;
        }



    }
}
